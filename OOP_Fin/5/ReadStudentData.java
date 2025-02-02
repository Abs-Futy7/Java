import java.io.*;
import java.util.ArrayList;

class Student implements Serializable {
    int id;
    String name;
    double marks;

    // Constructor
    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

public class ReadStudentData {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Step 1: Read objects from the file
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("StudentInformation.dat"))) {
            while (true) {
                try {
                    Student s = (Student) in.readObject();
                    students.add(s);
                } catch (EOFException e) { // End of file reached
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Step 2 & 3: Check pass condition and print ID & Name
        System.out.println("Students who passed:");
        for (Student s : students) {
            if (s.marks >= 50) {
                System.out.println("ID: " + s.id + ", Name: " + s.name);
            }
        }
    }
}
