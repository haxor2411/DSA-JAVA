//Generate a number with i bits set followed by j bit unset.
public class IbitsSet {
    public static void main(String[] args) {
        int i = 4;
        int j = 4;
        int answer = ((1 << i) - 1) << j;
        System.out.println(answer);

        //OR

        int res = 0;
        while(i > 0){
            res = res | (1 << (j + i - 1));
            i--; 
        }   
        System.out.println(res);

        //OR

        int m = 4;
        int n = 4;
        int result = 0;
        for(int k = m; k < m + n; k++){
            result = result | (1 << k);
        }
        System.out.println(result);
    }
}
