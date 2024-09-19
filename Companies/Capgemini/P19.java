package Companies.Capgemini;

import java.util.HashMap;

public class P19 {
    public static void main(String[] args) {
        String s = "sssxiw";

        HashMap<Character, Integer> hm = new HashMap<>();

        for(char c : s.toCharArray()) hm.put(c, hm.getOrDefault(c, 0) + 1);

        for(char c : s.toCharArray()) if(hm.get(c) == 1) System.out.println(c);

        System.out.println(hm);
    }
}
