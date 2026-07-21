import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class A43 extends Applet implements ItemListener {

    Checkbox c1, c2, c3, c4;

    String msg = "";

    public void init() {

        setLayout(null);

        // Create Checkboxes
        c1 = new Checkbox("Cricket");
        c2 = new Checkbox("Football");
        c3 = new Checkbox("Chess");
        c4 = new Checkbox("Music");

        // Set Positions
        c1.setBounds(100, 80, 120, 30);
        c2.setBounds(100, 120, 120, 30);
        c3.setBounds(100, 160, 120, 30);
        c4.setBounds(100, 200, 120, 30);

        // Add Checkboxes
        add(c1);
        add(c2);
        add(c3);
        add(c4);

        // Add Item Listener
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);

        setBackground(Color.white);
    }

    public void itemStateChanged(ItemEvent e) {

        msg = "Selected: ";

        // Check selected checkboxes
        if (c1.getState())
            msg += "Cricket ";

        if (c2.getState())
            msg += "Football ";

        if (c3.getState())
            msg += "Chess ";

        if (c4.getState())
            msg += "Music ";

        repaint();
    }

    public void paint(Graphics g) {

        // Title
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.setColor(Color.black);

        g.drawString("Group of Checkboxes", 100, 40);

        // Output
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.setColor(Color.blue);

        g.drawString(msg, 80, 300);
    }
}