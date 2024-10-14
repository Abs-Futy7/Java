public class NoOfDigits {
    public static void main(String[] args) {
        // Given number to find the number of digits in
        int num = 10;

        // Given base of the logarithm
        int base = 2;

        // Calculate the number of digits in 'num' when represented in base 'base'

        int ans = (int)(Math.log(num) / Math.log(base)) + 1;


        System.out.println(ans);

        // Time complexity explanation:O(log(num))

    }
}

