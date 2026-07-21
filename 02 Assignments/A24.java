import java.net.URL;

public class A24 {
    public static void main(String[] args) {
        try {
            // Create a URL object
            URL url = new URL("https://www.example.com:8080/docs/index.html?name=java#section1");

            // Display different parts of the URL
            System.out.println("Full URL: " + url);
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("Default Port: " + url.getDefaultPort());
            System.out.println("Path: " + url.getPath());
            System.out.println("File: " + url.getFile());
            System.out.println("Query: " + url.getQuery());
            System.out.println("Reference: " + url.getRef());

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}