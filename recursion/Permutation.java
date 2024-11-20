import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String input = sc.nextLine();

        permute(input.toCharArray(), 0);
    }

    static void permute(char[] input, int idx) {
        if (idx == input.length - 1) {
            System.out.println(new String(input));
            return;
        }

        for (int i = idx; i < input.length; i++) {
            swap(input, idx, i); // Swap the current character with the character at index i
            permute(input, idx + 1); // Recursively permute the rest of the string
            swap(input, idx, i); // Backtrack: Undo the swap
        }
    }

    static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

