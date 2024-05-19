import java. util.*;
// Name of class must be Main and it should not be public
public class x{
    public static void main(String args[] ) throws Exception {
        // Write your code here:
        String arr[] = {"Sunny", "Rainy", "Cloudy"};
        Scanner sc = new Scanner(System. in);
        String str = sc.next();
        for(int idx = 0; idx < arr.length; idx++){
            if(arr[idx].equals(str)){
                int index = (idx + 1) % arr.length;
                System.out.println(arr[index]);
                break;
            }
        }       
    }    
}
