import java.applet.Applet;
import java.awt.*;

public class AshokaChakraApplet extends Applet {

    public void paint(Graphics g) {

        int centerX = 200;
        int centerY = 150;
        int radius = 80;

        // Draw outer circle
        g.setColor(Color.blue);
        g.drawOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);

        // Draw inner small circle (optional)
        g.drawOval(centerX - 10, centerY - 10, 20, 20);

        // Draw 24 spokes
        for (int i = 0; i < 24; i++) {
            double angle = Math.toRadians(i * 15); // 360/24 = 15°
            int x = centerX + (int)(radius * Math.cos(angle));
            int y = centerY + (int)(radius * Math.sin(angle));

            g.drawLine(centerX, centerY, x, y);
        }
    }
}