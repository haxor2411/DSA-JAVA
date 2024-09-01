package Stack;

public class Constructors {
    public static class Person{
        String name;
        int age;

        Person(){
            System.out.println("Default Constructor");
            name = "Sample";
            age = 10;
        }

        Person(String n, int a){
            System.out.println("Parameterized Constructor");
            this.name = n;
            this.age = a;
            System.out.println(toString());
        }

        public String toString() {return name + " --> " + age;} 
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1);

        // Person p2 = new Person("Prabal", 22);
    }
}
