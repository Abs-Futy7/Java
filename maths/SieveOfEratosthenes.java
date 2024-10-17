/*
 The sieve of Eratosthenes is one of the most efficient ways to find
 all primes smaller than n when n is smaller than 10 million or so.
 */

 // Space Complx: O(n)
 // Time : O(n*log(log(n)))

 public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 37; // Define the upper limit (we want primes <= n)
        boolean[] primes = new boolean[n+1]; // Array to mark non-prime numbers

        sieve(n, primes); 

        System.out.println("Prime numbers up to " + n + ":");
        for(int i = 2; i <= n; i++) {
            if(!primes[i]) {
                System.out.print(i + " "); 
            }
        }
    }

    // Sieve of Eratosthenes function
    // false means number is prime
    static void sieve(int n, boolean[] primes) {
        for(int i = 2; i * i <= n; i++) { // Iterate from 2 to sqrt(n)
            if(!primes[i]) { // If i is a prime number
                for(int j = i * 2; j <= n; j += i) {
                    primes[j] = true; // Mark multiples of i as non-prime
                }
            }
        }
    }
}

