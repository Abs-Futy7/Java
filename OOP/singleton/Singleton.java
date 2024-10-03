package singleton;

/*
 * A Singleton class is a design pattern in which a class is designed
 * to have only one instance throughout the application's lifetime.
 * The primary goal of the Singleton pattern is to ensure that only
 * a single instance of the class is created, and this instance is
 * globally accessible across the entire application.
 */

public class Singleton {

    // Step 1: Private Constructor
    /*
     * The constructor is marked as private to prevent external classes from
     * creating a new instance using the 'new' keyword.
     * This ensures that the class controls the instantiation process
     * and only one instance can be created.
     */
    private Singleton() {
        // Private constructor prevents instantiation from other classes.
    }

    // Step 2: Static variable to hold the single instance of the class.
    /*
     * A private static variable 'instance' of type Singleton is declared.
     * This will hold the single instance of the Singleton class.
     * Initially, it is set to null, meaning no instance is created yet.
     */
    private static Singleton instance;

    // Step 3: Public static method to provide global access to the instance.
    /*
     * The public static method 'getInstance()' provides global access to the
     * single instance of the Singleton class. If an instance has already been
     * created, it returns that instance. Otherwise, it creates the instance
     * the first time this method is called.
     */
    public static Singleton getInstance() {
        // Check whether an instance already exists.
        // If 'instance' is null, this means no instance has been created yet.
        if (instance == null) {
            // Step 4: Create a new Singleton instance if not already created.
            instance = new Singleton();
        }
        // Return the single instance of the class.
        return instance;
    }
}