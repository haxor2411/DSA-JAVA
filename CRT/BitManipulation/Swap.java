package CRT.BitManipulation;
public class Swap {
    public static void main(String[] args) {
        int a = 10; 
        int b = 20;
        int c = a ^ b;
        a = c ^ a;
        b = c ^ b;

        //OR

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a +" "+ b);
    }
}
