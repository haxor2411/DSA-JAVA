package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class SlidingWindowMax {
    public static void main(String[] args) {
        int[] arr = {2,9,3,8,1,7,12,6,14,4,32,0,7,19,8,12,6};
        int k = 4; //window size
        System.out.println(maxWindow(arr, k));
    }

    static int[] nextGreaterRight(int[] arr){
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];

        for(int i = n - 1; i >= 0; i--){
            while(!stack.isEmpty() && (arr[stack.peek()] <= arr[i])) stack.pop();
            if(stack.isEmpty()) res[i] = n;
            else res[i] = stack.peek();

            stack.push(i);
        }

        return res;
    }

    static ArrayList<Integer> maxWindow(int[] arr, int k){
        ArrayList<Integer> ans = new ArrayList<>();
        int[] a = nextGreaterRight(arr);
        int n = arr.length;

        int j = 0; // store index of greatest elem in window;
        for(int i = 0; i < n - k + 1; i++){
            if(j < i) j = i;
            while(a[j] < i + k) j = a[j];
            ans.add(arr[j]);
        }

        return ans;
    }
}
