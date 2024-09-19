package Companies.Capgemini;

public class P24 {
    public static void main(String[] args) {
        int[] arr = {11,23,-3,3,-5,-32,5,6};

        int count = 0, idx = 0;;

        for(int i : arr) if(i >= 0) count++;

        if(count % 2 == 0) idx = count / 2;
        else idx = count / 2 + 1;

        count = 0;

        for(int i : arr){
            if( i >= 0) count++;
            if(count == idx){
                System.out.println(i);
                break;
            }
        }
    }
}
