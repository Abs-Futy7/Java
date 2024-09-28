package Strings;

public class FormatString {
    public static void main(String[] args) {

        /*
         * 
         * %c - Character
         * %d - Decimal number (base 10)
         * %e - Exponential floating-point number
         * %f - Floating-point number
         * %i - Integer (base 10)
         * %o - Octal number (base 8)
         * %s - String
         * %u - Unsigned decimal (integer) number
         * %x - Hexadecimal number (base 16)
         * %t - Date/time
         * %n - Newline
         * 
         */

        // we include the newline character:
        System.out.printf("Hello, %s!%n", "Michael Scott");
        System.out.printf("Hello, %s!%n", "Jim");
        System.out.printf("Hello, %s!%n", "Dwight");


        System.out.printf("%10s\n", "stack");  // 10 spaces
    }
}
