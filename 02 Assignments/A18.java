import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A18 {
    public static void main(String[] args) {

        try {
            // Create and write into A.txt
            FileWriter fw = new FileWriter("A.txt");
            fw.write("This is a sample text stored in A.txt");
            fw.close();

            // Read from A.txt
            FileReader fr = new FileReader("A.txt");

            // Write into B.txt
            FileWriter fw2 = new FileWriter("B.txt");

            int ch;

            while ((ch = fr.read()) != -1) {
                fw2.write(ch);
            }

            fr.close();
            fw2.close();

            System.out.println("Content copied from A.txt to B.txt successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}