package Companies.Amadeus;


import java.util.HashMap;
import java.util.Map;

public class Problem2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,1,4,5,1,2};

        // int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        // for(int i : arr){
        //     min = Math.min(i, min);
        //     max = Math.max(i, max);
        // }

        // int[] res = new int[max - min + 1];
        // for(int i = 0; i < arr.length; i++){
        //     res[arr[i] - min]++;
        // }

        // for(int i = 0; i < res.length; i++) if(res[i] != 0) System.out.println(i+min + " occurs "+res[i]+" times.");
        
        Map<Integer, Integer> hm = new HashMap<>();
        
        for(int i : arr){
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }    
        for(HashMap.Entry<Integer,Integer> map : hm.entrySet()){
            if(map.getValue() != 0){
                System.out.println(map.getKey() + " occurs " + map.getValue() + " times");
            }

        }


        // Set<Integer> hs = new HashSet<>();

        // for(int i : arr){
        //     if(hs.contains(i)) {
        //         System.out.println(i);
        //         return;
        //     }    
        //     hs.add(i);
        // }


        
    }
}
