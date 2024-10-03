package staticexample;

// Top-level class (outer class)
public class InnerClasses {
    
    // Static Inner Class: This is allowed because inner classes can be static.
    // A static inner class is associated with the outer class itself (InnerClasses) rather than any instance of it.
    static class Test {
        // Instance variable 'name' is not static, meaning each object of 'Test' will have its own 'name' field.
        String name;
        
        // Constructor: Initializes the 'name' field for each new 'Test' object.
        public Test(String name) {
            this.name = name;  // Assigns the passed value to the instance variable 'name'.
        }
    }
    
    /*
     * Only inner classes can be static. This means the 'Test' class can exist without needing an instance of 'InnerClasses'.
     * However, top-level (outer) classes like 'InnerClasses' itself cannot be declared static.
     * Static classes are typically used when the inner class is closely related to the outer class, but does not need access to its instance variables.
     */

    public static void main(String[] args) {
        // Creating two separate instances of the static inner class 'Test'.
        // Each object has its own copy of the 'name' instance variable.
        Test a = new Test("Hilk");     // 'a' gets its own 'name' field set to "Hilk".
        Test b = new Test("Bojack");   // 'b' gets its own 'name' field set to "Bojack".

        // These will print different values because 'name' is an instance variable, 
        // and each object has its own independent copy of it.
        System.out.println(a.name);    // Output: Hilk
        System.out.println(b.name);    // Output: Bojack
    }
}

// Note: Static top-level classes are not allowed in Java, so we can't define 'class A' as static outside 'InnerClasses'.
// For example, the following line would result in a compilation error:
// static class A { } // Not allowed

/*
 * Key Points:
 * 1. If 'Test' were a non-static inner class, you would need an instance of 'InnerClasses' to create 'Test' objects.
 *    However, since it's static, it can be instantiated without needing an 'InnerClasses' object.
 * 
 * 2. 'name' is a non-static (instance) variable. This means each object of 'Test' will have its own copy of 'name'.
 *    As a result, the two objects 'a' and 'b' print different names ("Hilk" and "Bojack").
 * 
 * 3. If 'name' were declared static, it would be shared by all instances of 'Test'. Changing the 'name' in one object
 *    would affect all instances.
 *
 * 4. Static inner classes are useful when you want a class logically grouped inside another class but don't need access
 *    to the outer class's instance fields.
 */




