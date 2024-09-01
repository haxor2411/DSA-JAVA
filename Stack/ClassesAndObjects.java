package Stack;

public class ClassesAndObjects {
    public static class Person{
        String name;
        int age;

        public String toString(){
            return name + " --> " + age;
        }

        public void saysHi(){
            System.out.println("hi " + name + " [" + age + "]");
        }
    }

    public static void swap(Person p1, Person p2){
        Person tmp = p1;
        p1 = p2;
        p2 = tmp;
    }

    public static void swap1(Person p1, Person p2){
        int age = p1.age;
        p1.age = p2.age;
        p2.age = age;

        String name = p1.name;
        p1.name = p2.name;
        p2.name = name;
    }

    public static void game1(Person p1, Person p2){
        int age = p1.age;
        p1.age = p2.age;
        p2.age = age;

        p1 = new Person();

        String name = p1.name;
        p1.name = p2.name;
        p2.name = name;

        p2 = new Person();
    }

    public static void game2(Person p1, Person p2){
        int age = p1.age;
        p1.age = p2.age;
        p2.age = age;

        p1 = new Person();
        p2 = new Person();

        String name = p1.name;
        p1.name = p2.name;
        p2.name = name;

    }

    public static void game3(Person p1, Person p2){
        int age = p1.age;
        p1.age = p2.age;
        p2.age = age;

        
        String name = p1.name;
        p1.name = p2.name;
        p2.name = name;
        
        p1 = new Person();
        p2 = new Person();
    }
    

    public static void main(String[] args) {
        // Person p1 = new Person();
        // System.out.println(p1.name + " --> " + p1.age);
        // System.out.println(p1);

        // p1.name = "Prabal";
        // p1.age = 21;
        // p1.saysHi();

        Person p1 = new Person();
        p1.name = "Prabal";
        p1.age = 22;
        Person p2 = new Person();
        p2.name = "Gupta";
        p2.age = 25;

        p1.saysHi();
        p2.saysHi();

        // swap(p1, p2); // No swapping bcoz of the func return it will remove from program stack
        // swap1(p1, p2);

        // game1(p1, p2);
        // game2(p1, p2);
        game3(p1, p2);

        p1.saysHi();
        p2.saysHi();

    }
}
