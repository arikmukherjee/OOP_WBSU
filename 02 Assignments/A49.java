import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;

public class A49 extends Applet
implements ActionListener {

    Button b1, b2, b3;

    AudioClip audio;

    public void init() {

        setLayout(null);

        // Load Sound File
        audio = getAudioClip(getDocumentBase(),
                             "song.wav");

        // Create Buttons
        b1 = new Button("Play");
        b2 = new Button("Stop");
        b3 = new Button("Loop");

        // Set Positions
        b1.setBounds(70, 80, 80, 40);
        b2.setBounds(180, 80, 80, 40);
        b3.setBounds(290, 80, 80, 40);

        // Add Buttons
        add(b1);
        add(b2);
        add(b3);

        // Add Action Listener
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setBackground(Color.white);
    }

    public void actionPerformed(ActionEvent e) {

        // Play Sound
        if (e.getSource() == b1) {

            audio.play();
        }

        // Stop Sound
        if (e.getSource() == b2) {

            audio.stop();
        }

        // Loop Sound
        if (e.getSource() == b3) {

            audio.loop();
        }
    }

    public void paint(Graphics g) {

        g.setFont(new Font("Arial",
                           Font.BOLD, 24));

        g.drawString("Sound Effect Demonstration",
                     50, 40);
    }
}