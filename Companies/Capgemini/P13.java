package Companies.Capgemini;

public class P13 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int limit = sc.nextInt();
        
    //     for (int a = 1; a <= limit; a++) {
    //         for (int b = a; b <= limit; b++) {
    //             for (int c = b; c <= limit; c++) {
    //                 if (a * a + b * b == c * c) {
    //                     System.out.println(a + " " + b + " " + c);
    //                 }
    //             }
    //         }
    //     }
        
    //     sc.close();
    // }

    public static void main(String[] args) {
        int limit = 20;

        int a = 0, b = 0, c = 0;

        int m = 2;
        while(c < limit){
            for(int n = 1; n < m; n++){
                a = m * m - n * n;
                b = 2 * m * n;
                c = m * m + n * n;

                if(c > limit) break;
                System.out.println(a + " " + b + " " + c);
            }
            m++;
        }
    }
}
