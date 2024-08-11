package CRT.BitManipulation;
public class checkBit {
    public static void main(String[] args) {
        int x = 10;
        int i = 3;
        System.out.println(checkBits(x, i) ? "set" : "unset");
    }
    public static boolean checkBits(int x, int i){
        //1st Method
        return((x >> (i - 1) & 1) == 1);
        //2nd Method
        //return((((1 << (i - 1))) & x) > 0);
    }
}
