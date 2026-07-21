import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class A46 extends Applet implements ActionListener {

    TextField t1;

    Button b[];

    String buttons[] = {
        "7", "8", "9", "/",
        "4", "5", "6", "*",
        "1", "2", "3", "-",
        "0", ".", "=", "+",
        "C", "%", "√", "^"
    };

    String expression = "";

    public void init() {

        setLayout(null);

        // TextField
        t1 = new TextField();

        t1.setBounds(40, 50, 320, 50);

        t1.setFont(new Font("Arial", Font.BOLD, 24));

        add(t1);

        // Buttons
        b = new Button[20];

        int x = 40;
        int y = 130;

        int k = 0;

        for (int i = 0; i < 5; i++) {

            x = 40;

            for (int j = 0; j < 4; j++) {

                b[k] = new Button(buttons[k]);

                b[k].setBounds(x, y, 70, 50);

                b[k].setFont(
                    new Font("Arial", Font.BOLD, 20));

                add(b[k]);

                b[k].addActionListener(this);

                x += 80;

                k++;
            }

            y += 60;
        }

        setBackground(Color.white);
    }

    public void actionPerformed(ActionEvent e) {

        String s = e.getActionCommand();

        // Clear
        if (s.equals("C")) {

            expression = "";

            t1.setText("");
        }

        // Equal
        else if (s.equals("=")) {

            try {

                double result = calculate(expression);

                t1.setText(expression + " = " + result);

                expression = "" + result;
            }
            catch (Exception ex) {

                t1.setText("Error");
            }
        }

        // Square Root
        else if (s.equals("√")) {

            try {

                double n =
                    Double.parseDouble(expression);

                double r = Math.sqrt(n);

                t1.setText("√" + n + " = " + r);

                expression = "" + r;
            }
            catch (Exception ex) {

                t1.setText("Error");
            }
        }

        // Percentage
        else if (s.equals("%")) {

            try {

                double n =
                    Double.parseDouble(expression);

                double r = n / 100;

                t1.setText(n + "% = " + r);

                expression = "" + r;
            }
            catch (Exception ex) {

                t1.setText("Error");
            }
        }

        // Power
        else if (s.equals("^")) {

            expression += "^";

            t1.setText(expression);
        }

        // Normal Input
        else {

            // Maximum 10 operations
            int count = 0;

            for (int i = 0;
                 i < expression.length(); i++) {

                char ch = expression.charAt(i);

                if (ch == '+' || ch == '-' ||
                    ch == '*' || ch == '/' ||
                    ch == '^') {

                    count++;
                }
            }

            if (count < 10 ||
                !(s.equals("+") || s.equals("-") ||
                  s.equals("*") || s.equals("/") ||
                  s.equals("^"))) {

                expression += s;

                t1.setText(expression);
            }
        }
    }

    // Calculation Method
    double calculate(String exp) {

        // Power
        if (exp.contains("^")) {

            String p[] = exp.split("\\^");

            double a = Double.parseDouble(p[0]);

            double b = Double.parseDouble(p[1]);

            return Math.pow(a, b);
        }

        // Addition
        if (exp.contains("+")) {

            String p[] = exp.split("\\+");

            double sum = 0;

            for (int i = 0; i < p.length; i++) {

                sum += Double.parseDouble(p[i]);
            }

            return sum;
        }

        // Subtraction
        if (exp.contains("-")) {

            String p[] = exp.split("-");

            double ans = Double.parseDouble(p[0]);

            for (int i = 1; i < p.length; i++) {

                ans -= Double.parseDouble(p[i]);
            }

            return ans;
        }

        // Multiplication
        if (exp.contains("*")) {

            String p[] = exp.split("\\*");

            double ans = 1;

            for (int i = 0; i < p.length; i++) {

                ans *= Double.parseDouble(p[i]);
            }

            return ans;
        }

        // Division
        if (exp.contains("/")) {

            String p[] = exp.split("/");

            double ans = Double.parseDouble(p[0]);

            for (int i = 1; i < p.length; i++) {

                ans /= Double.parseDouble(p[i]);
            }

            return ans;
        }

        return Double.parseDouble(exp);
    }

    public void paint(Graphics g) {

        g.setFont(new Font("Arial", Font.BOLD, 28));

        g.drawString("Advanced Calculator", 60, 30);
    }
}