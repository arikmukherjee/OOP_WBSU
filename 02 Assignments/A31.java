import java.applet.Applet;
import java.awt.*;

public class A31 extends Applet implements Runnable {

    Thread t;

    // Ball 1
    int x1 = 50, y1 = 50;
    int dx1 = 3, dy1 = 2;

    // Ball 2
    int x2 = 200, y2 = 100;
    int dx2 = 2, dy2 = 3;

    // Ball 3
    int x3 = 100, y3 = 200;
    int dx3 = 4, dy3 = 2;

    public void init() {

        setSize(500, 400);

        t = new Thread(this);
        t.start();
    }

    public void run() {

        while (true) {

            // Move Ball 1
            x1 += dx1;
            y1 += dy1;

            // Move Ball 2
            x2 += dx2;
            y2 += dy2;

            // Move Ball 3
            x3 += dx3;
            y3 += dy3;

            // Bounce Ball 1
            if (x1 <= 0 || x1 >= getWidth() - 30)
                dx1 = -dx1;

            if (y1 <= 0 || y1 >= getHeight() - 30)
                dy1 = -dy1;

            // Bounce Ball 2
            if (x2 <= 0 || x2 >= getWidth() - 30)
                dx2 = -dx2;

            if (y2 <= 0 || y2 >= getHeight() - 30)
                dy2 = -dy2;

            // Bounce Ball 3
            if (x3 <= 0 || x3 >= getWidth() - 30)
                dx3 = -dx3;

            if (y3 <= 0 || y3 >= getHeight() - 30)
                dy3 = -dy3;

            repaint();

            try {
                Thread.sleep(20);
            }
            catch (Exception e) {
            }
        }
    }

    public void paint(Graphics g) {

        setBackground(Color.black);

        // Ball 1
        g.setColor(Color.red);
        g.fillOval(x1, y1, 30, 30);

        // Ball 2
        g.setColor(Color.green);
        g.fillOval(x2, y2, 30, 30);

        // Ball 3
        g.setColor(Color.yellow);
        g.fillOval(x3, y3, 30, 30);

        // Title
        g.setColor(Color.white);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Multiple Bouncing Balls", 140, 25);
    }
}