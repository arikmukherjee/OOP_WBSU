import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ButtonApplet extends Applet implements ActionListener {

    Button b1, b2, b3;
    String msg = "";

    public void init() {

        setLayout(new FlowLayout());

        // Create buttons
        b1 = new Button("OK");
        b2 = new Button("Cancel");
        b3 = new Button("Submit");

        // Add buttons
        add(b1);
        add(b2);
        add(b3);

        // Register action listener
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            msg = "OK Button Clicked";
        } else if (e.getSource() == b2) {
            msg = "Cancel Button Clicked";
        } else if (e.getSource() == b3) {
            msg = "Submit Button Clicked";
        }

        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 100);
    }
}