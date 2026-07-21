// A47.java
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class A47 extends Applet implements ActionListener {

    Frame f;
    MenuBar mb;
    Menu file, edit;
    MenuItem newItem, openItem, exitItem, cutItem, copyItem;

    Label l;

    public void init() {

        // Create Frame
        f = new Frame("Menu Bar Demonstration");

        // Create MenuBar
        mb = new MenuBar();

        // Create Menus
        file = new Menu("File");
        edit = new Menu("Edit");

        // Create Menu Items
        newItem = new MenuItem("New");
        openItem = new MenuItem("Open");
        exitItem = new MenuItem("Exit");

        cutItem = new MenuItem("Cut");
        copyItem = new MenuItem("Copy");

        // Add Items to Menus
        file.add(newItem);
        file.add(openItem);
        file.add(exitItem);

        edit.add(cutItem);
        edit.add(copyItem);

        // Add Menus to MenuBar
        mb.add(file);
        mb.add(edit);

        // Set MenuBar to Frame
        f.setMenuBar(mb);

        // Label
        l = new Label("Select a Menu Item");
        f.add(l);

        // Add Action Listeners
        newItem.addActionListener(this);
        openItem.addActionListener(this);
        exitItem.addActionListener(this);
        cutItem.addActionListener(this);
        copyItem.addActionListener(this);

        // Frame Size and Visibility
        f.setSize(400, 300);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String s = e.getActionCommand();

        if (s.equals("Exit")) {
            f.dispose();
        } else {
            l.setText(s + " Menu Selected");
        }
    }
}