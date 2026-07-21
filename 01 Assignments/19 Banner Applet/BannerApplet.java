import java.applet.Applet;
import java.awt.Graphics;

public class BannerApplet extends Applet implements Runnable {

    String msg = "Welcome to University Admission System";
    Thread t = null;
    int x = 0;

    public void init() {
        setSize(500, 100);
        setBackground(java.awt.Color.cyan);
    }

    public void start() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        while (true) {
            x = x + 10;

            if (x > getWidth()) {
                x = 0;
            }

            repaint();

            try {
                Thread.sleep(200);
            } catch (Exception e) {}
        }
    }

    public void paint(Graphics g) {
        g.drawString(msg, x, 50);
    }
}