import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class CheckboxApplet extends Applet implements ItemListener {

    Checkbox c1, c2, c3;
    String msg = "";

    public void init() {

        setLayout(new FlowLayout());

        // Create checkboxes
        c1 = new Checkbox("Java");
        c2 = new Checkbox("Python");
        c3 = new Checkbox("C++");

        // Add checkboxes
        add(c1);
        add(c2);
        add(c3);

        // Register item listener
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {

        msg = "Selected: ";

        if (c1.getState()) msg += "Java ";
        if (c2.getState()) msg += "Python ";
        if (c3.getState()) msg += "C++ ";

        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 100);
    }
}