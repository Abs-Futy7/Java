import java.util.*;
public class ListInterfaceExamples {

    static void ArrayListsExamples(){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l); // 1, 2, 3
        System.out.println(l.get(1)); // 2
        l.set(1, 10);
        System.out.println(l); // 1, 10, 3
        System.out.println(l.contains(10)); // true
    }

    static void LinkedListsExamples(){
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l); // 1, 2, 3
        System.out.println(l.get(1)); // 2
        l.set(1, 10);
        System.out.println(l); // 1, 10, 3
        System.out.println(l.contains(10)); // true
    }

    static void StackExamples(){
        Stack<String> l = new Stack<>();
        l.add("Abs");
        l.add("Futy");
        l.add("7");
        System.out.println(l); // Abs, Futy, 7
        System.out.println(l.peek()); // 7
        System.out.println(l.pop()); // 7
        System.out.println(l); // Abs, Futy
        System.out.println(l.search("Futy")); // 1
        System.out.println(l.empty()); // false
    }

    public static void main(String[] args) {
        ArrayListsExamples();
        LinkedListsExamples();
        StackExamples();
    }
}
