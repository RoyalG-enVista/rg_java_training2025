package day3.q2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedFileCopy {
    public static void main(String[] args) {
        // Specify the source and destination file paths
        String sourceFilePath = "Jasprit_Bumrah.jpg";
        String destinationFilePath = "Jasprit_BumrahCopy.jpg";  // Destination path

        // Declare BufferedInputStream and BufferedOutputStream objects
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        // Start measuring time

        long startTimeM = System.currentTimeMillis();        //Milli seconds
        long startTimeN = System.nanoTime();                 //Nano seconds



        try {
            // Initialize FileInputStream and wrap it in BufferedInputStream
            FileInputStream fis = new FileInputStream(sourceFilePath);
            bis = new BufferedInputStream(fis);

            // Initialize FileOutputStream and wrap it in BufferedOutputStream
            FileOutputStream fos = new FileOutputStream(destinationFilePath);
            bos = new BufferedOutputStream(fos);

            // Read and write data in chunks using buffering
            byte[] buffer = new byte[8192]; // 8 KB buffer size
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);  // Write the data to the destination
            }

            System.out.println("File copied successfully using Buffered Streams!");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis != null) bis.close();
                if (bos != null) bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // End measuring time
        long endTimeM = System.currentTimeMillis();      //Milli seconds

        long endTimeN = System.nanoTime();               //Nano seconds

        // Calculate and record performance improvement in Milliseconds and Nanoseconds
        long durationInMilli = endTimeM - startTimeM;
        System.out.println("Time taken using Buffered Streams: " + durationInMilli + " Mili seconds");
        long durationInNano = endTimeN - startTimeN;
        System.out.println("Time taken using Buffered Streams: " + durationInNano + " Nano seconds");
    }
}

