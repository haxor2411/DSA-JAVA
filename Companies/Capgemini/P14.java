package Companies.Capgemini;

public class P14 {
    public static void main(String[] args) {
        // int i = 1;
        int[] arr = {1,2,3,5,6};
        // for(int j = 0; j < arr.length; j++){
        //     if(i != arr[j]){
        //         System.out.println(i);
        //         return;
        //     }
        //     i++;
        // }


        for(int i = 0; i < arr.length; i++){
            if(arr[i] + 1 == arr[i + 1]) continue;
            else {
                System.out.println(arr[i] + 1);
                break;
            }
        }
    }
}
