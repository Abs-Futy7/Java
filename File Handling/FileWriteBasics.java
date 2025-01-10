import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteBasics {

    // Method to write to a file using BufferedWriter
    static void usingBufferwriter() {
        // Create a File object pointing to "output.txt"
        File file = new File("output.txt");

        // Try-with-resources to automatically close the BufferedWriter after use
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) { 
            // `true` enables append mode, writing content at the end of the file
            // `false` (or default) would overwrite the file

            // Write text to the file
            writer.write("Hello, World!"); // Write without adding a newline
            writer.write("Hello, World!"); // This will continue on the same line
            writer.write("Hello, World!"); // Still on the same line unless a newline is added manually
        } catch (IOException e) {
            e.printStackTrace(); // Print stack trace if an error occurs (e.g., file not found, access denied)
        }
    }

    // Method to write to a file directly using FileWriter
    static void usingDirectFileWriter() {
        // File name and text to append
        String fileName = "output.txt";
        String textToAppend = "This text will be appended to the file.";

        // Try-with-resources to automatically close the FileWriter after use
        try (FileWriter writer = new FileWriter(fileName, true)) { 
            // `true` enables append mode, writing content at the end of the file
            writer.write(textToAppend); // Write text to the file
            writer.write(System.lineSeparator()); // Add a newline after the text
            writer.write(textToAppend); // Write the text again (on a new line because of the previous lineSeparator)
            System.out.println("Text appended to the file."); // Confirm successful operation
        } catch (IOException e) {
            // Handle errors during the write operation
            System.err.println("Error appending text to the file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Uncomment one of the following lines to test the corresponding method

        //usingBufferwriter(); // Test writing using BufferedWriter
        usingDirectFileWriter(); // Test writing directly using FileWriter
    }
}

