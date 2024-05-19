import java. util.*;
// Name of class must be Main and it should not be public
// public class x{
//     public static void main(String args[] ) throws Exception {
//         // Write your code here:
//         String arr[] = {"Sunny", "Rainy", "Cloudy"};
//         Scanner sc = new Scanner(System. in);
//         String str = sc.next();
//         for(int idx = 0; idx < arr.length; idx++){
//             if(arr[idx].equals(str)){
//                 int index = (idx + 1) % arr.length;
//                 System.out.println(arr[index]);
//                 break;
//             }
//         }       
//     }    
// }


public class x{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int[] dp = new int[n + 1];
        // System.out.println(ClimbstairsRecursive(n));
        // System.out.println(ClimbstairsMemo(n, dp));
        // System.out.println(ClimbStairsTab(n));
        int moves[] = new int[n];
        for(int idx = 0; idx < n; idx++){
            moves[idx] = sc.nextInt();
        }
        System.out.println(ClimbStairsVar(n, moves));
        System.out.println(ClimbStairMin(n, moves));

    }
    public static int ClimbstairsRecursive(int n){
        if(n == 0){
            return 1;
        }
        int tways = 0;
        if(n - 1 >= 0){
            tways += ClimbstairsRecursive(n - 1);
        }
        if(n - 2 >= 0){
            tways += ClimbstairsRecursive(n - 2);
        }
        if(n - 3 >= 0){
            tways += ClimbstairsRecursive(n - 3);
        }
        return tways;
    }


    public static int ClimbstairsMemo(int n, int[] dp){
        if(n == 0){
            return dp[n] = 1;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        int tways = 0;
        if(n - 1 >= 0){
            tways += ClimbstairsMemo(n - 1, dp);
        }
        if(n - 2 >= 0){
            tways += ClimbstairsMemo(n - 2, dp);
        }
        if(n - 3 >= 0){
            tways += ClimbstairsMemo(n - 3, dp);
        }
        return dp[n] = tways;
    }



    public static int ClimbStairsTab(int n){
        int[] dp = new int[n + 1];
        for(int idx = 0; idx <= n; idx++){
            if(idx == 0){
                dp[idx] = 1;
            }
            else if(idx == 1){
                dp[idx] += dp[idx - 1];
            }
            else if(idx == 2){
                dp[idx] = dp[idx - 1] + dp[idx - 2];
            }
            else{
                dp[idx] = dp[idx - 1] + dp[idx - 2] + dp[idx - 3];
            }
        }
        return dp[n];
    }


    public static int ClimbStairsVar(int n, int[] moves){
        int dp[] = new int[n + 1];
        for(int idx = n; idx >= 0; idx--){
            if(idx == n){
                dp[idx] = 1;
            }
            else{
                int maxJump = moves[idx];
                for(int jump = 1; jump <= maxJump && idx + jump <= n; jump++){
                    dp[idx] += dp[idx + jump];
                }
            }
        }
        return dp[0];
    }


    public static int ClimbStairMin(int n, int[] moves){
        int dp[] = new int[n + 1];
        dp[n] = 0;
        for(int i = n - 1; i >= 0; i--){
            if(moves[i] > 0){
                int min_move = Integer.MAX_VALUE;
                for(int jmp = 1; jmp <= moves[i] && jmp + i <= n; jmp++){
                    min_move = Math.min(min_move, dp[jmp + i] + 1);
                }
                dp[i] = min_move;
            }
        }
        return dp[0];
    }
}
