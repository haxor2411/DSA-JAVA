package Companies.Capgemini;

import java.util.HashSet;

public class P15 {
    public static void main(String[] args) {
        String s = "abcabcdbbabcdefgh";

        int max  = -1;
        HashSet<Character> hs = new HashSet<>();
        int start = 0;

        for(int i = 0; i < s.length(); i++){
            if(hs.contains(s.charAt(i))){
                while(s.charAt(start) != s.charAt(i)){
                    hs.remove(s.charAt(start));
                    start++;
                }
                start++;
            }
            hs.add(s.charAt(i));
            max = Math.max(max, i - start + 1);
        }

        System.out.println(max);
        System.out.println(start);
        System.out.println(hs);
    }
}
