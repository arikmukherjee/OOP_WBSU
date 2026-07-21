import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class A42 extends Applet implements ItemListener {

    Checkbox c1, c2, c3;

    String msg = "No Checkbox Selected";

    public void init() {

        setLayout(null);

        // Create Checkboxes
        c1 = new Checkbox("Java");
        c2 = new Checkbox("Python");
        c3 = new Checkbox("C++");

        // Set Positions
        c1.setBounds(80, 80, 100, 30);
        c2.setBounds(80, 130, 100, 30);
        c3.setBounds(80, 180, 100, 30);

        // Add Checkboxes
        add(c1);
        add(c2);
        add(c3);

        // Add Item Listener
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        // Background Color
        setBackground(Color.white);
    }

    public void itemStateChanged(ItemEvent e) {

        msg = "Selected: ";

        if (c1.getState())
            msg += "Java ";

        if (c2.getState())
            msg += "Python ";

        if (c3.getState())
            msg += "C++ ";

        repaint();
    }

    public void paint(Graphics g) {

        // Title
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.setColor(Color.black);

        g.drawString("Checkbox Demonstration", 80, 40);

        // Display Selected Checkbox
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(Color.blue);

        g.drawString(msg, 80, 270);
    }
}