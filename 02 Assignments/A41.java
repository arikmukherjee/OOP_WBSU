import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class A41 extends Applet implements ActionListener {

    Button b1, b2, b3, b4;

    String msg = "No Button Pressed";

    public void init() {

        setLayout(null);

        // Create Buttons
        b1 = new Button("OK");
        b2 = new Button("Cancel");
        b3 = new Button("Submit");
        b4 = new Button("Reset");

        // Set Button Positions
        b1.setBounds(80, 70, 100, 40);
        b2.setBounds(220, 70, 100, 40);
        b3.setBounds(80, 150, 100, 40);
        b4.setBounds(220, 150, 100, 40);

        // Add Buttons
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        // Add Action Listener
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        setBackground(Color.white);
    }

    public void actionPerformed(ActionEvent e) {

        // Check which button is pressed
        if (e.getSource() == b1) {
            msg = "OK Button Pressed";
        }

        else if (e.getSource() == b2) {
            msg = "Cancel Button Pressed";
        }

        else if (e.getSource() == b3) {
            msg = "Submit Button Pressed";
        }

        else if (e.getSource() == b4) {
            msg = "Reset Button Pressed";
        }

        repaint();
    }

    public void paint(Graphics g) {

        // Title
        // g.setFont(new Font("Arial", Font.BOLD, 24));
        // g.setColor(Color.black);

        g.drawString("Button Demonstration", 80, 40);

        // Display Pressed Button Message
        // g.setFont(new Font("Arial", Font.BOLD, 20));
        // g.setColor(Color.blue);

        g.drawString(msg, 90, 250);
    }
}