import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class CalculatorApplet extends Applet implements ActionListener {

    TextField tf;
    Button b1, b2, b3, b4, b5;
    double num1, num2, result;
    char op;

    public void init() {

        setLayout(new FlowLayout());

        // Text field
        tf = new TextField(15);
        add(tf);

        // Buttons
        b1 = new Button("+");
        b2 = new Button("-");
        b3 = new Button("*");
        b4 = new Button("/");
        b5 = new Button("=");

        add(b1); add(b2); add(b3); add(b4); add(b5);

        // Add listeners
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        String str = tf.getText();

        if (e.getSource() == b1) {
            num1 = Double.parseDouble(str);
            op = '+';
            tf.setText("");
        }
        else if (e.getSource() == b2) {
            num1 = Double.parseDouble(str);
            op = '-';
            tf.setText("");
        }
        else if (e.getSource() == b3) {
            num1 = Double.parseDouble(str);
            op = '*';
            tf.setText("");
        }
        else if (e.getSource() == b4) {
            num1 = Double.parseDouble(str);
            op = '/';
            tf.setText("");
        }
        else if (e.getSource() == b5) {
            num2 = Double.parseDouble(str);

            switch(op) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
            }

            tf.setText(String.valueOf(result));
        }
    }
}