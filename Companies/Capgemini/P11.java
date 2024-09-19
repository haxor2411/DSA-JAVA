package Companies.Capgemini;

public class P11{
    public static void main(String[] args) {
        int n = 3;

        int[] dp = new int[n + 1];
        dp[1] = 2;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println(dp[n]);
        System.out.println(solve2(n));
    }

    static void solve(int n, String str){
        if(n == 0){
            System.out.println(str);
            return;
        }

        if(str.isEmpty() || str.charAt(str.length() - 1) != 'p') solve(n - 1, str + 'p');
        if(str.isEmpty() || str.charAt(str.length() - 1) != 'q') solve(n - 1, str + 'q');
    }

    static int solve2(int n){
        if(n == 1) return 2;

        int[][] baseMatrix = {{1,1},{1,0}};
        int[][] resultMatrix = powerMatrix(baseMatrix, n - 1);

        return 2 * (resultMatrix[0][0]) + (resultMatrix[0][1]);
    }

    static int[][] powerMatrix(int[][] matrix, int power){
        int[][] result = {{1,0},{0,1}};

        while(power > 0){
            if(power % 2 == 1) result = multiply(result, matrix);
            matrix = multiply(matrix, matrix);

            power /= 2;
        }

        return result;
    }


    static int[][] multiply(int[][] a, int [][] b){
        return new int[][]{{a[0][0] * b[0][0] + a[0][1] * b[1][0], a[0][0] * b[0][1] + a[0][1] * b[1][1]}, {a[1][0] * b[0][0] + a[1][1] * b[1][0], a[1][0] * b[0][1] + a[1][1] * b[1][1]}};
    }
}