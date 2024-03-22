package Array;

import java.util.Scanner;

public class FindIndex {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int idx = 0; idx < n; idx++){
            a[idx] = sc.nextInt();
        }
        int d = sc.nextInt();
        int res_idx = getMatchingIndex(a, d);
        System.out.println(res_idx);
    }
    public static int getMatchingIndex(int a[], int d){
        for(int idx = 0; idx < a.length; idx++){
            if(a[idx] == d){
                return idx;
            }
        }
        return -1;
    }
}
