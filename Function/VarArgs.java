package Function;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 4, 6, 8, 10);

        multiple(45, 45, "Hello", "World");
    }

    static void multiple(int a, int b, String ...v){

    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v)); //It will internally store it in an array
    }
}
