import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {

    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket();

            String msg = "Hello from UDP Sender";
            byte[] data = msg.getBytes();

            InetAddress ip = InetAddress.getByName("localhost");

            // Send packet to port 5000
            DatagramPacket dp = new DatagramPacket(data, data.length, ip, 5000);
            ds.send(dp);

            System.out.println("Message sent");

            ds.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}