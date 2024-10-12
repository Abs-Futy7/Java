package enums;

// Define a class named Basic that contains an enum and a main method
public class Basic {

    // Define an enum named Week which implements an interface A
    enum Week implements A {
        // These are the enum constants (days of the week)
        // Enum constants are implicitly public, static, and final.
        // This means they are constants and cannot be modified or extended.
        // Each enum constant (e.g., Monday) is internally an object of type Week.
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        // Constructor for the Week enum
        // This constructor is called once for each enum constant when it is created.
        // For example, Week.Monday will call this constructor.
        Week() {
            // 'this' refers to the current enum constant (e.g., Monday, Tuesday, etc.)
            System.out.println("Constructor called for " + this);
        }

        // Override the hello() method from interface A
        // This method will be available for each enum constant.
        // Calling hello() on any day (like Week.Monday) will execute this code.
        @Override
        public void hello() {
            System.out.println("hey how are you");
        }
        // Note: Enum constructors are not public or protected.
        // This is because enum instances are predefined (like Monday, Tuesday), and
        // we do not want to allow the creation of new enum constants at runtime.
        // Thus, the constructor is either private or default by design.
    }

    // Main method where the program starts execution
    public static void main(String[] args) {
        Week week; // Declare a variable 'week' of type Week (which refers to the enum)
        
        // Assign the enum constant 'Monday' to the variable 'week'
        // Internally, Monday is an instance of the Week enum.
        week = Week.Monday;
        
        // Call the hello() method on the enum constant 'Monday'
        // This will execute the hello() method, which prints "hey how are you"
        week.hello();

        // Iterate over all the enum constants using the values() method
        // Week.values() returns an array of all the enum constants in the order they are defined
        for (Week day : Week.values()) {
            // Print the name of each enum constant (e.g., Monday, Tuesday, etc.)
            // The 'day' variable will hold each enum constant during each iteration of the loop
            System.out.println(day);
        }

        // Print the ordinal value of the enum constant 'Monday'
        // The ordinal() method returns the position of the enum constant in its declaration (starting from 0)
        // For example, for Week.Monday, ordinal() will return 0 because Monday is the first constant in the list.
        System.out.println(week.ordinal());
    }
}

