import java.applet.Applet;
import java.awt.*;

public class A36 extends Applet {

    public void paint(Graphics g) {

        setBackground(Color.white);

        Graphics2D g2 = (Graphics2D) g;

        // Title
        g2.setFont(new Font("Arial", Font.BOLD, 28));
        g2.setColor(Color.black);
        g2.drawString("Concentric Circles", 170, 50);

        // Center point
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        // Circle 1
        g2.setColor(Color.red);
        g2.fillOval(centerX - 150, centerY - 150, 300, 300);

        // Circle 2
        g2.setColor(Color.orange);
        g2.fillOval(centerX - 125, centerY - 125, 250, 250);

        // Circle 3
        g2.setColor(Color.yellow);
        g2.fillOval(centerX - 100, centerY - 100, 200, 200);

        // Circle 4
        g2.setColor(Color.green);
        g2.fillOval(centerX - 75, centerY - 75, 150, 150);

        // Circle 5
        g2.setColor(Color.blue);
        g2.fillOval(centerX - 50, centerY - 50, 100, 100);

        // Circle 6
        g2.setColor(new Color(75, 0, 130));
        g2.fillOval(centerX - 25, centerY - 25, 50, 50);
    }
}