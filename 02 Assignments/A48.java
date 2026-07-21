import java.applet.Applet;
import java.awt.*;

public class A48 extends Applet {

    Image img;

    public void init() {

        // Load Image
        img = getImage(getDocumentBase(), "images.png");

        setBackground(Color.white);
    }

    // public void paint(Graphics g) {

    //     // Title
    //     g.setFont(new Font("Arial", Font.BOLD, 24));

    //     g.drawString("Image Display", 150, 40);

    //     // Draw Image
    //     g.drawImage(img, 80, 80, 300, 200, this);
    // }
}