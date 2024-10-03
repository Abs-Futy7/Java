public class Intro {
    public static void main(String[] args) {
        // Class -> logical constructor
        // Object -> physical instance
        // Objects are stored in heap memory
       
        Student abs = new Student();
        abs.roll = 1;
        abs.name = "Kunal";
        abs.marks = 90.5f;

        System.out.println(abs.roll);
        System.out.println(abs.name);
        System.out.println(abs.marks);

    }

    static class Student {
        int roll;
        String name;
        float marks;

    }
}
