package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {2,5,9,3,1,12,6,8,7};
        System.out.println(Arrays.toString(nextGreater(arr)));
        System.out.println(Arrays.toString(arr));
    }

    static int[] nextGreater(int[] arr){
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[n];

        for(int i = n - 1; i >= 0; i--){
            System.out.println(stack);
            while(!stack.isEmpty() && stack.peek() <= arr[i]) stack.pop();
            if(stack.isEmpty()) result[i] = -1;
            else result[i] = stack.peek();

            stack.push(arr[i]);
        }
        return result;
    }
}
