package staticexample;

public class Main {
    public static void main(String[] args) {
        // Creating two instances of the Human class
        Human abs = new Human(22, "ABS", 0, false);
        Human jack = new Human(44, "Jackshon", 10000, true);
        
        
        // Accessing static variable via object reference (Not recommended, though it works)
        // This will print the same value for both because 'population' is a static variable.
        System.out.println(abs.population);
        System.out.println(jack.population);
        
        
        // Best practice: Access static variables through the class name to make it clear
        // that 'population' belongs to the class itself, not to the individual instances.
        System.out.println(Human.population); // Correct and recommended way to access static variables
    }
}
/*
 WHen a member is called static it can be accessed before any of the object of the class created and without refering to the object created.

 **** Why is "main" declared as static? ****

 A static method belongs to the class itself, not to any particular object of the class. This means the JVM can call main without depending on object creation, which is crucial since main is the first method executed.
 
 Declaring main as static allows the JVM to call it without needing to create an instance of the class. If main were not static, the JVM would have to instantiate the class first, but it wouldn't know how to do this since there is no running code yet to create objects.


 *** Staic belongs to the class, not object ***
 */