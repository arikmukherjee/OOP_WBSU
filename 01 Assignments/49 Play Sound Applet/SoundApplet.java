import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;

public class SoundApplet extends Applet implements ActionListener {

    Button playBtn, stopBtn;
    AudioClip sound;

    public void init() {

        setLayout(new FlowLayout());

        // Load sound file (must be .wav)
        sound = getAudioClip(getDocumentBase(), "sound.wav");

        // Create buttons
        playBtn = new Button("Play");
        stopBtn = new Button("Stop");

        // Add buttons
        add(playBtn);
        add(stopBtn);

        // Add listeners
        playBtn.addActionListener(this);
        stopBtn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == playBtn) {
            sound.play();   // play once
        }
        else if (e.getSource() == stopBtn) {
            sound.stop();   // stop sound
        }
    }
}