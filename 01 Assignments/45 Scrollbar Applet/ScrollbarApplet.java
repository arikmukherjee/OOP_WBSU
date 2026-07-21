import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ScrollbarApplet extends Applet implements AdjustmentListener {

    Scrollbar sb;
    int value = 0;

    public void init() {

        setLayout(new FlowLayout());

        // Create horizontal scrollbar
        sb = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 100);

        // Add scrollbar
        add(sb);

        // Register listener
        sb.addAdjustmentListener(this);
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        value = sb.getValue();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("Scrollbar Value: " + value, 50, 100);
    }
}