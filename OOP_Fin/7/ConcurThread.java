/*
Issue 1: Race Condition

    Multiple threads modify Arr[] simultaneously, leading to data inconsistency.
    Example: Two threads may read the same value before modifying it.

Issue 2: Lack of Synchronization

    Arr[i] = -1; should be protected to prevent multiple threads from reading/updating the same index.
 */


class Data {
    int Arr[];

    public Data() {
        Arr = new int[20];
        for (int i = 0; i < 20; i++) {
            Arr[i] = i + 2 * 10; // Initialize values
        }
    }

    // Synchronized method to safely extract values
    public synchronized int extract(int index) {
        if (Arr[index] == -1) {
            return -1; // Value already extracted
        }
        int val = Arr[index];
        Arr[index] = -1; // Mark extracted
        return val;
    }
}

// Processor class implementing Runnable
class Processor implements Runnable {
    Data d;
    int Arr[];
    Thread t;

    public Processor(Data d, String threadName) {
        this.d = d;
        this.Arr = new int[10];
        this.t = new Thread(this, threadName);
        t.start();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (d) {
                int val = d.extract(i);
                if (val != -1) {
                    System.out.println("Arr[" + i + "] = " + val + " extracted by " + Thread.currentThread().getName());
                } else {
                    System.out.println("Arr[" + i + "] already extracted!");
                }
            }
        }
    }
}

// Main class for execution
public class ConcurThread {
    public static void main(String[] args) {
        Data d = new Data();

        Processor p1 = new Processor(d, "p1");
        Processor p2 = new Processor(d, "p2");

        try {
            p1.t.join();
            p2.t.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
 Improvements in the Fixed Code

✅ Used synchronized block to ensure safe access to shared Arr[].
✅ Added a method extract(int index) to ensure one thread modifies Arr[] at a time.
✅ Proper error handling (Arr[i] == -1 check) to prevent multiple extractions.
 */