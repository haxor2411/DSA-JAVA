
//Generate a number where ith and jth bits are set.
public class SetBits {
    public static void main(String[] args) {
        int i = 4; 
        int j = 2;
        int n = (1 << (i - 1)) | (1 << (j - 1));
        //double m = Math.pow(2, i - 1) + Math.pow(2, j - 1);
        System.out.println(n);
        //System.out.println(m);
    }
}
