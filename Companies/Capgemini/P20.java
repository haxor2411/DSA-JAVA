package Companies.Capgemini;

public class P20 {
    public static void main(String[] args) {
        int n = 57;
        int count = 0;

        if(n == 2 || n == 3){
            System.out.println(2);
            return;
        }

        if(n % 2 == 0){
            n = n / (n / 2);
            count++;
            n = n - 1;
            count++;
        }
        else{
            n = n - 1;
            count++;
            n = n / (n / 2);
            count++;
            n = n - 1;
            count++;
        }

        System.out.println(count + " " + n);
    }
}
