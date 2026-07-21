import java.applet.Applet;
import java.awt.*;

public class ConcentricCirclesApplet extends Applet {

    public void paint(Graphics g) {

        int centerX = 200;
        int centerY = 150;

        int radius = 100;

        // Array of colors
        Color colors[] = {
            Color.red,
            Color.green,
            Color.blue,
            Color.yellow,
            Color.cyan,
            Color.magenta
        };

        // Draw concentric circles
        for (int i = 0; i < colors.length; i++) {
            g.setColor(colors[i]);

            g.drawOval(centerX - radius, centerY - radius,
                       2 * radius, 2 * radius);

            radius -= 15; // decrease radius for next circle
        }
    }
}