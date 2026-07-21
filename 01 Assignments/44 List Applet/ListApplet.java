import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ListApplet extends Applet implements ItemListener {

    List list;
    String msg = "";

    public void init() {

        setLayout(new FlowLayout());

        // Create list (allow multiple selection: true)
        list = new List(5, true);

        // Add items
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");
        list.add("Go");

        // Add list to applet
        add(list);

        // Register listener
        list.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {

        msg = "Selected: ";

        String selectedItems[] = list.getSelectedItems();

        for (int i = 0; i < selectedItems.length; i++) {
            msg += selectedItems[i] + " ";
        }

        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 150);
    }
}