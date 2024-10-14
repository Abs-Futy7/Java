import java.util.Scanner;

// Sum of the n-th row in Pascal's Triangle
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n-th row : ");
        int row = sc.nextInt();

        // The sum of the n-th row in Pascal's Triangle is 2^(n-1)

        int ans = 1 << (row - 1);
        // Using bitwise left shift (1 << (row - 1)) is equivalent to 2^(n-1)
        

        System.out.println(ans);
    }
}

