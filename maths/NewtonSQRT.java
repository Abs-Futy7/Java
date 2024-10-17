// Newton-Raphson method to calculate square root of a number

public class NewtonSQRT {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }

    static double sqrt(double n) {
        double x = n; // Initial guess for the square root (start with the number itself)
        double root;  // Variable to store the updated square root

        // Loop until the difference between successive estimates is small enough
        while (true) {
            // Newton's formula: root = 0.5 * (x + n / x)
            root = 0.5 * (x + (n / x));

            // Break if the difference between root and x is less than a small threshold (0.5)
            // This threshold controls the precision of the result
            if (Math.abs(root - x) < 0.5) {
                break; // Exit the loop when the change is minimal (converged)
            }

            x = root;
        }
        return root;
    }
}

