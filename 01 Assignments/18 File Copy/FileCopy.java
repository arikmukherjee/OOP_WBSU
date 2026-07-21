import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFile = "A.txt";
        String destinationFile = "B.txt";

        try {
            // Step 1: Create A.txt with some sample content
            createSampleFile(sourceFile);
            System.out.println("Created " + sourceFile + " with sample content.");

            // Step 2: Copy content from A.txt to B.txt
            copyFile(sourceFile, destinationFile);
            System.out.println("Successfully copied content from " + sourceFile + " to " + destinationFile);

            // Step 3: Verify the copy
            verifyCopy(sourceFile, destinationFile);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Create a sample A.txt file with content
    private static void createSampleFile(String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("This is the content of A.txt\n");
            writer.write("It contains multiple lines of text.\n");
            writer.write("This file will be copied to B.txt\n");
            writer.write("Java file I/O operations are demonstrated here.\n");
            writer.write("End of file content.\n");
        }
    }

    // Copy file using NIO Files.copy
    private static void copyFile(String source, String destination) throws IOException {
        Files.copy(Paths.get(source), Paths.get(destination), StandardCopyOption.REPLACE_EXISTING);
    }

    // Verify that the copy was successful
    private static void verifyCopy(String originalFile, String copyFile) throws IOException {
        if (Files.exists(Paths.get(copyFile))) {
            long originalSize = Files.size(Paths.get(originalFile));
            long copySize = Files.size(Paths.get(copyFile));

            if (originalSize == copySize) {
                System.out.println("✓ Copy verification successful - File sizes match (" + copySize + " bytes)");
            } else {
                System.out.println("✗ Copy verification failed - File sizes don't match");
            }

            // Display content of both files
            System.out.println("\nContent of " + originalFile + ":");
            displayFileContent(originalFile);

            System.out.println("\nContent of " + copyFile + ":");
            displayFileContent(copyFile);
        } else {
            System.out.println("✗ Copy file " + copyFile + " was not created");
        }
    }

    // Display file content
    private static void displayFileContent(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}