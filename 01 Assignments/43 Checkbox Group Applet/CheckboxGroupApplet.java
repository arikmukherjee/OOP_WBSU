import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class CheckboxGroupApplet extends Applet implements ItemListener {

    Checkbox c1, c2, c3;
    CheckboxGroup group;
    String msg = "";

    public void init() {

        setLayout(new FlowLayout());

        // Create CheckboxGroup
        group = new CheckboxGroup();

        // Create checkboxes (radio buttons)
        c1 = new Checkbox("Male", group, false);
        c2 = new Checkbox("Female", group, false);
        c3 = new Checkbox("Other", group, false);

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

        Checkbox selected = group.getSelectedCheckbox();

        if (selected != null) {
            msg = "Selected: " + selected.getLabel();
        }

        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 100);
    }
}