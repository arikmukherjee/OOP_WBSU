import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class A27 extends Applet implements MouseListener {

    String message = "Perform Mouse Action";

    public void init() {

        addMouseListener(this);

        //setBackground(Color.white);
    }

    // Mouse clicked
    public void mouseClicked(MouseEvent e) {
        message = "Mouse Clicked";
        repaint();
    }

    // Mouse entered
    public void mouseEntered(MouseEvent e) {
        message = "Mouse Entered";
        repaint();
    }

    // Mouse exited
    public void mouseExited(MouseEvent e) {
        message = "Mouse Exited";
        repaint();
    }

    // Mouse pressed
    public void mousePressed(MouseEvent e) {
        message = "Mouse Pressed";
        repaint();
    }

    // Mouse released
    public void mouseReleased(MouseEvent e) {
        message = "Mouse Released";
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(message, 50, 100);
    }
}