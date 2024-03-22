package Functions;

public class MethodOverLoading {
    // method overloading
    public static int area(int side){
        return side*side;
    }
    public static int area(int len,int bre){
        return len*bre;
    }
    public static void main(String[] args) {
        System.out.println(area(15));
        System.out.println(area(9,10));
        
    }
        
}
