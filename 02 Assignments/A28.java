import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class A28 extends Applet implements ActionListener {

    Button b;

    public void init() {

        b = new Button("Open Child Frame");

        add(b);

        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        // Create child frame
        Frame f = new Frame("Child Frame");

        f.setSize(300, 200);

        //f.setLayout(new FlowLayout());

        Label l = new Label("This is Child Frame Window");

        f.add(l);

        f.setVisible(true);
    }
}