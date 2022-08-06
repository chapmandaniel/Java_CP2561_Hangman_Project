import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.*;

public class Sound {

    /**
     * Class requirements
     * 1. play intro music
     * 2. play correct guess sound
     * 3. play incorrect guess sound
     * 4. play win sound
     * 5. play lose sound
     */

        public static void main(String[] args){

        }


        public static void playIntroMusic(){
            try {
                //URL introMusic = new URL("https://assets.mixkit.co/sfx/download/mixkit-ominous-drums-227.wav");
                File introMusic = new File("sounds/drums.wav");
                Clip clip = AudioSystem.getClip();
                AudioInputStream ais = AudioSystem.getAudioInputStream(introMusic);
                clip.open(ais);
                clip.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    public static void playCorrectSound(){
        try {
            File introMusic = new File("sounds/correct.wav");
            Clip clip = AudioSystem.getClip();
            AudioInputStream ais = AudioSystem.getAudioInputStream(introMusic);
            clip.open(ais);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void playIncorrectSound(){
        try {
            File introMusic = new File("sounds/error.wav");
            Clip clip = AudioSystem.getClip();
            AudioInputStream ais = AudioSystem.getAudioInputStream(introMusic);
            clip.open(ais);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void gameOverSound(){
        try {
            File introMusic = new File("sounds/gameover.wav");
            Clip clip = AudioSystem.getClip();
            AudioInputStream ais = AudioSystem.getAudioInputStream(introMusic);
            clip.open(ais);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
