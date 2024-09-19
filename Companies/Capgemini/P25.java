package Companies.Capgemini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class P25 {
    public static void main(String[] args) {
        String price = "203";
        int k = 2;

        if(price.length() <= k){
            System.out.println(0);
            return;
        }

        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i = 0; i < price.length(); i++) hm.put(price.charAt(i), i);

        String temp = price;

        char[] priceArr = price.toCharArray();
        Arrays.sort(priceArr);

        price = new String(priceArr);

        String ans = price.substring(0, price.length() - k);
        ArrayList<Integer> v = new ArrayList<>();

        
    }
}
