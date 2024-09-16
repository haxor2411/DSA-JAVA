package Companies.Capgemini;

import java.util.Scanner;

// Max marks in each semester
public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of sem");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 1; i <= n; i++){
            System.out.println("Enter subjects in "+ i +" semester");
            arr[i - 1] = sc.nextInt();
        }

        int[] maxMarks = new int[n];
        for(int i = 0; i < n; i++){
            int max = Integer.MIN_VALUE;
            System.out.println("Marks obtained in sem " + (i + 1));
            for(int j = 0; j < arr[i]; j++){
                int marks = sc.nextInt();
                max = max < marks ? marks : max;
            }
            maxMarks[i] = max;
        }

        sc.close();


        for(int i = 0; i < n; i++) System.out.println("Max marks in "+ (i + 1) + " sem: " + maxMarks[i]);
    }
}
