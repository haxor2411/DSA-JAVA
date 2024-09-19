package Companies.Capgemini;

import java.util.ArrayList;

public class P10 {
    public static void main(String[] args) {
        int n = 5;
        int a = 3;
        int b = 2;

        solve(n, a, b);
    }

    static void solve(int n, int a, int b){
        ArrayList<Integer> subseq1 = new ArrayList<>();
        ArrayList<Integer> subseq2 = new ArrayList<>();

        int totalSum = (n * (n + 1)) / 2;

        if (totalSum * b % (a + b) != 0) {
            System.out.println(-1);
            return;
        }

        int targetSum1 = (totalSum * a) / (a + b);
        int sum1 = 0;

        for (int i = n; i > 0; i--) {
            if (sum1 + i <= targetSum1) {
                subseq1.add(i);
                sum1 += i;
            } else {
                subseq2.add(i);
            }
        }

        if (sum1 == targetSum1) {
            // System.out.println("Subsequence 1: " + subseq1);
            // System.out.println("Subsequence 2: " + subseq2);
            System.out.println(sum1 + " " + (totalSum - sum1));
        } else {
            System.out.println(-1);
        }
    }
}
