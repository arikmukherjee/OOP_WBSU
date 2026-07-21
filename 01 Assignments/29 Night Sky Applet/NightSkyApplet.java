import java.applet.Applet;
import java.awt.*;

// Applet Class
public class NightSkyApplet extends Applet {

    public void paint(Graphics g) {
        // Set background as dark (night sky)
        setBackground(Color.black);

        // Draw stars (small white dots)
        g.setColor(Color.white);
        for (int i = 0; i < 100; i++) {
            int x = (int)(Math.random() * getWidth());
            int y = (int)(Math.random() * getHeight());
            g.fillOval(x, y, 2, 2);
        }

        // Draw moon
        g.setColor(Color.lightGray);
        g.fillOval(220, 50, 60, 60);

        // Optional: add craters on moon
        g.setColor(Color.gray);
        g.fillOval(240, 70, 10, 10);
        g.fillOval(260, 80, 8, 8);
        g.fillOval(230, 90, 6, 6);
    }
}