package generics;

import java.util.Arrays;

public class CustomArrayLists {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayLists(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    private boolean isFull(){
        return size == data.length;
    }

    private void resize(){
        int[] temp = new int[data.length * 2];

        for(int i = 0 ; i < data.length ; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    @Override
    public String toString(){
        return "CustomArrayList{" +
        "data=" + Arrays.toString(data) + ", size=" + size + "}";
    }

    public static void main(String[] args) {
        CustomArrayLists list = new CustomArrayLists();
        list.add(4);
        list.add(5);
        list.add(3);

        System.out.println(list);
    }
}
