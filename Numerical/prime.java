package Numerical;
//import java.util.Scanner;
public class prime{
    
    public static void main(String args[]){
        long startTime = System.currentTimeMillis();
        //Scanner sc = new Scanner(System.in);
        boolean flag = true;
        long num = 59;
        for(long i = 2;i*i<=num;i++){
            if(num % i ==0){
                flag = false;
                break;
            }
        }
        if(flag == true){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
        
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        System.out.println("Time Taken :: "+timeElapsed+"ms");
    }
}