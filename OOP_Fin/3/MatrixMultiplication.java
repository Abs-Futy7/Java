import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for matrix A
        System.out.print("Enter rows and columns for Matrix A: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] A = new int[r1][c1];

        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                A[i][j] = sc.nextInt();

        // Taking input for matrix B
        System.out.print("Enter rows and columns for Matrix B: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();


        int[][] B = new int[r2][c2];

        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                B[i][j] = sc.nextInt();

        // Resultant matrix C
        int[][] C = new int[r1][c2];

        // Multiplication logic
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Printing the result
        System.out.println("Resultant Matrix C:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
