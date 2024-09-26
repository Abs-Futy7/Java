/* Two function of the same name can exist if they have different parameters */

package Function;

public class Overloading {

    public static void main(String[] args) {
        fun(2);
        fun("Abs");
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String b) {
        System.out.println(b);
    }

}
