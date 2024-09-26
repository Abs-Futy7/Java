package Switch;

import java.util.Scanner;

public class enhancedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch(fruit){
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("Red fruit");
            case "Watermelon" -> System.out.println("Big fruit");  
            default -> System.out.println("Invalid fruit");   // We don't need to put break condition
        }
    }
}
