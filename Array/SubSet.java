package Array;
import java.util.*;
public class SubSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int idx = 0; idx < n; idx++) {
            arr[idx] = sc.nextInt();
        }
        printSubset(arr);
    }
    public static void printSubset(int arr[]){
        int n = arr.length;
        int tw = (int) Math.pow(2, n);
        for(int idx = 0; idx < tw; idx++){
            int bin = binaryConv(idx);
            printSeq(arr, bin);
        }
    }
    public static int binaryConv(int n){
        int res = 0;
        int pow = 1;
        while(n > 0){
            int r = n % 2;
            res += r * pow;
            pow = pow * 10;
            n = n / 2;
        }
        return res;
    }
    public static void printSeq(int arr[], int bNum){
        int n = arr.length;
        int idx = n - 1;
        String ans = ""; 
        while(n != 0){
            int r = bNum % 10;
            bNum = bNum / 10;
            if(r == 0){
                ans = "-\t" + ans; 
            }
            else{
                ans = arr[idx] + "\t" + ans;
            }
            idx--;
            n--;
        }
        System.out.println(ans);
    }
}
