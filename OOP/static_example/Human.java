package staticexample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    // Static variable: Shared across all instances of the class.
     // This keeps track of the total population, and is incremented with each new Human created.
    static long population; // Static is not connected  to object

    static void mail(){
        System.out.println("Ninggen");
    }

    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population +=1; // In order to acces the static variable we should use class name
        Human.mail();
    }
}
