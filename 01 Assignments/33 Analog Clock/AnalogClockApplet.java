import java.applet.Applet;
import java.awt.*;
import java.util.Calendar;

public class AnalogClockApplet extends Applet implements Runnable {

    Thread t;

    public void init() {
        setBackground(Color.white);
        t = new Thread(this);
        t.start();
    }

    public void run() {
        try {
            while (true) {
                repaint();
                Thread.sleep(1000); // update every second
            }
        } catch (Exception e) {}
    }

    public void paint(Graphics g) {
        int centerX = 200;
        int centerY = 150;

        // Draw clock circle
        g.setColor(Color.black);
        g.drawOval(centerX - 100, centerY - 100, 200, 200);

        // Draw numbers (12, 3, 6, 9)
        g.drawString("12", centerX - 10, centerY - 80);
        g.drawString("3", centerX + 80, centerY + 5);
        g.drawString("6", centerX - 5, centerY + 90);
        g.drawString("9", centerX - 90, centerY + 5);

        // Get current time
        Calendar cal = Calendar.getInstance();
        int sec = cal.get(Calendar.SECOND);
        int min = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR);

        // Calculate angles
        double secAngle = Math.toRadians(sec * 6 - 90);
        double minAngle = Math.toRadians(min * 6 - 90);
        double hourAngle = Math.toRadians((hour + min / 60.0) * 30 - 90);

        // Second hand
        int xSec = centerX + (int)(80 * Math.cos(secAngle));
        int ySec = centerY + (int)(80 * Math.sin(secAngle));
        g.setColor(Color.red);
        g.drawLine(centerX, centerY, xSec, ySec);

        // Minute hand
        int xMin = centerX + (int)(70 * Math.cos(minAngle));
        int yMin = centerY + (int)(70 * Math.sin(minAngle));
        g.setColor(Color.blue);
        g.drawLine(centerX, centerY, xMin, yMin);

        // Hour hand
        int xHour = centerX + (int)(50 * Math.cos(hourAngle));
        int yHour = centerY + (int)(50 * Math.sin(hourAngle));
        g.setColor(Color.black);
        g.drawLine(centerX, centerY, xHour, yHour);
    }
}