package Stack;

import java.util.Stack;

public class CelebrityProblem {
    public static void main(String[] args) {
        int n = 4;
        int[][] person = {{0,0,0,0},{1,0,1,1},{1,1,0,1},{1,1,1,0}};
        System.out.println(isCelebrity(n, person));
    }

    static int isCelebrity(int n, int[][] arr){
        Stack<Integer> person = new Stack<>();
        for(int i = 0; i < n; i++) person.push(i);

        while(person.size() != 1){
            int person2 = person.pop();
            int person1 = person.pop();

            if(arr[person1][person2] == 1) person.push(person2);
            else person.push(person1);
        }

        int idx = person.pop();

        for(int col = 1; col < n; col++) if(arr[idx][col] == 1 && col != idx) return -1;
        for(int row = 0; row < n; row++) if(arr[row][idx] == 0 && row != idx) return -1;


        return idx;
    }
}
