package Companies.Capgemini;

import java.util.Arrays;

public class P27 {
    public static void main(String[] args) {
        int[] arr = {1,2,1};

        int[] ans = new int[3];

        for(int i = 0; i < 3; i++){
            for(int j = ans.length - 1; j > i; j--){
                if(arr[i] == arr[j]) {
                    ans[i] = j - i;
                    break;
                }
            }
        }


        System.out.println(Arrays.toString(ans));
    }
}
