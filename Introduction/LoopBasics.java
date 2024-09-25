import java.util.Scanner;

public class LoopBasics {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        if(n > 0) {
            System.out.println("Positive");
        }
        else if (n<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }
}
