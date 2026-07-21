import java.awt.*;
import java.awt.event.*;

public class MenuBarDemo extends Frame implements ActionListener {

    MenuBar mb;
    Menu file, edit;
    MenuItem open, save, exit, cut, copy, paste;

    public MenuBarDemo() {

        // Create MenuBar
        mb = new MenuBar();

        // Create Menus
        file = new Menu("File");
        edit = new Menu("Edit");

        // Create MenuItems
        open = new MenuItem("Open");
        save = new MenuItem("Save");
        exit = new MenuItem("Exit");

        cut = new MenuItem("Cut");
        copy = new MenuItem("Copy");
        paste = new MenuItem("Paste");

        // Add items to menus
        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(exit);

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);

        // Add menus to MenuBar
        mb.add(file);
        mb.add(edit);

        // Set MenuBar to Frame
        setMenuBar(mb);

        // Add listeners
        open.addActionListener(this);
        save.addActionListener(this);
        exit.addActionListener(this);
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);

        // Frame settings
        setSize(400, 300);
        setTitle("Menu Bar Demo");
        setLayout(new FlowLayout());
        setVisible(true);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String msg = "You selected: " + e.getActionCommand();
        System.out.println(msg);
    }

    public static void main(String[] args) {
        new MenuBarDemo();
    }
}