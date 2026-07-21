import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

// Main Applet Class
public class ChildFrameApplet extends Applet implements ActionListener {
    Button btn;

    public void init() {
        btn = new Button("Open Child Frame");
        add(btn);
        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        // Create child frame when button is clicked
        ChildFrame cf = new ChildFrame();
        cf.setSize(300, 200);
        cf.setVisible(true);
    }
}

// Child Frame Class
class ChildFrame extends Frame {
    Label lbl;

    public ChildFrame() {
        setTitle("Child Frame Window");
        setLayout(new FlowLayout());

        lbl = new Label("This is a Child Frame");
        add(lbl);

        // Close operation
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }
}