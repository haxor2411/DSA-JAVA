public class evenodd {
    public static void main(String[] args) {
        int x = 45;
        XORfunc(x);
        ANDfunc(x);
        ORfunc(x);
    }
    public static void XORfunc(int x){
        if((x ^ 1) == (x - 1)){
            System.out.println("odd");
        }
        else if((x ^ 1) == (x + 1)){
            System.out.println("even");
        }
    }
    public static void ANDfunc(int x){
        if((x & 1) == 1){
            System.out.println("odd");
        }
        else if((x & 1) == 0){
            System.out.println("even");
        }
    }
    public static void ORfunc(int x){
        if((x | 1) == x){
            System.out.println("odd");
        }
        else if((x | 1) == x + 1){
            System.out.println("even");
        }
    }
}
