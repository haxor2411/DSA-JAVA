package Companies.Capgemini;

import java.util.Scanner;

public class P26 {

    // Function to calculate the binomial coefficient C(n, k)
    public static long binomialCoeff(int n, int k) {
        if (k > n) {
            return 0;
        }
        long result = 1;
        for (int i = 0; i < k; i++) {
            result *= (n - i);
            result /= (i + 1);
        }
        return result;
    }

    // Function to calculate the number of lucky strings
    public static long countLuckyStrings(int n) {
        if (n < 3) {
            return 0;
        }

        long totalLuckyStrings = 0;

        // Iterate over possible values of y (the number of q's)
        // x will automatically be determined by x = n - 2 - y
        for (int y = 0; y <= (n - 2) / 2; y++) {
            int x = n - 2 - y;
            if (x > y) {
                totalLuckyStrings += binomialCoeff(n - 2, y);
            }
        }

        return totalLuckyStrings;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the string (n): ");
        int n = scanner.nextInt();

        long result = countLuckyStrings(n);
        System.out.println("Number of lucky strings of length " + n + " : " + result);
    }
}

