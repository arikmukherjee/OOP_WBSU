import java.net.*;

public class A25sender {
    public static void main(String[] args) {

        try {
            DatagramSocket ds = new DatagramSocket();

            String str = "Hello Receiver";
            InetAddress ip = InetAddress.getByName("localhost");

            DatagramPacket dp = new DatagramPacket(
                    str.getBytes(),
                    str.length(),
                    ip,
                    3000
            );

            ds.send(dp);

            System.out.println("Message Sent");

            ds.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}