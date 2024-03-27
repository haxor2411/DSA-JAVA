package Array;
import java.util.*;
public class Sumof2Arrays {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        for(int idx = 0; idx < n1; idx++){
            arr1[idx] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        for(int idx = 0; idx < n2; idx++){
            arr2[idx] = sc.nextInt();
        }
        //add 2 arrays
        int size = n1 > n2 ? n1 : n2;
        int result[] = new int[size];
        int p1 = n1 - 1, p2 = n2 - 1, p3 = size - 1, carry = 0;  
        while(p1 >= 0 || p2 >= 0){
            int d1 = p1 < 0 ? 0 : arr1[p1];
            int d2 = p2 < 0 ? 0 : arr2[p2];

            int sum  = d1 + d2 + carry;
            int digit = sum % 10;
            carry = sum / 10;
            result[p3] = digit;
            p1--;
            p2--;
            p3--; 
        }
        if(carry != 0){
            System.out.print(carry);
        }
        //display
        for(int val : result){
            System.out.print(val);
        }
    }
}
