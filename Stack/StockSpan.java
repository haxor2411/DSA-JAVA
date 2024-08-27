package Stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr = {2,5,9,3,1,12,6,8,7};
        System.out.println(Arrays.toString(nextGreaterLeft(arr)));
    }

    static int[] nextGreaterLeft(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && (arr[stack.peek()] <= arr[i])) stack.pop();
            if(stack.isEmpty()) result[i] = -1;
            else result[i] = stack.peek();

            stack.push(i);
        }

        for(int i = 0; i < n; i++) result[i] = i - result[i];
        return result;
    }
}
