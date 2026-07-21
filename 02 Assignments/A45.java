import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class A45 extends Applet implements AdjustmentListener {

    Scrollbar s1;

    int value = 0;

    public void init() {

        setLayout(null);

        // Create Horizontal Scrollbar
        s1 = new Scrollbar(Scrollbar.HORIZONTAL,
                           0, 10, 0, 110);

        // Set Position and Size
        s1.setBounds(80, 120, 300, 40);

        // Add Scrollbar
        add(s1);

        // Add Listener
        s1.addAdjustmentListener(this);

        setBackground(Color.white);
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {

        // Get Scrollbar Value
        value = s1.getValue();

        repaint();
    }

    public void paint(Graphics g) {

        // Title
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.setColor(Color.black);

        g.drawString("Scrollbar Demonstration", 70, 50);

        // Show Scrollbar Value
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(Color.blue);

        g.drawString("Scrollbar Value: " + value,
                     100, 230);

        // Draw Rectangle based on scrollbar value
        g.setColor(Color.red);

        g.fillRect(100, 260, value * 2, 40);
    }
}