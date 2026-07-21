import java.applet.Applet;
import java.awt.*;

public class A35 extends Applet {

    public void paint(Graphics g) {

        setBackground(Color.white);

        Graphics2D g2 = (Graphics2D) g;

        // Applet size
        int width = getWidth();
        int height = getHeight();

        // Center position
        int centerX = width / 2;
        int centerY = height / 2;

        // Radius
        int radius = 140;

        // Title
        g2.setFont(new Font("Arial", Font.BOLD, 28));
        g2.setColor(Color.black);
        g2.drawString("Ashok Chakra", centerX - 110, 50);

        // Chakra Color
        g2.setColor(new Color(0, 0, 150));

        // Thick Outer Circle
        g2.setStroke(new BasicStroke(5));
        g2.drawOval(centerX - radius,
                    centerY - radius,
                    radius * 2,
                    radius * 2);

        // Inner Circle
        g2.setStroke(new BasicStroke(3));
        g2.drawOval(centerX - 20,
                    centerY - 20,
                    40,
                    40);

        // 24 Spokes
        g2.setStroke(new BasicStroke(2));

        for (int i = 0; i < 24; i++) {

            double angle = Math.toRadians(i * 15);

            int x = centerX +
                    (int)(radius * Math.cos(angle));

            int y = centerY +
                    (int)(radius * Math.sin(angle));

            g2.drawLine(centerX, centerY, x, y);
        }

        // Decorative outer points
        for (int i = 0; i < 24; i++) {

            double angle = Math.toRadians(i * 15);

            int x = centerX +
                    (int)(radius * Math.cos(angle));

            int y = centerY +
                    (int)(radius * Math.sin(angle));

            g2.fillOval(x - 3, y - 3, 6, 6);
        }

        // Center Dot
        g2.fillOval(centerX - 8,
                    centerY - 8,
                    16,
                    16);
    }
}