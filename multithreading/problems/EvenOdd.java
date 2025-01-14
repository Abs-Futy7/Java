class EvenThread extends Thread{
    @Override
    public void run(){
        for(int i = 0 ; i <= 20 ; i++){
            if((i%2) == 0){
                System.out.println("Even : " + i);
            }
        }
    }
    
}

class OddThread extends Thread{
    @Override
    public void run(){
        for(int i = 0 ; i <= 20 ; i++){
            if((i%2) != 0){
                System.out.println("Odd : " + i);
            }
        }
    }
    
}

public class EvenOdd{
    public static void main(String[] args) {
        EvenThread even = new  EvenThread();
        OddThread odd = new OddThread();

        even.start();
        odd.start();
    }
}
