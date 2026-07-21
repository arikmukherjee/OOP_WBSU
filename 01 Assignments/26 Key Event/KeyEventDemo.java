import java.awt.*;
import java.awt.event.*;

public class KeyEventDemo extends Frame implements KeyListener {

    Label l;

    public KeyEventDemo() {
        l = new Label();
        l.setBounds(50, 50, 300, 50);

        addKeyListener(this);
        add(l);

        setSize(400, 200);
        setLayout(null);
        setVisible(true);
    }

    // When key is pressed
    public void keyPressed(KeyEvent e) {
        l.setText("Key Pressed: " + e.getKeyChar());
    }

    // When key is released
    public void keyReleased(KeyEvent e) {
        l.setText("Key Released: " + e.getKeyChar());
    }

    // When key is typed
    public void keyTyped(KeyEvent e) {
        l.setText("Key Typed: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new KeyEventDemo();
    }
}