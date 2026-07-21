import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class A44 extends Applet implements ItemListener {

    List l;

    String msg = "No Item Selected";

    public void init() {

        setLayout(null);

        // Create List
        // 8 visible rows, single selection
        l = new List(8, false);

        // Add Items
        l.add("Java");
        l.add("Python");
        l.add("C");
        l.add("C++");
        l.add("JavaScript");
        l.add("PHP");
        l.add("HTML");
        l.add("CSS");
        l.add("SQL");
        l.add("Android");

        // Set Larger Size
        l.setBounds(120, 80, 220, 180);

        // Add List
        add(l);

        // Add Listener
        l.addItemListener(this);

        setBackground(Color.white);
    }

    public void itemStateChanged(ItemEvent e) {

        // Get selected item
        msg = "Selected: " + l.getSelectedItem();

        repaint();
    }

    public void paint(Graphics g) {

        // Title
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.setColor(Color.black);

        g.drawString("List Demonstration", 120, 40);

        // Output
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(Color.blue);

        g.drawString(msg, 80, 320);
    }
}