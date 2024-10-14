public class Power {
    public static void main(String[] args) {
        int base = 6; 
        int power = 3; 
        int ans = 1;

        // Fast exponentiation (Exponentiation by Squaring)
        while(power > 0){
            // Check if the current power is odd
            if((power & 1) == 1){
                // If power is odd, multiply the result by the current base
                ans = ans * base;
            }
            // Square the base for the next step
            base *= base;
            // Right shift the power by 1 (equivalent to dividing by 2)
            power = power >> 1;
        }


        System.out.println(ans);
    }
}

