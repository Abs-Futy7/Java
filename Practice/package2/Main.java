/*Write a Java program to create a class called "Dog" with a name and breed attribute.
Create two instances of the "Dog" class, set their attributes using the constructor
and modify the attributes using the setter methods and print the updated values. */


package package2;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("Kukur", "Dhakaiya");
        Dog d2 = new Dog("Kukrr", "Stray");

        System.out.println(d1.getName() + " " + d1.getBreed());
        System.out.println(d2.getName() + " " + d2.getBreed());

        d1.setName("Thomas");
        d2.setBreed("Barbados");

        System.out.println();

        System.out.println(d1.getName() + " " + d1.getBreed());
        System.out.println(d2.getName() + " " + d2.getBreed());
    }
}
