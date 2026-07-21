import java.applet.Applet;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClockApplet extends Applet implements Runnable {

    Thread t;
    String timeStr = "";

    public void init() {
        setBackground(Color.black);
        setForeground(Color.green);

        t = new Thread(this);
        t.start();
    }

    public void run() {
        try {
            while (true) {
                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                timeStr = sdf.format(d);

                repaint();
                Thread.sleep(1000); // update every second
            }
        } catch (Exception e) {}
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.BOLD, 40));
        g.drawString(timeStr, 80, 100);
    }
}