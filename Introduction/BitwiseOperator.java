import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        // Bitwise AND
        int and = a & b;
        System.out.println("Bitwise AND : " + and);

        //Bitwise OR
        int or = a | b;
        System.out.println("Bitwise OR : " + or);

        //Bitwise XOR
        int xor = a ^ b;
        System.out.println("Bitwise XOR : " + xor);

        //Bitwise Complement
        int not = ~a;
        System.out.println("Bitwise NOT : " + not);

        //Left Shift
        int leftShift = a << 2; // Left shift by 2 means multiply by 2^2
        System.out.println("Left Shift : " + leftShift); 

        //Right Shift
        int rightShift = a >> 2; // Right shift by 2 means divide by 2^2
        System.out.println("Right Shift : " + rightShift);

    }
}
