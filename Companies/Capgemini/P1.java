package Companies.Capgemini;
// sum of all divisors from 1 to n;
public class P1{
    public static void main(String[] args) {
        int n = 12;

        int sum = 0;

        for(int i = 1; i <= n; i++) if(n % i == 0) sum += i;

        System.out.println(sum);
    }
}