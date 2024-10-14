import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = sc.nextInt();

        boolean ans = (n & (n-1)) == 0;

        System.out.println(ans);
    }
}
        // Check if the given number is a power of two
        // A number is a power of two if it has only one '1' bit in its binary representation
        // The expression (n & (n - 1)) == 0 checks this:
        // - For a power of two, subtracting 1 flips all the bits after the rightmost '1' bit in n.
        // - Performing (n & (n - 1)) results in 0 only if n is a power of two, because no '1' bits remain.
        // - Additionally, n should not be 0 (since 0 is not a power of two)
