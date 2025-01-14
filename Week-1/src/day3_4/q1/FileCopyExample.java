package day3_4.q1;
import java.io.*;

public class FileCopyExample {
    public static void main(String[] args) {
        // Define file paths for source and destination files
        String sourceFilePath = "Jasprit_Bumrah.jpg";
        String destinationFilePath = "Jasprit_BumrahCopy.jpg";

        // Copying file using FileInputStream and FileOutputStream
        copyFileUsingStreams(sourceFilePath, destinationFilePath);
    }

    // Method to copy file using FileInputStream and FileOutputStream
    public static void copyFileUsingStreams(String sourceFilePath, String destinationFilePath) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // Create FileInputStream and FileOutputStream objects
            fis = new FileInputStream(sourceFilePath);
            fos = new FileOutputStream(destinationFilePath);

            int byteRead;
            // Read the file byte by byte and write it to the new file
            while ((byteRead = fis.read()) != -1) {
                fos.write(byteRead);
            }

            System.out.println("File copied successfully using FileInputStream and FileOutputStream!");

        } catch (IOException e) {
            System.err.println("An error occurred during file copy: " + e.getMessage());
        }

        /*finally {
            // Close resources
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }*/
    }
}

