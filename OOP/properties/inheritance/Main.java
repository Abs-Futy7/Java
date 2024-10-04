package properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(6);
        System.out.println(box.b + " " + box.l + " " + box.h);

        BoxWeight box2 = new BoxWeight(4, 6, 7, 8);
        System.out.println(box2.b + " " + box2.h + " " + box2.l + " " + box2.weight);

        Box box3 = new BoxWeight(3, 5, 6, 8);
        // box3.weight; // Showing error
        /*
         * Because it is actually the reference variable that determines
         * what can be accessed , not the type of the object.
         */

        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the
        // constructor of child class
        // this is why error
        // BoxWeight box6 = new Box(2, 3, 4);
        // System.out.println(box6);

        BoxPrice box4 = new BoxPrice();
    }
}
/*
 * CHild cls can access parent class but parent class can't acces
 * child cls
 */
