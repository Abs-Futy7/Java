package threadoperations;

// A custom thread class that extends the Thread class
class UserThread extends Thread {
    // The run() method contains the code that the thread will execute
    public void run() {
        // Task for the custom thread
        System.out.println("this is user-defined thread.");
    }
}

public class ThreadOp {
    public static void main(String[] args) {
        // This is the starting point of the program
        System.out.println("program started..");	

        // A simple calculation is performed
        int x = 56 + 34; // Adds 56 and 34
        System.out.println("sum is " + x); // Displays the sum

        // Accessing the current thread (main thread) that is executing the program
        Thread t = Thread.currentThread(); 

        // Retrieving the name of the current thread
        String tname = t.getName(); 
        System.out.println("current running thread is " + tname);

        // Changing the name of the main thread
        t.setName("MyMain"); 
        System.out.println(t.getName()); // Displays the new thread name

        try {
            // Making the current thread (main thread) sleep for 5000 milliseconds (5 seconds)
            Thread.sleep(5000); 
        } catch (Exception e) {
            // Handles any exception that might occur during sleep
            System.out.println("An exception occurred: " + e);
        }

        // Getting and printing the unique ID of the current thread
        System.out.println(t.getId()); 

        // Creating an instance of the custom thread class
        UserThread ut = new UserThread(); 

        // Starting the custom thread
        ut.start(); // This triggers the run() method of UserThread
    }
}

