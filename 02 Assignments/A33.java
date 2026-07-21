import java.applet.Applet;
import java.awt.*;
import java.util.Calendar;

public class A33 extends Applet implements Runnable {

    Thread t;

    public void init() {

        setSize(600, 600);

        t = new Thread(this);
        t.start();
    }

    public void run() {

        while (true) {

            repaint();

            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {
            }
        }
    }

    public void paint(Graphics g) {

        setBackground(Color.white);

        int centerX = 300;
        int centerY = 300;
        int radius = 200;

        // Title
        g.setFont(new Font("Arial", Font.BOLD, 28));
        g.setColor(Color.black);
        g.drawString("Analog Clock", 210, 50);

        // Outer Circle
        g.drawOval(centerX - radius, centerY - radius,
                   radius * 2, radius * 2);

        // -------- CLOCK MARKINGS --------

        for (int i = 0; i < 60; i++) {

            double angle = Math.toRadians(i * 6 - 90);

            int x1, y1, x2, y2;

            // Big lines for hour points
            if (i % 5 == 0) {

                x1 = centerX + (int)(170 * Math.cos(angle));
                y1 = centerY + (int)(170 * Math.sin(angle));

                x2 = centerX + (int)(190 * Math.cos(angle));
                y2 = centerY + (int)(190 * Math.sin(angle));

            }
            else {

                // Small middle points
                x1 = centerX + (int)(180 * Math.cos(angle));
                y1 = centerY + (int)(180 * Math.sin(angle));

                x2 = centerX + (int)(190 * Math.cos(angle));
                y2 = centerY + (int)(190 * Math.sin(angle));
            }

            g.drawLine(x1, y1, x2, y2);
        }

        // -------- NUMBERS 1 TO 12 --------

        g.setFont(new Font("Arial", Font.BOLD, 20));

        for (int i = 1; i <= 12; i++) {

            double angle = Math.toRadians(i * 30 - 90);

            int x = centerX + (int)(150 * Math.cos(angle));
            int y = centerY + (int)(150 * Math.sin(angle));

            g.drawString("" + i, x - 10, y + 10);
        }

        // -------- CURRENT TIME --------

        Calendar c = Calendar.getInstance();

        int hour = c.get(Calendar.HOUR);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);

        // Angles
        double hourAngle =
            Math.toRadians((hour * 30) + (minute * 0.5) - 90);

        double minuteAngle =
            Math.toRadians(minute * 6 - 90);

        double secondAngle =
            Math.toRadians(second * 6 - 90);

        // -------- HOUR HAND (THICK) --------

        int hx = centerX + (int)(90 * Math.cos(hourAngle));
        int hy = centerY + (int)(90 * Math.sin(hourAngle));

        g.setColor(Color.black);

        Graphics2D g2 = (Graphics2D) g;

        g2.setStroke(new BasicStroke(6));
        g2.drawLine(centerX, centerY, hx, hy);

        // -------- MINUTE HAND --------

        int mx = centerX + (int)(130 * Math.cos(minuteAngle));
        int my = centerY + (int)(130 * Math.sin(minuteAngle));

        g.setColor(Color.blue);

        g2.setStroke(new BasicStroke(4));
        g2.drawLine(centerX, centerY, mx, my);

        // -------- SECOND HAND --------

        int sx = centerX + (int)(160 * Math.cos(secondAngle));
        int sy = centerY + (int)(160 * Math.sin(secondAngle));

        g.setColor(Color.red);

        g2.setStroke(new BasicStroke(2));
        g2.drawLine(centerX, centerY, sx, sy);

        // -------- CENTER DOT --------

        g.setColor(Color.black);
        g.fillOval(centerX - 6, centerY - 6, 12, 12);
    }
}