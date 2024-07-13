//Find the unique element if every element is repeated 2 times except one elem
public class FindUniqueElem {
    public static void main(String[] args) {
        int[] input = {1, 2, 2, 3, 4, 4, 5, 5, 6, 6 };
        int ans = 0;
        for(int i : input){
            ans ^= i;
        }
        System.out.println(ans);
        System.out.println("_______________________________________");

        //BRUTEFORCE

        for(int i = 0; i < input.length; i++){
            int flag = 0;
            for(int j = 0; j < input.length; j++){
                if(i != j && input[i] == input[j]){
                    flag++;
                    break;
                }
            }    
            System.out.print(flag == 0 ? input[i] + " " : "");
        }

    }
}
