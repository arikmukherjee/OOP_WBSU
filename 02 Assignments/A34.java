import java.applet.Applet;
import java.awt.*;

public class A34 extends Applet {

    public void paint(Graphics g) {

        setBackground(Color.white);

        // Title
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.setColor(Color.black);
        g.drawString("Indian National Flag", 170, 50);

        // ---------------- FLAG POLE ----------------

        g.setColor(new Color(139, 69, 19));
        g.fillRect(100, 80, 10, 320);

        // ---------------- FLAG ----------------

        int flagX = 110;
        int flagY = 100;
        int flagWidth = 300;
        int stripeHeight = 60;

        // Saffron
        g.setColor(Color.orange);
        g.fillRect(flagX, flagY, flagWidth, stripeHeight);

        // White
        g.setColor(Color.white);
        g.fillRect(flagX, flagY + stripeHeight,
                   flagWidth, stripeHeight);

        // Green
        g.setColor(Color.green);
        g.fillRect(flagX, flagY + (2 * stripeHeight),
                   flagWidth, stripeHeight);

        // Border
        g.setColor(Color.black);
        g.drawRect(flagX, flagY,
                   flagWidth, stripeHeight * 3);

        // ---------------- ASHOKA CHAKRA ----------------

        g.setColor(Color.blue);

        // Exact center of white stripe
        int centerX = flagX + flagWidth / 2;
        int centerY = flagY + stripeHeight + (stripeHeight / 2);

        int radius = 30;

        // Outer Circle
        g.drawOval(centerX - radius,
                   centerY - radius,
                   radius * 2,
                   radius * 2);

        // Inner Circle
        g.drawOval(centerX - 5,
                   centerY - 5,
                   10,
                   10);

        // 24 spokes
        for (int i = 0; i < 24; i++) {

            double angle = Math.toRadians(i * 15);

            int x = centerX +
                    (int)(radius * Math.cos(angle));

            int y = centerY +
                    (int)(radius * Math.sin(angle));

            g.drawLine(centerX, centerY, x, y);
        }

        // ---------------- BASE ----------------

        g.setColor(Color.darkGray);
        g.fillRect(60, 400, 90, 20);
    }
}