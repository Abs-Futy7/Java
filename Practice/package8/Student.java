package package8;

import java.util.ArrayList;

public class Student {
    private String name;
    private int grade;
    private ArrayList courses;

    public Student(String name, int grade){
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList();
    }

    public String getName(){
        return name;
    }

    public int getGrade(){
        return grade;
    }

    public ArrayList getCourses(){
        return courses;
    }

    public void addCourse(String course){
        courses.add(course);
    }

    public void removeCourse(String course){
        courses.remove(course);
    }

    public void printStudentDetails(){
        System.out.println("Name: " + name + " Grade: " + grade);
    }
}
