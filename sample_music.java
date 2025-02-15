package java_course;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class sample_music 
{
    static sample_music audioPlayer;
     private Clip clip;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Music Player");
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon playIcon = new ImageIcon("C:\\Users\\gayat\\OneDrive\\Desktop\\music\\start_button.jpg");
        Image newPlayImg = playIcon.getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        playIcon = new ImageIcon(newPlayImg);

        ImageIcon stopIcon = new ImageIcon("C:\\Users\\gayat\\OneDrive\\Desktop\\music\\stop_button.jpg");
        Image newStopImg = stopIcon.getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        stopIcon = new ImageIcon(newStopImg);

        JButton playButton = new JButton(playIcon);
        playButton.setBounds(50, 100, 80, 80);

        JButton stopButton = new JButton(stopIcon);
        stopButton.setBounds(150, 100, 80, 80);

        frame.add(playButton);
        frame.add(stopButton);

        try {
            audioPlayer = new sample_music("C:\\Users\\gayat\\OneDrive\\Desktop\\Symphony.WAV");
        } catch (Exception e) {
            e.printStackTrace();
        }

        playButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                audioPlayer.play();
            }
        });

        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                audioPlayer.stop();
            }
        });

        frame.setVisible(true);
    }

    public sample_music(String filePath) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
        clip = AudioSystem.getClip();
        clip.open(audioInputStream);
    }

   public void play() {
        if (clip != null) {
            clip.setFramePosition(0);
            clip.start();
        }
    }

    public void stop() {
        if (clip != null) {
            clip.stop();
            clip.setFramePosition(0);
        }
    }
}

