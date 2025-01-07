package lecture;

class Product {
    int i = 0; // Keeps track of the product number
    boolean empty = true; // Indicates whether the product is available

    synchronized void produceV2() {
        while (!empty) { // Wait if a product is already available
            try {
                wait(); // Producer will wait until the consumer consumes the product
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        i++; // Increment product number to simulate production
        System.out.println("Produced Product Number: " + i);
        empty = false; // Indicate that a product is now available
        notify(); // Notify the consumer that a product is available
    }

    synchronized void consumeV2() {
        while (empty) { // Wait if there is no product available
            try {
                wait(); // Consumer will wait until the producer produces a product
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed Product Number: " + i);
        empty = true; // Indicate that the product has been consumed
        notify(); // Notify the producer that the product has been consumed
    }
}

class MarketThreadProducer extends Thread {
    Product p; // Reference to the shared Product object

    MarketThreadProducer(String name, Product p) {
        super(name); // Set the thread's name
        this.p = p;
    }

    public void run() {
        while (true) {
            p.produceV2(); // Continuously produce products
        }
    }
}

class MarketThreadConsumer extends Thread {
    Product p; // Reference to the shared Product object

    MarketThreadConsumer(String name, Product p) {
        super(name); // Set the thread's name
        this.p = p;
    }

    public void run() {
        while (true) {
            p.consumeV2(); // Continuously consume products
        }
    }
}

public class MarketSimulation {
    public static void main(String[] args) {
        Product p = new Product(); // Shared Product object
        MarketThreadProducer producer = new MarketThreadProducer("Producer", p); // Producer thread
        MarketThreadConsumer consumer = new MarketThreadConsumer("Consumer", p); // Consumer thread

        producer.start(); // Start the producer thread
        consumer.start(); // Start the consumer thread
    }
}


