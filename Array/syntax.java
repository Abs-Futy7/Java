package Arrays;
import java.util.*;
public class syntax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //store 5 roll number
        // All elements of array should be of same type
        int[] arr = new int[5];
        // input using loops
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = input.nextInt();
        }

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        // or

        System.out.println(Arrays.toString(arr));

        System.out.println("");
        // or
        int[] roll2 = {1, 3, 4, 5, 6};
        System.out.println(roll2[0]);
    }
}
