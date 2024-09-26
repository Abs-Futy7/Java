package Switch;

import java.util.*;

public class nestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        String dept = sc.next();

        switch (id) {
            case 1:
                System.out.println("Rahul");
                break;

            case 2:
                System.out.println("Raj");
                break;

            case 3:
                switch (dept) {
                    case "CSE" -> System.out.println("Ded");
                    case "BBA" -> System.out.println("Chill");
                    default -> System.out.println("Invalid");

                }
                break;
            default:
                System.out.println("Invalid");
                
        }
    }
}
