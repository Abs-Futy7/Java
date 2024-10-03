package staticexample;
// demo to show initialization of static variables
public class StaticInt {
    static int a = 5;
    static int b;

    // This will run only once when the first object create
    // i.e when the class is loaded for the first time
    static {
        System.out.println("I am in static block");
        b = a*5;
    }

    public static void main(String[] args) {
        StaticInt obj = new StaticInt();
        System.out.println(StaticInt.a + " " + StaticInt.b);

        StaticInt.b += 3;
        System.out.println(StaticInt.a + " " + StaticInt.b);

    }
}
