import java.applet.Applet;
import java.awt.*;

public class A38 extends Applet {

    public void paint(Graphics g) {

        setBackground(Color.white);

        Graphics2D g2 = (Graphics2D) g;

        // Title
        g2.setFont(new Font("Arial", Font.BOLD, 28));
        g2.setColor(Color.black);
        g2.drawString("Different Font Styles", 180, 50);

        // Font 1
        g2.setFont(new Font("Serif", Font.PLAIN, 30));
        g2.setColor(Color.red);
        g2.drawString("Serif Plain Font", 100, 120);

        // Font 2
        g2.setFont(new Font("SansSerif", Font.BOLD, 30));
        g2.setColor(Color.blue);
        g2.drawString("SansSerif Bold Font", 100, 180);

        // Font 3
        g2.setFont(new Font("Monospaced", Font.ITALIC, 30));
        g2.setColor(Color.green);
        g2.drawString("Monospaced Italic Font", 100, 240);

        // Font 4
        g2.setFont(new Font("Dialog", Font.BOLD + Font.ITALIC, 30));
        g2.setColor(Color.magenta);
        g2.drawString("Dialog Bold Italic Font", 100, 300);

        // Font 5
        g2.setFont(new Font("Courier", Font.PLAIN, 32));
        g2.setColor(Color.orange);
        g2.drawString("Courier Plain Font", 100, 360);

        // Font 6
        g2.setFont(new Font("TimesRoman", Font.BOLD, 34));
        g2.setColor(Color.darkGray);
        g2.drawString("TimesRoman Bold Font", 100, 430);
    }
}