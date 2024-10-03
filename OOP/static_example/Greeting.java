package staticexample;

public class Greeting {
    public static void main(String[] args) {
        greeting();
        fun();
    }

    static void greeting(){ // Static method can only access static data, it can;t acces non-static data
        // So we have to declare static void greeting()
        // Non static data belong to object
        System.out.println("Hello");
    }

    static void fun(){
        /*
         You can't access non static stuff without reffering their 
         instances in a static context
         */

         // hence I am referencing it
        Greeting obj = new Greeting();
        obj.funny();
    }

    void funny(){
        System.out.println("FUNnnnn");
    }
}
