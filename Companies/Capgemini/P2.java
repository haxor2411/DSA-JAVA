package Companies.Capgemini;
// factors of the number
public class P2 {
    public static void main(String[] args) {
        int n = 0;
        if(n == 0){
            System.out.println("No factors");
            return;
        }
        n = (n < 0) ? -1 * n : n;
        for(int i = 1; i <= n; i++) if(n % i == 0) System.out.print(i + " ");
    }
}
