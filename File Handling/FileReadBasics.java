import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReadBasics {

    // Method to read a file using BufferedReader and FileReader
    static void usingBufferedReaderAndFileReader() {
        // Create a File object pointing to "example.txt"
        File file = new File("example.txt"); // The file path is relative to the current working directory

        // Try-with-resources to ensure resources are closed automatically
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line; // Variable to store each line read from the file
            // Read lines one by one until the end of the file
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Print each line to the console
            }
        } catch (IOException e) {
            e.printStackTrace(); // Print stack trace if an error occurs (e.g., file not found)
        }
    }

    // Method to read a file using a Scanner
    static void usingScanner() {
        // Try-with-resources to ensure Scanner is closed automatically
        try (Scanner scanner = new Scanner(new File("example.txt"))) { // File is provided as input to Scanner
            // Read and print each line until the end of the file
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine()); // Print each line to the console
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace(); // Handle the case when the file is not found
        }
    }

    // Method to read a file using DataInputStream
    static void usingStream() {
        // Try-with-resources to ensure DataInputStream is closed automatically
        try (DataInputStream dis = new DataInputStream(new FileInputStream("example.txt"))) {
            while (true) { // Infinite loop to keep reading until we reach the end of the file
                byte[] b = new byte[1024]; // Buffer to store bytes read from the file
                int v = dis.read(b); // Read bytes into the buffer and get the number of bytes read
                System.out.println("v = " + v); // Print the number of bytes read

                if (v == -1) break; // Exit the loop when end of file is reached (read() returns -1)

                String s = new String(b); // Convert the byte array to a string
                System.out.println(s); // Print the string (will include null characters for unused buffer space)

                byte[] sb = new byte[v]; // Create a smaller byte array to store only the actual bytes read
                for (int i = 0; i < v; i++) {
                    sb[i] = b[i]; // Copy the relevant bytes into the smaller array
                }

                String ns = new String(sb); // Convert the smaller byte array to a string
                System.out.println(ns); // Print the clean string without null characters
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle I/O exceptions
        }
    }

    public static void main(String[] args) {
        // Uncomment one of the methods below to test different file reading approaches

        //usingBufferedReaderAndFileReader(); // Read file using BufferedReader and FileReader
        // usingScanner(); // Read file using Scanner
        // usingStream(); // Read file using DataInputStream
    }
}
