package Strings;

public class Comparison {
    public static void main(String[] args) {
        String a = "Abs";
        String b = "Abs";

        //  == method: it compares the content of the string
        // checks if reference variable is pointing to same object
        System.out.println(a == b); // true


        // Now to create different objects of the same value we can use
        String c = new String("Abs");
        String d = new String("Abs");
        System.out.println(c == d); // false
        // creating these values outside the pool but in heap 


        // When u only need to check value: .equals() method
        System.out.println(c.equals(c));  // true

        System.out.println(c.charAt(0));
    }
}
