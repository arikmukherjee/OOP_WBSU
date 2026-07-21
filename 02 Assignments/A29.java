import java.applet.Applet;
import java.awt.*;

public class A29 extends Applet {

    public void paint(Graphics g) {

        // Background color (night sky)
        setBackground(Color.black);

        // ---------------- MOON ----------------

        // White half moon at left corner
        g.setColor(Color.white);
        g.fillOval(30, 30, 50, 50);

        // Black circle for half moon effect
        // g.setColor(Color.black);
        // g.fillOval(50, 30, 50, 50);

        // ---------------- STARS ----------------

        g.setColor(Color.white);

        // Small stars
        g.fillOval(120, 40, 4, 4);
        g.fillOval(180, 80, 4, 4);
        g.fillOval(250, 50, 4, 4);
        g.fillOval(320, 100, 4, 4);
        g.fillOval(400, 60, 4, 4);
        g.fillOval(500, 40, 4, 4);
        g.fillOval(550, 90, 4, 4);

        // Twinkling stars
        // g.drawString("*", 150, 140);
        // g.drawString("*", 280, 160);
        // g.drawString("*", 420, 130);
        // g.drawString("*", 520, 170);

        // Title
        //g.setFont(new Font("Arial", Font.BOLD, 18));
        //g.drawString("Night Sky", 250, 30);
    }
}