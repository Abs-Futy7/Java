import java.util.Scanner;

public class SubSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String s = sc.nextLine();

        answer(s, "", 0);
    }

    static void answer(String input, String output, int idx){
        if(idx == input.length()){
            System.out.println(output);
            return;
        }
        answer(input, output + input.charAt(idx), idx+1);
        answer(input, output, idx+1);
    }
    
}
