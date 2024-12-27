// creating thread using Thread class

class MyAnotherThread extends Thread{
    public void run(){
        for(int i = 5 ; i > 0 ; i--){
            System.out.println("MyThread is running " + i);
        }
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
    }
}



public class Main{
    public static void main(String[] args) {
        MyAnotherThread t = new MyAnotherThread();
        Thread thr = new Thread(t);
        thr.start();
    }
}