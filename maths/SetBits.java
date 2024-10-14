/*
 * The number 13 in binary is 1101.
 * Here, the set bits are the 1s in the binary representation, so 13 has 3 set bits.
   The number 7 in binary is 111. It has 3 set bits.
 */

 public class SetBits {
    public static void main(String[] args) {
        int n = 13;
        int cnt = 0;

        while(n > 0){
            // Check if the least significant bit (rightmost bit) is 1
            if((n & 1) == 1){
                // If the current bit is 1, increment the count
                cnt++;
            }
            // Right shift n by 1 to check the next bit (equivalent to dividing by 2)
            n = n >> 1;
        }
        System.out.println(cnt);
    }
}

