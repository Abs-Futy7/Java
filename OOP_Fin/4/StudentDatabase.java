import java.util.Scanner;

// Custom Exception for Student Not Found
class StudentNotFoundException extends Exception {
    StudentNotFoundException(String name) {
        super("Student with name '" + name + "' not found.");
    }
}

// Student Class
class Student {
    String name;
    int age;
    String nationality;
    String address;

    Student(String name, int age, String nationality, String address) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.address = address;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Nationality: " + nationality + ", Address: " + address;
    }
}

// Database Class
public class StudentDatabase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating an array of students
        Student[] students = {
            new Student("Alice", 20, "USA", "New York"),
            new Student("Bob", 22, "UK", "London"),
            new Student("Charlie", 21, "India", "Delhi")
        };

        // Query the database
        System.out.print("Enter student name to search: ");
        String queryName = sc.nextLine();
        try {
            Student found = searchStudent(students, queryName);
            System.out.println("Student Found: " + found);
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }

    // Search Method
    public static Student searchStudent(Student[] students, String name) throws StudentNotFoundException {
        for (Student s : students) {
            if (s.name.equalsIgnoreCase(name)) {
                return s;
            }
        }
        throw new StudentNotFoundException(name);
    }
}
