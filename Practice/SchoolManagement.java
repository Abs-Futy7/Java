/*
 Write a Java program to create a class called "School" with attributes
 for students, teachers, and classes, and methods to add and remove
 students and teachers, and to create classes. 
 */

import java.util.ArrayList;

// Assuming you have basic classes for Student, Teacher, and SchClass
class Student {
    // Student class properties
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Teacher {
    // Teacher class properties
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

}

class SchClass {

    private String className;
    private Teacher teacher;
    private ArrayList<Student> students;

    public SchClass(String className, Teacher teacher) {
        this.className = className;
        this.teacher = teacher;
        this.students = new ArrayList<Student>();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }
}

class School {
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;
    private ArrayList<SchClass> schClasses;

    public School() {
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.schClasses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    public void addSchClass(SchClass schClass) {
        schClasses.add(schClass);
    }

    public void removeSchClass(SchClass schClass) {
        schClasses.remove(schClass);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public ArrayList<SchClass> getClasses() {
        return schClasses;
    }
}

public class SchoolManagement {
    public static void main(String[] args) {
        School school = new School();

        Student student1 = new Student("Mats Yatzil", 15);
        Student student2 = new Student("Karolina Ralf", 16);
        Student student3 = new Student("Felicie Anuschka", 16);
        Student student4 = new Student("Norbert Micha", 15);

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);

        Teacher teacher1 = new Teacher("Jens Amalia", "Math");
        Teacher teacher2 = new Teacher("Elise Giiwedin", "English");
        Teacher teacher3 = new Teacher("Angelika Lotta", "Science");

        school.addTeacher(teacher1);
        school.addTeacher(teacher2);
        school.addTeacher(teacher3);

        SchClass mathClass = new SchClass("Mathematics", teacher1);

        mathClass.addStudent(student1);
        mathClass.addStudent(student2);
        mathClass.addStudent(student3);
        mathClass.addStudent(student4);

        SchClass englishClass = new SchClass("English", teacher2);

        englishClass.addStudent(student1);
        englishClass.addStudent(student2);
        englishClass.addStudent(student3);

        school.addSchClass(mathClass);
        school.addSchClass(englishClass);

        // Print general school information
        System.out.println("School information:");
        System.out.println("Number of students: " + school.getStudents().size());
        System.out.println("Number of teachers: " + school.getTeachers().size());
        System.out.println("Number of classes: " + school.getClasses().size());
        System.out.println();

        // Print math class information
        System.out.println("Math class information:");
        System.out.println("Class name: " + mathClass.getClassName());
        System.out.println("Teacher: " + mathClass.getTeacher().getName());
        System.out.println("Number of students: " + mathClass.getStudents().size());
        System.out.println();

        // Print English class information
        System.out.println("English class information:");
        System.out.println("Class name: " + englishClass.getClassName());
        System.out.println("Teacher: " + englishClass.getTeacher().getName());
        System.out.println("Number of students: " + englishClass.getStudents().size());
        System.out.println();

        school.removeStudent(student1);
        school.removeTeacher(teacher2);
        school.removeSchClass(mathClass);

        // Print updated school information after removal
        System.out.println("School information after removing one student, teacher and class:");
        System.out.println("Number of students: " + school.getStudents().size());
        System.out.println("Number of teachers: " + school.getTeachers().size());
        System.out.println("Number of classes: " + school.getClasses().size());
    }
}
