import java.awt.*;
import java.applet.Applet;
public class test extends Applet
{
    public void paint(Graphics g)
    {
        int CX = getWidth()/2;
        int CY = getHeight()/2;
        g.setColor(Color.red);
        g.fillOval(CX - 50, CY - 50, 100, 100);
        g.drawOval(CX - 100, CY - 100, 200, 200);
        g.drawOval(CX - 150, CY - 150, 300, 300);  
    }
}

/*
<applet code="test.class" width="400" height="400">
</applet>
*/