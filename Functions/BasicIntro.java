package Functions;

public class BasicIntro {
    public static void sayHello(){
        System.out.println("My name is Prabal !!");
    }
    public static int add (int v1, int v2){
        return(v1+v2);
    }
    public static boolean isEven(int num){
        return(num%2==0);
    }
    public static void main(String args[]){
        sayHello();
        System.out.println(add(11,24));
        System.out.println(isEven(24));
    }        
}
