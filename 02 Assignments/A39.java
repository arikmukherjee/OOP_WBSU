import java.applet.Applet;
import java.awt.*;

public class A39 extends Applet {

    public void paint(Graphics g) {

        setBackground(Color.white);

        Graphics2D g2 = (Graphics2D) g;

        // Title
        g2.setFont(new Font("Arial", Font.BOLD, 28));
        g2.setColor(Color.black);
        g2.drawString("Display Text at Specific Location", 120, 50);

        // Text at different locations

        g2.setFont(new Font("Arial", Font.BOLD, 24));

        // Top Left
        g2.setColor(Color.red);
        g2.drawString("Top Left", 50, 100);

        // Top Right
        g2.setColor(Color.blue);
        g2.drawString("Top Right", 450, 100);

        // Center
        g2.setColor(Color.green);
        g2.drawString("Center Text", 250, 220);

        // Bottom Left
        g2.setColor(Color.magenta);
        g2.drawString("Bottom Left", 50, 350);

        // Bottom Right
        g2.setColor(Color.orange);
        g2.drawString("Bottom Right", 430, 350);
    }
}