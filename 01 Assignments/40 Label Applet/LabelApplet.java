import java.applet.Applet;
import java.awt.*;

public class LabelApplet extends Applet {

    public void init() {

        // Set layout
        setLayout(new FlowLayout());

        // Create labels
        Label l1 = new Label("This is a simple label");
        Label l2 = new Label("Left aligned label", Label.LEFT);
        Label l3 = new Label("Center aligned label", Label.CENTER);
        Label l4 = new Label("Right aligned label", Label.RIGHT);

        // Add labels to applet
        add(l1);
        add(l2);
        add(l3);
        add(l4);
    }
}