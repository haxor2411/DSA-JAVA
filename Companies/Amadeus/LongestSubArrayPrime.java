package Companies.Amadeus;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LongestSubArrayPrime {

    static Set<Integer> allPrimes = new HashSet<>();

    static void simpleSieve(int limit, ArrayList<Integer> prime){
        boolean[] mark = new boolean[limit + 1];

        for(int i = 2; i <= limit; i++){
            if(mark[i] == false){
                prime.add(i);
                for(int j = i; j <= limit; j += i) mark[j] = true;
            }
        }

    }

    static void primesinRange(int low, int high){
        int limit = (int) Math.floor(Math.sqrt(high)) + 1;
        ArrayList<Integer> prime = new ArrayList<>();

        simpleSieve(limit, prime);

        int n = high - low + 1;

        boolean[] mark = new boolean[n + 1];

        for(int i = 0; i < prime.size(); i++){
            int lowLimit = (int) Math.floor((double) low / (int) prime.get(i));
            lowLimit *= (int) prime.get(i);

            if(lowLimit < low) lowLimit += (int) prime.get(i);
            if(lowLimit == (int) prime.get(i)) lowLimit += (int) prime.get(i);

            for(int j = lowLimit; j <= high; j += (int) prime.get(i)) mark[j - low] = true;
        }

        for(int i = low; i <= high; i++) if(!mark[i - low]) allPrimes.add(i);
    }

    static int maxPrimesSubArray(int[] arr, int n){
        int curr_max = 0, max_so_far = 0;

        for(int i = 0; i < n; i++){
            if(!allPrimes.contains(arr[i])) curr_max = 0;
            else{
                curr_max++;
                max_so_far = Math.max(curr_max, max_so_far);
            }
        }

        return max_so_far;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,3,29,11,7,8,9};
        int n = arr.length;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            min = min > arr[i] ? arr[i] : min;
            max = max < arr[i] ? arr[i] : max;
        }

        primesinRange(min, max);
        System.out.println(allPrimes);
        System.out.println(maxPrimesSubArray(arr, n));
    }
}
