import java.net.Socket;

public class GetPortDemo {

    public static void main(String[] args) {
        try {
            // Connect to a server (example: google.com on port 80)
            Socket s = new Socket("www.google.com", 80);

            // Get port number
            int port = s.getPort();

            System.out.println("Connected to port: " + port);

            // Close socket
            s.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}