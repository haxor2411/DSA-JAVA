package Companies.Capgemini;

import java.util.HashSet;

/*we need to count the occurrences of each character
in the string. If the occurrence of a character is
Less than 2, we need to treat it as having occurred
2 times instead. After modifying the counts in this way,
the task is to calculate the total number of occurrences
and print the result. */
public class P6 {
    public static void main(String[] args) {
        String s = "facetious";
        HashSet<Character> hs = new HashSet<>();
        int count = 0;

        for(char c : s.toCharArray()){
            if(hs.contains(c)) count++;
            else{
                count += 2;
                hs.add(c);
            }
        }

        System.out.println(count);
    }
}
