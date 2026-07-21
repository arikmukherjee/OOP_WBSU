import java.applet.Applet;
import java.awt.*;

public class SandClockApplet extends Applet implements Runnable {

    Thread t;
    int sandTop = 100;   // sand in upper part
    int sandBottom = 0;  // sand in lower part

    public void init() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        try {
            while (true) {
                if (sandTop > 0) {
                    sandTop--;
                    sandBottom++;
                } else {
                    // reset for continuous animation
                    sandTop = 100;
                    sandBottom = 0;
                }
                repaint();
                Thread.sleep(100); // speed of sand falling
            }
        } catch (Exception e) {}
    }

    public void paint(Graphics g) {
        setBackground(Color.black);

        // Draw hourglass frame
        g.setColor(Color.white);
        g.drawLine(150, 50, 250, 150);
        g.drawLine(250, 50, 150, 150);
        g.drawRect(140, 40, 120, 10);  // top bar
        g.drawRect(140, 150, 120, 10); // bottom bar

        // Draw sand (top)
        g.setColor(Color.yellow);
        for (int i = 0; i < sandTop; i++) {
            int x = 170 + (int)(Math.random() * 60);
            int y = 60 + (int)(Math.random() * 60);
            g.fillOval(x, y, 2, 2);
        }

        // Falling sand stream
        g.setColor(Color.orange);
        g.fillOval(198, 100, 5, 10);

        // Draw sand (bottom)
        g.setColor(Color.yellow);
        for (int i = 0; i < sandBottom; i++) {
            int x = 170 + (int)(Math.random() * 60);
            int y = 110 + (int)(Math.random() * 40);
            g.fillOval(x, y, 2, 2);
        }
    }
}