
package Switch;

import java.util.Scanner;

public class basic {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        switch(fruit){
            case "Mango" : 
            System.out.println("King of fruits");
            break;

            case "Apple" :
            System.out.println("Red fruit");
            break;

            case "Watermelon" :
            System.out.println("Big fruit");
            break;

            default:
            System.out.println("Invalid fruit");
        }

    }
}
