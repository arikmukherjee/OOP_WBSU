import java.applet.Applet;
import java.awt.*;

public class FontApplet extends Applet {

    public void paint(Graphics g) {

        String text = "Hello Java";

        // Font 1: Serif
        Font f1 = new Font("Serif", Font.PLAIN, 20);
        g.setFont(f1);
        g.drawString("Serif: " + text, 50, 50);

        // Font 2: SansSerif
        Font f2 = new Font("SansSerif", Font.BOLD, 20);
        g.setFont(f2);
        g.drawString("SansSerif (Bold): " + text, 50, 100);

        // Font 3: Monospaced
        Font f3 = new Font("Monospaced", Font.ITALIC, 20);
        g.setFont(f3);
        g.drawString("Monospaced (Italic): " + text, 50, 150);

        // Font 4: Dialog
        Font f4 = new Font("Dialog", Font.BOLD | Font.ITALIC, 20);
        g.setFont(f4);
        g.drawString("Dialog (Bold+Italic): " + text, 50, 200);

        // Font 5: Different Size
        Font f5 = new Font("Serif", Font.BOLD, 30);
        g.setFont(f5);
        g.drawString("Large Font: " + text, 50, 260);
    }
}