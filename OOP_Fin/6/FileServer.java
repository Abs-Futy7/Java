import java.io.*;
import java.net.*;

public class FileServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000);
             Socket socket = serverSocket.accept();
             BufferedReader fileReader = new BufferedReader(new FileReader("Act.txt"));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

            System.out.println("Client connected. Sending file...");

            String line;
            while ((line = fileReader.readLine()) != null) {
                out.println(line);
            }

            System.out.println("File sent successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
