import java.util.Scanner; // Importing Scanner class to take input from user

public class UserInput {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);  // Always use this to take input from user
        System.out.print("Please Enter Name:");
        String name = sc.nextLine(); // Stores string input given in next line
        System.out.println("Hello, " + name);

        // integer input
        System.out.print("Please Enter Age:");
        int age = sc.nextInt(); // Stores integer input given in next line
        System.out.println("Age is : " + age);

        // float input
        System.out.print("Enter weight: ");
        float weight = sc.nextFloat();
        System.out.println("Weight is "+ weight);

        // double input
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        System.out.println("Height is "+ height);

        // char input
        System.out.print("Enter gender: ");
        char gender = sc.next().charAt(0);
        System.out.println("Gender is "+ gender);

        // boolean input
        System.out.print("Enter true or false: ");
        boolean result = sc.nextBoolean();
        System.out.println("Result is "+ result);


    }
}
