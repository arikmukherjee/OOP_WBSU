import java.applet.Applet;
import java.awt.*;

public class IndiaFlagApplet extends Applet {

    public void paint(Graphics g) {

        // Top stripe - Saffron
        g.setColor(Color.orange);
        g.fillRect(100, 50, 300, 50);

        // Middle stripe - White
        g.setColor(Color.white);
        g.fillRect(100, 100, 300, 50);

        // Bottom stripe - Green
        g.setColor(Color.green);
        g.fillRect(100, 150, 300, 50);

        // Draw flag pole
        g.setColor(Color.black);
        g.fillRect(90, 50, 10, 200);

        // Draw Ashoka Chakra
        g.setColor(Color.blue);
        g.drawOval(235, 110, 30, 30);

        // Draw spokes (simple version)
        for (int i = 0; i < 24; i++) {
            double angle = Math.toRadians(i * 15);
            int x1 = 250;
            int y1 = 125;
            int x2 = x1 + (int)(15 * Math.cos(angle));
            int y2 = y1 + (int)(15 * Math.sin(angle));
            g.drawLine(x1, y1, x2, y2);
        }
    }
}