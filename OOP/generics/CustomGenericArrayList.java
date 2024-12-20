package generics;

import java.util.Arrays;

public class CustomGenericArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index){
        return (T)(data[index]);
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index] = value;
    }

    private boolean isFull(){
        return size == data.length;
    }

    private void resize(){
        Object[] temp = new Object[data.length * 2];

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
        CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();
        list.add(4);
        list.add(5);
        list.add(3);

        System.out.println(list);
    }
}
