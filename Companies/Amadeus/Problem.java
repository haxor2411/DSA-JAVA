package Companies.Amadeus;


public class Problem {
    public static void main(String[] args) {
        String s = "abbbbcccffg";

        String ans = "";
        int i;

        int count = 1;
        for(i = 0; i < s.length() - 1; i++){

            if(s.charAt(i) == s.charAt(i + 1)) count++;
            else{
                ans += s.charAt(i);
                if(count != 1) ans += count;
                count = 1;
            }
        }   

        if(i == s.length() - 1){
            ans += s.charAt(i);
            if(count != 1) ans += count;
        }

        System.out.println(ans);
    }
}
