package Companies.Capgemini;
// reduce the size of the string
public class P4 {
    public static void main(String[] args) {
        String s = "abbbbeeeeeffg";

        String ans = "";
        int i;
        int count = 1;
        for(i = 0 ; i < s.length() - 1; i++){
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
