package generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunction {
    public static void main(String[] args) {
        // Lambda Function Explanation:
        // A lambda function is a compact way to implement an interface with a single abstract method
        // It allows you to pass functionality as a method parameter or implement behavior directly in the code
        
        // Create an ArrayList of Integers and populate it with values 1 to 5
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }

        // Using Lambda Expression with forEach:
        // We use the lambda (item) -> System.out.println(item * 2) as a simplified way of writing an anonymous function
        // that processes each element of the ArrayList.
        // This lambda multiplies each item by 2 and prints the result.
        // arr.forEach((item) -> System.out.println(item * 2));

        // Alternatively, defining a lambda expression using the Consumer functional interface
        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        arr.forEach(fun);

        // Lambda Expressions for Arithmetic Operations:
        // The Operation functional interface is implemented using lambda expressions.
        // Each lambda here takes two integers and performs an operation (sum, product, or subtraction).
        Operation sum = (a, b) -> a + b;   // Lambda for addition
        Operation prod = (a, b) -> a * b;  // Lambda for multiplication
        Operation sub = (a, b) -> a - b;   // Lambda for subtraction

        // Create an instance of LambdaFunction class
        LambdaFunction myCalculator = new LambdaFunction();

        // Perform operations using the operate method and print results
        System.out.println(myCalculator.operate(5, 3, sum));   // Perform 5 + 3
        System.out.println(myCalculator.operate(5, 3, prod));  // Perform 5 * 3
        System.out.println(myCalculator.operate(5, 3, sub));   // Perform 5 - 3
    }

    // Method to perform operation based on the Operation interface passed as parameter
    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);  // Calls the operation method of Operation interface based on the lambda expression
    }
}

// Functional interface with a single abstract method 'operation'
// This interface is used to define the behavior of arithmetic operations
interface Operation {
    int operation(int a, int b);  // Method to perform an operation on two integers
}

