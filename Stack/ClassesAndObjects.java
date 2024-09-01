package Stack;

public class ClassesAndObjects {
    public static class Person{
        String name;
        int age;

        public String toString(){
            return name + " --> " + age;
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.name + " --> " + p1.age);
        System.out.println(p1);
    }
}
