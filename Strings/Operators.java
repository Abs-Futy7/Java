package Strings;
import java.util.*;
public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // Here a is 97 and b is 98
        System.out.println("a" + "b"); // Here a is "a" and b is "b"
        

        System.out.println('a'+ 1); // 97 + 1 = 98
        System.out.println("a" + 1); // "a" + 1 = "a1"
        System.out.println((char)('a' + 4)); // 'a' + 4 = 'e'

        System.out.println("Abs" + new ArrayList<>());
        System.out.println("Abs" + new Integer(56)); //whenever we use "new" operator, it creates a new object and if this is a object it will be converted to String
        String ans = new Integer(56) + "" + new ArrayList<>();   // plus operators only work for premitive data types and String
        System.out.println(ans);
    }
}
