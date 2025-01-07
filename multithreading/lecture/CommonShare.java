package lecture;

// CommonShare.java
public class CommonShare {
    void printMethod(String val) {
        System.out.println("[");
        try {
            Thread.sleep(1000); // Simulate delay
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(val);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("]");
    }

    synchronized void printMethodV2(String val) {
        System.out.println("[");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(val);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("]");
    }
}


// SyncThread.java
class SyncThread extends Thread {
    String val;
    CommonShare cs;

    SyncThread(String s, String val, CommonShare cs) {
        super(s);
        this.val = val;
        this.cs = cs;
    }

    public void run() {
        synchronized (cs) { // Synchronize on the shared resource
            cs.printMethod(this.val);
        }
    }

    public static void main(String[] args) {
        CommonShare cs = new CommonShare();
        SyncThread stA = new SyncThread("SyncThread A", "Happy", cs);
        SyncThread stB = new SyncThread("SyncThread B", "New", cs);
        SyncThread stC = new SyncThread("SyncThread C", "Year", cs);

        stA.start();
        stB.start();
        stC.start();
    }
}


