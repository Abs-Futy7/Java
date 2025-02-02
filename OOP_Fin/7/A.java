/*Implementing String Manipulation Methods in Java
    Requirements:
        putFront(char c) → Add character at the beginning.
        putBehind(char c) → Add character at the end.
        pop(int idx) → Remove character at a given index.
 */

class StringManipulator {
    private StringBuilder str;

    // Constructor to initialize the string
    public StringManipulator(String s) {
        this.str = new StringBuilder(s);
    }

    // Adds a character at the beginning
    public void putFront(char c) {
        str.insert(0, c);
    }

    // Adds a character at the end
    public void putBehind(char c) {
        str.append(c);
    }

    // Removes a character from a specific index
    public void pop(int idx) {
        if (idx >= 0 && idx < str.length()) {
            str.deleteCharAt(idx);
        } else {
            System.out.println("Invalid index!");
        }
    }

    // Display the string
    public void display() {
        System.out.println("Current String: " + str);
    }

    public static void main(String[] args) {
        StringManipulator sm = new StringManipulator("hello");

        sm.putFront('A');  // Adds 'A' at the start
        sm.display();  // Output: Ahello

        sm.putBehind('Z'); // Adds 'Z' at the end
        sm.display();  // Output: AhelloZ

        sm.pop(1); // Removes 'h'
        sm.display();  // Output: AelloZ

        sm.pop(10); // Invalid index
    }
}

