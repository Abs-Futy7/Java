

/*Write a Java program to create a class called "Person" with a name and age attribute.
Create two instances of the "Person" class, set their attributes using the constructor,
and print their name and age. */


public class Main{
    public static void main(String[] args) {
        Person p1 = new Person("Abs", 22);
        Person p2 = new Person("Bojack", 188);

        System.out.println(p1.getName() + " " + p1.getAge());
        System.out.println(p2.getName() + " " + p2.getAge());

        p1.setAge(21);
        p2.setName("Holund");

        System.out.println(p1.getName() + " " + p1.getAge());
        System.out.println(p2.getName() + " " + p2.getAge());
    }
}

