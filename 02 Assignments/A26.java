import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class A26 extends Applet implements KeyListener {

    String message = "Press any key...";

    public void init() {

        addKeyListener(this);

        // setBackground(Color.white);

        // setFocusable(true);
    }

    public void keyPressed(KeyEvent e) {
        message = "Key Pressed: " + e.getKeyChar();
        repaint();
    }

    public void keyReleased(KeyEvent e) {
        message = "Key Released: " + e.getKeyChar();
        repaint();
    }

    public void keyTyped(KeyEvent e) {
        message = "Key Typed: " + e.getKeyChar();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(message, 50, 100);
    }
}