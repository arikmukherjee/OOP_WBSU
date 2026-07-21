import java.net.URL;

public class A23 {
    public static void main(String[] args) {
        try {
            // Create URL object
            URL url1 = new URL("https://www.example.com:8080/index.html");
            URL url2 = new URL("https://www.google.com");

            // Get port number
            System.out.println("URL 1: " + url1);
            System.out.println("Port of URL 1: " + url1.getPort());

            System.out.println("\nURL 2: " + url2);
            System.out.println("Port of URL 2: " + url2.getPort());

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}