// Binary search to find the square root of a number up to p decimal places

public class SquareRoot {
    public static void main(String[] args) {
        int n = 40; 
        int p = 3;  // The number of decimal places of precision

        System.out.println(sqrt(n, p));
    }

    static double sqrt(int n, int p) {
        int s = 0; 
        int e = n; 
        double root = 0.0; // Variable to store the final square root result
        
       
        while (s <= e) {
            int m = s + (e - s) / 2; 

            if (m * m == n) {
                return m;
            }

            if (m * m > n) {
                e = m - 1;
            } 
            else {
                s = m + 1;
                root = m; // Store the closest integer result so far
            }
        }

        // At this point, 'root' contains the integer part of the square root
        double increment = 0.1; // Increment value for each decimal place

        // Loop to refine the root value for the specified number of decimal places (p)
        for (int i = 0; i < p; i++) {
            // Increment the root value in small steps (0.1, 0.01, 0.001, ...)
            while (root * root <= n) {
                root += increment;
            }

            // After overshooting, subtract the last increment to correct the value
            root -= increment;

            // Decrease the increment for the next decimal place (e.g., from 0.1 to 0.01)
            increment /= 10;
        }

        return root; // Return the final square root with decimal precision
    }
}

