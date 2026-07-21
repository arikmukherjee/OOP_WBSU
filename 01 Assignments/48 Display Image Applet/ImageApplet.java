import java.applet.Applet;
import java.awt.*;

public class ImageApplet extends Applet {

    Image img;

    public void init() {
        // Load image from same folder
        img = getImage(getDocumentBase(), "java.png");
    }

    public void paint(Graphics g) {
        // Draw image on applet window
        g.drawImage(img, 50, 50, this);
    }
}