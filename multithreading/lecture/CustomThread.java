package lecture;

// CustomThread.java
public class CustomThread extends Thread {
    CustomThread(String s) {
        super(s); // Set the thread name
    }

    public void run() {
        System.out.println("Custom Thread Started: " + Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            if (i == 499) {
                System.out.println("Thread " + Thread.currentThread().getName() + " reached: " + i);
            }
            try {
                // Simulate some work
                Thread.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        CustomThread ctA = new CustomThread("Thread A");
        CustomThread ctB = new CustomThread("Thread B");
        CustomThread ctC = new CustomThread("Thread C");

        ctA.setPriority(9); // High priority
        ctB.setPriority(1); // Low priority
        ctC.setPriority(7); // Medium priority

        ctA.start();
        ctB.start();
        ctC.start();

        try {
            System.out.println("Thread A isAlive: " + ctA.isAlive());
            ctA.join(); // Wait for Thread A to finish
            ctB.join();
            ctC.join();
            System.out.println("Thread A isAlive after join: " + ctA.isAlive());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

