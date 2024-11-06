/*
 Write a Java program to create a class called "Student" with a name,
 grade, and courses attributes, and methods to add and remove courses.
 */

package package8;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Carolus Vitali", 11);
        Student student2 = new Student("Nakeisha Uhuru", 10);

        System.out.println("Student Details:");
        student1.printStudentDetails();
        student2.printStudentDetails();

        System.out.println("Adding courses for " + student1.getName());
        student1.addCourse("Math");
        student1.addCourse("Science");
        System.out.println(student1.getName() + "'s courses: " + student1.getCourses());

        student1.removeCourse("Science");
        System.out.println(student1.getName() + "'s courses: " + student1.getCourses());
    }
}
