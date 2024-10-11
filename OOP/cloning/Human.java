package cloning;

// The Human class implements the Cloneable interface, allowing cloning of its instances
public class Human implements Cloneable {
    int age;  // Primitive data type
    String name;  // Reference type (String is immutable in Java, so shallow and deep copying behave similarly here)
    int[] arr;  // Array is a reference type, so it requires special handling for deep copying

    // Constructor to initialize Human objects with age and name
    public Human(int age, String name) {
        this.age = age;  // Assigning age
        this.name = name;  // Assigning name
        this.arr = new int[]{3, 4, 5, 6, 9, 1};  // Initializing an array
    }

    /*
    Shallow Copy Example (Commented Out):
    ------------------------------------
    If you uncomment the following clone method, this will perform a shallow copy.
    
    A shallow copy will duplicate primitive types like `int age`, but for reference types like `int[] arr`, it will
    copy the reference, meaning both the original object and the cloned object will point to the same array.
    */

    //    @Override
    //    public Object clone() throws CloneNotSupportedException {
    //        // This is shallow copy - only references for arrays/objects are copied, not the objects themselves
    //        return super.clone();  // Default shallow cloning provided by Object class
    //    }

    /*
    Deep Copy Example:
    ------------------
    The following clone method performs a deep copy, where the array `arr` is cloned entirely so that the original and cloned
    objects have separate copies of the array.
    */
    @Override
    public Object clone() throws CloneNotSupportedException {
        // Step 1: Perform a shallow copy using `super.clone()`, which creates a copy of primitive fields
        Human twin = (Human) super.clone();  // Creates a shallow copy (clones age and name, copies array reference)

        // Step 2: Now create a deep copy of the array to ensure it's independent from the original object
        twin.arr = new int[twin.arr.length];  // Initialize a new array for the clone

        // Step 3: Copy each element of the original array to the new array
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];  // Copy individual elements from original object to cloned object
        }

        // Return the deep-copied object
        return twin;
    }
}
