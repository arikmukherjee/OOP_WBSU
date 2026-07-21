import java.net.URL;
@SuppressWarnings("deprecation")
public class URLDemo {

    public static void main(String[] args) {
        try {
            // Create URL object
            URL url = new URL("https://www.google.com:443/search?q=java");

            // Display different parts of URL
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("Default Port: " + url.getDefaultPort());
            System.out.println("File: " + url.getFile());
            System.out.println("Path: " + url.getPath());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}