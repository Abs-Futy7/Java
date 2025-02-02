import java.util.Scanner;

// Thread for sending messages
class Sender extends Thread {
    private Scanner sc;
    
    Sender() {
        sc = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.print("You: ");
            String message = sc.nextLine();
            if (message.equalsIgnoreCase("exit")) break;
            System.out.println("Sent: " + message);
        }
    }
}

// Thread for receiving messages
class Receiver extends Thread {
    private Scanner sc;

    Receiver() {
        sc = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.print("Friend: ");
            String message = sc.nextLine();
            if (message.equalsIgnoreCase("exit")) break;
            System.out.println("Received: " + message);
        }
    }
}

// Chat Application
public class ChatApp {
    public static void main(String[] args) {
        Sender sender = new Sender();
        Receiver receiver = new Receiver();

        sender.start();
        receiver.start();
    }
}

