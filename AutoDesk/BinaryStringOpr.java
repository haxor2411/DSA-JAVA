package AutoDesk;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryStringOpr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binaryString = sc.nextLine();
        int n = sc.nextInt();
        String[] requests = new String[n];
        for(int idx = 0; idx < n; idx++){
            requests[idx] = sc.next();
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(String str : requests){
            if(str.contains(":")){
                String[] func = str.split(":");
                arr.add(countFunc(binaryString, Integer.parseInt(func[1])));
            }
            else{
                binaryString = flipFunc(binaryString);
            }
        }
        System.out.println(arr);
    }

    public static int countFunc(String binaryString, int indx){
        int count = 0;
        if(indx >=0 && indx < binaryString.length()){
            for(int idx = 0; idx < indx + 1; idx++){
                if(binaryString.charAt(idx) == '1'){
                    count++;
                }
            }
        }
        return count;
    }

    public static String flipFunc(String binaryString){
        char[] arr = binaryString.toCharArray();
        for(int idx = 0; idx < arr.length; idx++){
            if(arr[idx] == '1'){
                arr[idx] = '0';
            }
            else{
                arr[idx] = '1';
            }
        }
        return new String(arr);
    }
}