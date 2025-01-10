
import java.util.*;

public class MapInterfaceExamples {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.put(1, "One");
        m.put(2, "Two");
        m.put(3, "Three");
        System.out.println(m); // {1=One, 2=Two, 3=Three}
        System.out.println(m.get(2)); // Two
        System.out.println(m.containsKey(3)); // true
        System.out.println(m.containsValue("Four")); // false

        m.put(2, "Dos");
        System.out.println(m); // {1=One, 2=Dos, 3=Three} - 2 was updated

        System.out.println(m.keySet()); // [1, 2, 3]
        System.out.println(m.values()); // [One, Dos, Three]

        // Iterating over the keys in the map
        for(Integer key : m.keySet()){
            System.out.println(key);
        }

        // Iterating over the values in the map
        for(String value : m.values()){
            System.out.println(value);
        }
    }
}
