package Companies.Capgemini;

import java.util.Arrays;

//Merge sorted arrays
public class P16 {
    public static void main(String[] args) {
        int[] a = {1,3,5};
        int[] b = {2,4,6,8};

        int[] result = new int[a.length + b.length];

        int p1 = 0, p2 = 0, p3 = 0;

        while(p1 < a.length && p2 < b.length){
            if(a[p1] < b[p2]) result[p3++] = a[p1++];
            else result[p3++] = b[p2++];
        }

        while(p1 < a.length) result[p3++] = a[p1++];
        while(p2 < b.length) result[p3++] = b[p2++];

        System.out.println(Arrays.toString(result));
    }
}
