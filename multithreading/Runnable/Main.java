import static java.lang.Thread.sleep;

// creating using runnable interface
class MyThread implements Runnable{
    public void run(){
        for(int i = 0 ; i < 5 ; i++){
            System.out.println("My User Defined Thread");
            try{
                sleep(1000);  // 1 second sleep after each execution
            }
            catch (Exception e){

            }
        }
    }
}

public class Main{
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        Thread thread = new Thread(t1);
        thread.start();
        
    }
}