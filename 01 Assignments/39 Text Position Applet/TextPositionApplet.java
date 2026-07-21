import java.applet.Applet;
import java.awt.*;

public class TextPositionApplet extends Applet {

    public void paint(Graphics g) {

        // Set font (optional)
        g.setFont(new Font("Arial", Font.BOLD, 20));

        // Set color
        g.setColor(Color.blue);

        // Display text at specific coordinates (x, y)
        g.drawString("Hello Java", 100, 100);

        // Another example
        g.setColor(Color.red);
        g.drawString("At position (200,150)", 200, 150);

        // Another example
        g.setColor(Color.green);
        g.drawString("Custom Location", 50, 200);
    }
}