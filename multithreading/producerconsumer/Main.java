package multithreading.producerconsumer;

class Company {
    int n;
    boolean f = false;

    // f=false: chance: producer
    // f=true: chance :consumer
    synchronized public void produce_item(int n) throws Exception {
        if (f) {
            wait();
        }
        this.n = n;
        System.out.println("Produced : " + this.n);
        f = true;
        notify();
    }

    synchronized public int consume_item() throws Exception {
        if (!f) {
            wait();
        }
        System.out.println("Consumed : " + this.n);
        f = false;
        notify();
        return this.n;
    }
}

class Producer extends Thread {

    Company c;

    Producer(Company c) {
        this.c = c;
    }

    public void run() {
        int i = 1;
        while (true) {
            try {
                this.c.produce_item(i);
            } catch (Exception ex) {
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            i++;
        }
    }
}

class Consumer extends Thread {
    Company c;

    Consumer(Company c) {
        this.c = c;
    }

    public void run() {
        while (true) {
            try {
                this.c.consume_item();
            } catch (Exception e) {
            }
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Company comp = new Company();
        Producer p = new Producer(comp);
        Consumer c = new Consumer(comp);
        p.start();
        c.start();
    }
}
