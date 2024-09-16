package Companies.Capgemini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Longest Increasing Subsequence 
public class P8 {
    public static void main(String[] args) {
        int[] arr = {10,9,2,5,3,7,101,18};
        printSubsequence(arr);
        print(arr);
    }

    static void printSubsequence(int[] arr){
        int n = arr.length;
        int[] dp = new int[n];
        int[] hash = new int[n];

        int lidx = -1, mlen = -1;

        Arrays.fill(dp, 1);
        Arrays.fill(hash, -1);

        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                if(arr[i] > arr[j] && dp[i] < dp[j] + 1){
                    dp[i] = dp[j] + 1;
                    hash[i] = j;
                }
            }
            if(mlen < dp[i]){
                mlen = dp[i];
                lidx = i;
            }
        }
        System.out.println(mlen);
        
        ArrayList<Integer> tmp = new ArrayList<>();
        while(lidx != -1){
            tmp.add(arr[lidx]);
            lidx = hash[lidx];
        }

        Collections.reverse(tmp);
        System.out.println(tmp);
    }



    static void print(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();

        for(int n : arr){
            int i = Collections.binarySearch(ans, n);

            if(i < 0) i = -i - 1;
            if(i == ans.size()) ans.add(n);
            else ans.set(i, n);
        }


        System.out.println(ans);
    }
}
