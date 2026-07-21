import java.applet.Applet;
import java.awt.*;

public class A37 extends Applet {

    public void paint(Graphics g) {

        setBackground(Color.white);

        Graphics2D g2 = (Graphics2D) g;

        // Title
        g2.setFont(new Font("Arial", Font.BOLD, 28));
        g2.setColor(Color.black);
        g2.drawString("Different Shapes", 180, 40);

        // -------- Rectangle --------
        g2.setColor(Color.red);
        g2.fillRect(50, 80, 120, 80);

        g2.setColor(Color.black);
        g2.drawString("Rectangle", 60, 180);

        // -------- Square --------
        g2.setColor(Color.blue);
        g2.fillRect(230, 80, 100, 100);

        g2.setColor(Color.black);
        g2.drawString("Square", 245, 200);

        // -------- Circle --------
        g2.setColor(Color.green);
        g2.fillOval(400, 80, 100, 100);

        g2.setColor(Color.black);
        g2.drawString("Circle", 425, 200);

        // -------- Oval --------
        g2.setColor(Color.orange);
        g2.fillOval(50, 260, 150, 80);

        g2.setColor(Color.black);
        g2.drawString("Oval", 95, 360);

        // -------- Triangle --------
        int tx[] = {280, 220, 340};
        int ty[] = {250, 350, 350};

        g2.setColor(Color.magenta);
        g2.fillPolygon(tx, ty, 3);

        g2.setColor(Color.black);
        g2.drawString("Triangle", 245, 380);

        // -------- Pentagon --------
        int px[] = {450, 400, 420, 480, 500};
        int py[] = {250, 300, 360, 360, 300};

        g2.setColor(Color.cyan);
        g2.fillPolygon(px, py, 5);

        g2.setColor(Color.black);
        g2.drawString("Pentagon", 425, 390);

        // -------- Line --------
        g2.setColor(Color.black);
        g2.setStroke(new BasicStroke(5));
        g2.drawLine(80, 450, 220, 450);

        g2.drawString("Line", 120, 490);

        // -------- Arc --------
        g2.setColor(Color.pink);
        g2.fillArc(320, 420, 120, 80, 0, 180);

        g2.setColor(Color.black);
        g2.drawString("Arc", 360, 530);
    }
}