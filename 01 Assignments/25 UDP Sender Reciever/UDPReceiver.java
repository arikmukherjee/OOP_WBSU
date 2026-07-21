import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiver {

    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(5000);

            // 🔥 Add this line here
            ds.setSoTimeout(5000);

            byte[] buffer = new byte[1024];

            DatagramPacket dp = new DatagramPacket(buffer, buffer.length);

            ds.receive(dp); // will wait max 5 seconds

            String msg = new String(dp.getData(), 0, dp.getLength());
            System.out.println("Message received: " + msg);

            ds.close();

        } catch (Exception e) {
            System.out.println("Timeout or Error: " + e);
        }
    }
}