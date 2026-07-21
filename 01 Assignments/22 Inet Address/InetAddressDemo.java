import java.net.InetAddress;

public class InetAddressDemo {

    public static void main(String[] args) {
        try {
            // Correct type 👇
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("Local Host Name: " + local.getHostName());
            System.out.println("Local IP Address: " + local.getHostAddress());

            InetAddress google = InetAddress.getByName("www.google.com");
            System.out.println("\nGoogle Host Name: " + google.getHostName());
            System.out.println("Google IP Address: " + google.getHostAddress());

            InetAddress[] all = InetAddress.getAllByName("www.google.com");
            System.out.println("\nAll IP Addresses:");
            for (InetAddress addr : all) {
                System.out.println(addr.getHostAddress());
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}