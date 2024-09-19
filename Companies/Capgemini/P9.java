package Companies.Capgemini;

public class P9 {
    public static void main(String[] args) {
        String str1 = "gf";
        String str2 = "fg";

        System.out.println(solve(str1, str2));
    }

    static String solve(String a, String b){
        int[] arr = new int[26];

        for(char c : a.toCharArray()) arr[c - 'a']++;
        for(char c : b.toCharArray()) arr[c - 'a']--;

        boolean flag = false;
        for(int i = 0; i < arr.length; i++) if(arr[i] != 0) flag = true;

        if(flag) return "0";
        else{
            String ans = "";
            int n = a.length();

            while(n > 0 || n > 1){
                ans += n % 2;
                n = n / 2;
            }
            String rev = "";
            for(int i = ans.length() - 1; i >= 0; i--) rev += ans.charAt(i);

            return rev;
        }
    }
}
