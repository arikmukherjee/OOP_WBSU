import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame implements MouseListener {

    Label l;

    public MouseEventDemo() {
        l = new Label("Perform Mouse Actions");
        l.setBounds(50, 80, 300, 50);

        addMouseListener(this);
        add(l);

        setSize(400, 200);
        setLayout(null);
        setVisible(true);
    }

    // Mouse clicked
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }

    // Mouse pressed
    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }

    // Mouse released
    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }

    // Mouse entered
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }

    // Mouse exited
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }

    public static void main(String[] args) {
        new MouseEventDemo();
    }
}