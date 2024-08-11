package CRT.BitManipulation;
public class CountSetbits {
    public static void main(String[] args) {
        int x = 15;
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < 32; i++){
            if(((x >> (i - 1)) & 1) == 1){
                count1++;
            }
        }
        System.out.println(count1);

        //OR

        while(x > 0){
            count2 += (x & 1);
            x = x >> 1;
        }
        System.out.println(count2);
    }
}
