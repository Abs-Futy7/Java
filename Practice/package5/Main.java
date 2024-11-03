/*
Write a Java program to create a class called "Employee" with a name, job title, and salary attributes,
and methods to calculate and update salary.
 */

package package5;
public class Main {
    public static void main(String[] args) {
        Employee em1 = new Employee("Abs", "Manager", 60000);
        Employee em2 = new Employee("Bojack", "Jr. Manager", 20000);

        System.out.println("\nEmployee Details:");

        em1.printEmployeeDetails();
        em2.printEmployeeDetails();

        em1.raiseSalary(4);

        em1.printEmployeeDetails();

    }
}
