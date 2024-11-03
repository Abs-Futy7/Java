package package5;

public class Employee {
    private String name;
    private String title;
    private double salary;

    public Employee(String name, String title, double salary){
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public String getTitle(){
        return title;
    }

    public double getSalary(){
        return salary;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void raiseSalary(double percentage){
        salary = salary + salary * percentage / 100;
    }

    public void printEmployeeDetails(){
        System.out.println("Name : " + name);
        System.out.println("Title : " + title);
        System.out.println("Salary : " + salary);
    }
}


