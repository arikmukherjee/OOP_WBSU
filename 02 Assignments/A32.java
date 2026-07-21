import java.applet.Applet;
import java.awt.*;
import java.util.Date;

public class A32 extends Applet implements Runnable {

    Thread t;

    String time = "";

    public void init() {

        // Increased window size
        //setSize(800, 250);

        t = new Thread(this);
        t.start();
    }

    public void run() {

        while (true) {

            Date d = new Date();

            time = d.toString();

            repaint();

            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {
            }
        }
    }

    public void paint(Graphics g) {

        // Background
        //setBackground(Color.black);

        // Title
        //g.setColor(Color.white);
        //g.setFont(new Font("Arial", Font.BOLD, 28));
        g.drawString("Digital Clock", 300, 50);

        // Clock Box
        //g.setColor(Color.white);
        //g.drawRect(40, 80, 700, 80);

        // Time Display
        //g.setColor(Color.green);
        //g.setFont(new Font("Courier", Font.BOLD, 30));
        g.drawString(time, 70, 130);
    }
}