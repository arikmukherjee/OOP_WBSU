import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="SquareApplet" width=1300 height=1300>
</applet>
*/

public class SquareApplet extends Applet {

    public void paint(Graphics g) {
        // Draw a square (x, y, width, height)
        g.drawRect(50, 50, 100, 100);
    }
}