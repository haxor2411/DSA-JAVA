package DynamicProgramming;

public class Tiling1 {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(nWays(n));
        System.out.println(nWays2(n));
    }

    static int nWays(int n){
        int[] dp = new int[n + 1];
         
        dp[1] = 1; // for 2 X 1 board you can only put one tile vertically -> 1 Way
        dp[2] = 2; // for 2 X 2 board you can either put 2 tiles vertically or horizontally -> 2 Way

        for(int i = 3; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    static int nWays2(int n){
        if(n == 0) return 1;
        int f = 1, s = 2;
        for(int i = 3; i <= n; i++){
            int t = f + s;
            f = s;
            s = t;
        }
        return s;
    }
}
