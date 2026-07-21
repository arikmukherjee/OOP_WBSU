import java.applet.Applet;
import java.awt.*;

public class A30 extends Applet implements Runnable {

    Thread t;
    int sand = 100;

    public void init() {
        setSize(400, 400);
        setBackground(Color.white);

        t = new Thread(this);
        t.start();
    }

    public void run() {
        while (true) {

            sand--;

            if (sand < 0) {
                sand = 100;
            }

            repaint();

            try {
                Thread.sleep(80);
            } catch (Exception e) {
            }
        }
    }

    public void paint(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.white);
        g2.fillRect(0, 0, 400, 400);

        g2.setColor(Color.black);
        g2.setFont(new Font("Arial", Font.BOLD, 22));
        g2.drawString("Working Sand Clock", 90, 35);

        int cx = 200;

        int topY = 70;
        int midY = 170;
        int bottomY = 270;

        int leftX = 150;
        int rightX = 250;

        // Stand
        g2.setColor(Color.darkGray);
        g2.fillRect(120, 50, 160, 10);
        g2.fillRect(120, 285, 160, 10);
        g2.fillRect(135, 55, 8, 235);
        g2.fillRect(257, 55, 8, 235);

        // Glass outline
        g2.setColor(Color.black);

        g2.drawLine(leftX, topY, rightX, topY);
        g2.drawLine(leftX, topY, cx, midY);
        g2.drawLine(rightX, topY, cx, midY);

        g2.drawLine(leftX, bottomY, rightX, bottomY);
        g2.drawLine(leftX, bottomY, cx, midY);
        g2.drawLine(rightX, bottomY, cx, midY);

        g2.setColor(Color.orange);

        /*
           sand = 100 means upper full, lower empty
           sand = 0 means upper empty, lower full
        */

        /// ---------------- LOWER SAND ----------------
            // Lower sand fills from bottom upward
            int filled = 100 - sand;
            int lowerLevel = 270 - filled;

            if (filled > 0) {
                int halfWidth = filled / 2;

                int lx[] = {
                    150 + halfWidth,
                    250 - halfWidth,
                    200
                };

                int ly[] = {
                    270,
                    270,
                    lowerLevel
                };

                g.fillPolygon(lx, ly, 3);
            }
    }
}