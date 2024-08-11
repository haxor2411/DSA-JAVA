package TimeAndSpace;

public class LinearSearch {
    public static void main(String[] args) {
        int target = 10;
        int[] arr = {5,6,11,4,98,56,41,11,0};

        for(int i : arr){
            if(i == target){
                System.out.println("true");
                return;
            }   
        }

        System.out.println("false");
    }
}
