package Arrays;
import java.util.ArrayList;
public class DynamicArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(567);

        list.set(1, 500);
        list.remove(3);

        System.out.println(list);


        /*
          Input taking

          Scanner sc = new Scanner(System.in);
          for(int i = 0 ; i < n ; i++){
            list.add(sc.nextInt());
          }
         */
    }
}
