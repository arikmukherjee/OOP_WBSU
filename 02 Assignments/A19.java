import java.applet.Applet;
import java.awt.*;

public class A19 extends Applet implements Runnable {

    String msg = " WELCOME TO JAVA APPLET ";
    Thread t;

    public void init() {

        setBackground(Color.black);
        setForeground(Color.yellow);
    }

    public void start() {

        t = new Thread(this);
        t.start();
    }

    public void run() {

        while (true) {

            repaint();

            try {
                Thread.sleep(300);
            }
            catch (Exception e) {
            }

            // Rotate banner text
            msg = msg.substring(1) + msg.charAt(0);
        }
    }

    public void paint(Graphics g) {

        g.setFont(new Font("Arial", Font.BOLD, 28));

        g.drawString(msg, 50, 100);
    }
}