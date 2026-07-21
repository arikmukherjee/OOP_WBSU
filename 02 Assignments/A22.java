import java.net.InetAddress;

public class A22 {
    public static void main(String[] args) {
        try {
            // 1. Get local host information
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local Host Name: " + localHost.getHostName());
            System.out.println("Local IP Address: " + localHost.getHostAddress());

            // 2. Get IP of a specific website
            InetAddress google = InetAddress.getByName("www.google.com");
            System.out.println("\nGoogle Host Name: " + google.getHostName());
            System.out.println("Google IP Address: " + google.getHostAddress());

            // 3. Get all IP addresses of a domain
            InetAddress[] allIPs = InetAddress.getAllByName("www.google.com");
            System.out.println("\nAll IP Addresses of Google:");
            for (InetAddress ip : allIPs) {
                System.out.println(ip.getHostAddress());
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}