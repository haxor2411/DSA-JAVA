package TimeAndSpace;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 6;
        for(int i = 0; i <= n; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }

    static int fibonacci(int n){
        if(n == 0 || n == 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

/*
T(n) = T(n - 1) + T(n - 2) + (1)(constant time);   T(n) => time taken to calculate for n
(n - 2) < (n - 1) => T(n - 2) < T(n - 1);
T(n) = T(n - 1) + T(n - 2) < T(n - 1) + T(n - 1) + 1;
T(n) < 2T(n - 1) + 1;
2 . T(n - 1) = 4 . T(n - 2) + 2;
.
.
.
.
.
.
.
T(n) = 1 (Constant time);

On adding above eqn's

T(n) = 1 + 2 + 3 + 4 + 5 ......... n terms;
T(n) = 2 ^ n - 1;
Time Complexity = O(2^n);
*/