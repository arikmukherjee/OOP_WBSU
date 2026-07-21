import java.applet.Applet;
import java.awt.*;
import java.util.Random;

public class MultiBallApplet extends Applet implements Runnable {

    Thread t;

    int n = 5; // number of balls
    int x[] = new int[n];
    int y[] = new int[n];
    int dx[] = new int[n];
    int dy[] = new int[n];
    int size = 30;

    Color colors[] = {Color.red, Color.green, Color.blue, Color.yellow, Color.cyan};

    public void init() {
        Random r = new Random();

        // initialize positions and directions
        for (int i = 0; i < n; i++) {
            x[i] = r.nextInt(300);
            y[i] = r.nextInt(200);
            dx[i] = 2 + r.nextInt(3); // speed x
            dy[i] = 2 + r.nextInt(3); // speed y
        }

        t = new Thread(this);
        t.start();
    }

    public void run() {
        try {
            while (true) {
                for (int i = 0; i < n; i++) {

                    x[i] += dx[i];
                    y[i] += dy[i];

                    // bounce on walls
                    if (x[i] <= 0 || x[i] >= getWidth() - size) {
                        dx[i] = -dx[i];
                    }
                    if (y[i] <= 0 || y[i] >= getHeight() - size) {
                        dy[i] = -dy[i];
                    }
                }

                repaint();
                Thread.sleep(30); // animation speed
            }
        } catch (Exception e) {}
    }

    public void paint(Graphics g) {
        setBackground(Color.black);

        for (int i = 0; i < n; i++) {
            g.setColor(colors[i % colors.length]);
            g.fillOval(x[i], y[i], size, size);
        }
    }
}