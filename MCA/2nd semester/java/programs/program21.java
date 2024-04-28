import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        // Input and output file paths
        String sourceFilePath = "source.txt";
        String destinationFilePath = "destination.txt";

        // Try-with-resources to automatically close the streams
        try (FileInputStream inputStream = new FileInputStream(sourceFilePath);
             FileOutputStream outputStream = new FileOutputStream(destinationFilePath)) {
            // Buffer to hold data temporarily
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read from the input stream and write to the output stream until the end of the file
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}
