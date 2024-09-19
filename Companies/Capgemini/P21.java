package Companies.Capgemini;

public class P21 {
    public static void main(String[] args) {
        String s = "ARABAL";
        
        int flag = 1;

        for(int i = 0; i < s.length() - 2; i += 2){
            if(s.charAt(i) != s.charAt(i + 2)){
                flag = 0;
                break;
            }
        }

        System.out.println(flag);
    }
}
