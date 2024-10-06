package access;

public class A{
    public int num;
    String name;
    int[] arr;

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }

    public A(int num, String name){
        this.name = name;
        this.num = num;
        this.arr = new int[num];
    }
}