import java.applet.Applet;
import java.awt.*;

public class flag extends Applet {

    public void paint(Graphics g) {

        // Saffron
        g.setColor(Color.orange);
        g.fillRect(100, 100, 300, 60);

        // White
        g.setColor(Color.white);
        g.fillRect(100, 160, 300, 60);

        // Green
        g.setColor(Color.green);
        g.fillRect(100, 220, 300, 60);

        // Border
        g.setColor(Color.black);
        g.drawRect(100, 100, 300, 180);

        // Ashoka Chakra
        g.setColor(Color.blue);

        int x = 250;
        int y = 190;
        int r = 30;

        // Outer circle
        g.drawOval(x - r, y - r, 60, 60);

        // Inner circle
        g.drawOval(x - 5, y - 5, 10, 10);

        // 24 spokes
        for (int i = 0; i < 24; i++) {
            double angle = Math.toRadians(i * 15);

            int x1 = x + (int) (r * Math.cos(angle));
            int y1 = y + (int) (r * Math.sin(angle));

            g.drawLine(x, y, x1, y1);
        }
    }
}

/*
    <applet code="flag.class" width="500" height="400">
    </applet>
*/ 