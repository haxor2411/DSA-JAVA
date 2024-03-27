package Array;

import java.util.*;

public class Subtract2Arrays {
    public static void main(String[] args) {

        // input
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        for (int idx = 0; idx < n1; idx++) {
            arr1[idx] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        for(int idx = 0; idx < n2; idx++){
            arr2[idx] = sc.nextInt();
        }

        //logic
        int size = n2; // arr2 > arr1
        int res[] = new int[size];
        int p1 = n1 - 1, p2 = n2 - 1, p3 = size - 1, borrow = 0;
        while(p2 >= 0){
            int d1 = p1 < 0 ? 0 : arr1[p1];
            int d2 = p2 < 0 ? 0 : arr2[p2];
            int subtract = d2 - d1 - borrow;
            if(subtract < 0){
                subtract += 10;
                borrow  = 1;
            }
            else{
                borrow = 0;
            }
            res[p3] = subtract;
            p1--;
            p2--;
            p3--;
        }
        //display without initial zero
        boolean flag = false;
        for(int idx = 0; idx < size; idx++){
            if(res[idx] != 0){
                flag = true;
            }
            if(flag){
                System.out.print(res[idx]);
            }
        }
    }
}
