package Function;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        int ans1 = sum();
        System.out.println("Sum is " +ans1);

        //Passing the values as parameters
        int ans2 = multiply(10,20);
        System.out.println("Multiplication is " +ans2);
    }

    // returning value
    static int sum(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter another number:");
        int b = sc.nextInt();
        int sum = a+b;
        return sum;
    }

    //Passing the values as parameters
    static int multiply(int a, int b){
        int product  = a*b;
        return product;
    }
}
