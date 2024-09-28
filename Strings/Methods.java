package Strings;
import java.util.*;
public class Methods {
    public static void main(String[] args) {
        String name = "Abs Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("     Abs   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
