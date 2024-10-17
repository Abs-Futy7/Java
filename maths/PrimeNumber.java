public class PrimeNumber {
    public static void main(String[] args) {
        int n = 7;
        System.out.println("Prime? : "+ isPrime(n));
    }

    static boolean isPrime(int n){
        if(n<=1) return false;
        int c = 2;
        while(c*c <= n){
            if(n%c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
