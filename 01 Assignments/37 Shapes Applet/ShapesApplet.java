import java.applet.Applet;
import java.awt.*;

public class ShapesApplet extends Applet {

    public void paint(Graphics g) {

        // Rectangle
        g.setColor(Color.red);
        g.drawRect(50, 50, 100, 60);
        g.drawString("Rectangle", 60, 45);

        // Filled Rectangle
        g.setColor(Color.green);
        g.fillRect(200, 50, 100, 60);
        g.drawString("Filled Rectangle", 190, 45);

        // Circle
        g.setColor(Color.blue);
        g.drawOval(50, 150, 80, 80);
        g.drawString("Circle", 60, 140);

        // Filled Circle
        g.setColor(Color.orange);
        g.fillOval(200, 150, 80, 80);
        g.drawString("Filled Circle", 190, 140);

        // Line
        g.setColor(Color.black);
        g.drawLine(50, 260, 200, 260);
        g.drawString("Line", 120, 250);

        // Oval
        g.setColor(Color.cyan);
        g.drawOval(250, 250, 120, 60);
        g.drawString("Oval", 300, 240);

        // Polygon (Triangle)
        int x[] = {100, 50, 150};
        int y[] = {320, 400, 400};

        g.setColor(Color.magenta);
        g.drawPolygon(x, y, 3);
        g.drawString("Triangle", 80, 310);
    }
}