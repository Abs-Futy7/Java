public class Intro2 {
    public static void main(String[] args) {
        // Class -> logical constructor
        // Object -> physical instance
        // Objects are stored in heap memory

        Student abs = new Student();
        System.out.println(abs.name);
        System.out.println(abs.roll);
        System.out.println(abs.marks);
    }

    static class Student {
        int roll;
        String name;
        float marks;

        // we need a way to add the values of the above
        // properties object by object

        // we need one word to access every object

        Student() {  // default constructor
            this.name = "Abs";
            this.roll = 1;
            this.marks = 90.5f;
        }

    }
}
