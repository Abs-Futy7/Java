package Strings;

public class Perfomance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0 ; i<26 ; i++){
            char ch = (char)('a' + i);
            series = series + ch;
        }
        System.out.println(series);
        /* 
        In this method all of the large strings will have no
        reference variable , wastage of space O(n^2) tc
        */ 
        

        StringBuilder builder = new StringBuilder();
        for(int i = 0 ; i<26 ; i++){
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
        /*
            Here it is not creating new object, only adding characters
         */

    }
}
