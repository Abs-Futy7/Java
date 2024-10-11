package cloning;

import java.util.Arrays;  // Importing Arrays to print the array in a human-readable form

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Creating an original Human object named 'kunal'
        Human kunal = new Human(34, "Kunal Kushwaha");

        /*
        // Shallow Copy Example (if you were to use the commented-out constructor):
        // This will create a new Human object using the 'kunal' reference, but this isn't a clone, it's a new object with a copy of 'kunal's data.
        Human twin = new Human(kunal);
        */

        // Deep Copy Example (Cloning 'kunal'):
        // Cloning the 'kunal' object using the deep copy method defined in the Human class
        Human twin = (Human) kunal.clone();

        // Printing the age and name of the cloned object
        System.out.println(twin.age + " " + twin.name);  // Output: 34 Kunal Kushwaha

        // Printing the array of the cloned object (it should be identical to 'kunal's array at this point)
        System.out.println(Arrays.toString(twin.arr));  // Output: [3, 4, 5, 6, 9, 1]

        // Modify the array of the cloned object to check if it affects the original array
        twin.arr[0] = 100;  // Changing the first element of the cloned object's array to 100

        // Printing the modified array of the cloned object
        System.out.println(Arrays.toString(twin.arr));  // Output: [100, 4, 5, 6, 9, 1]

        // Printing the array of the original 'kunal' object to verify that it remains unaffected
        System.out.println(Arrays.toString(kunal.arr));  // Output: [3, 4, 5, 6, 9, 1]
    }
}

