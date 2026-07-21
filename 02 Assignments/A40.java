// A40.java
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class A40 extends Applet implements ActionListener {

    Label l1, l2, l3, result;
    TextField t1, t2, t3;
    Button b;

    public void init() {

        setLayout(null);

        // Label 1
        l1 = new Label("Name:");
        l1.setBounds(50, 50, 100, 30);

        // TextField 1
        t1 = new TextField();
        t1.setBounds(170, 50, 150, 30);

        // // Label 2
        // l2 = new Label("Roll Number:");
        // l2.setBounds(50, 100, 100, 30);

        // // TextField 2
        // t2 = new TextField();
        // t2.setBounds(170, 100, 150, 30);

        // // Label 3
        // l3 = new Label("Department:");
        // l3.setBounds(50, 150, 100, 30);

        // // TextField 3
        // t3 = new TextField();
        // t3.setBounds(170, 150, 150, 30);

        // Submit Button
        b = new Button("Submit");
        b.setBounds(170, 200, 80, 30);

        // Result Label
        result = new Label("");
        result.setBounds(50, 260, 400, 100);

        // Add Action Listener
        b.addActionListener(this);

        // Add Components
        add(l1);
        add(t1);

        // add(l2);
        // add(t2);

        // add(l3);
        // add(t3);

        add(b);
        add(result);

        // Background Color
        setBackground(Color.white);
    }

    public void actionPerformed(ActionEvent e) {

        String name = t1.getText();
            // String roll = t2.getText();
            // String dept = t3.getText();

        result.setText("Name: " + name);
        // | Roll: " + roll +
        // | Department: " + dept);
    }
}