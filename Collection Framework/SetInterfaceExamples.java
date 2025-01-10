
import java.util.*;

public class SetInterfaceExamples {
    
    static void HashSetExamples(){
        // HashSet is a class that implements Set
        // It doesn't allow duplicates
        // It doesn't guarantee the order of the elements
        // It allows null elements
        HashSet<Integer> hs = new HashSet<>();
        hs.add(3);
        hs.add(5);
        hs.add(8);
        System.out.println(hs); // 3, 5, 8
        hs.add(3);
        hs.add(5);
        System.out.println(hs); // 3, 5, 8 - 3, 5 wasn't added again
        hs.remove(5);
        System.out.println(hs); // 3, 8
        hs.add(45);
        hs.add(7);
        hs.add(456);
        System.out.println(hs); // [3, 7, 8, 456, 45] - the order is not guaranteed
    }

    static void LinkedHashSetExamples(){
        // LinkedHashSet is a class that implements Set
        // It doesn't allow duplicates
        // It guarantees the order of the elements
        // It allows null elements
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(3);
        lhs.add(5);
        lhs.add(8);
        System.out.println(lhs); // 3, 5, 8
        lhs.add(3);
        lhs.add(5);
        System.out.println(lhs); // 3, 5, 8 - 3, 5 wasn't added again
        lhs.remove(5);
        System.out.println(lhs); // 3, 8
        lhs.add(45);
        lhs.add(7);
        lhs.add(456);
        System.out.println(lhs); // [3, 8, 45, 7, 456] - the order is guaranteed
    }

    public static void main(String[] args) {
        HashSetExamples();
        LinkedHashSetExamples();
    }
}
