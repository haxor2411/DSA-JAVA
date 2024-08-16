package DynamicProgramming;

public class ArrangeBuilding {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(arrange(n));
        System.out.println(arrange2(n));
        System.out.println(arrange3(n));
    }

    static int arrange(int n){
        int[][] dp = new int[2][n + 1]; // Row 1 -> Building, Row 2 -> Space

        dp[0][1] = 1;
        dp[1][1] = 1;

        for(int i = 2; i <= n; i++){
            dp[0][i] = dp[1][i - 1];
            dp[1][i] = dp[1][i - 1] + dp[0][i - 1];
        }

        int ans = dp[0][n] + dp[1][n];
        return ans * ans;
    }

    static int arrange2(int n){
        int dpB[] = new int[n + 1];
        int dpS[] = new int[n + 1];

        dpB[1] = 1;
        dpS[1] = 1;

        for(int i = 2; i <= n; i++){
            dpB[i] = dpS[i - 1];
            dpS[i] = dpS[i - 1] + dpB[i - 1];
        }

        int ans = dpB[n] + dpS[n];

        return ans * ans;
    }

    static int arrange3(int n){
        if(n == 0) return 1;
        if(n == 1) return 2;

        int B = 1;
        int S = 1;

        for(int i = 2; i <= n; i++){
            int Comb = B + S;
            B = S;
            S = Comb;
        }

        int ans = B + S;
        return ans * ans;
    }
}
