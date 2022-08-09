import java.net.URL;
import javax.sound.sampled.*;

public class Sound {

    public static void playCorrectSound(){
        try {
            URL correctSound = Main.class.getClassLoader().getResource("sounds/correct.wav");
            Clip clip = AudioSystem.getClip();
            AudioInputStream ais = AudioSystem.getAudioInputStream(correctSound);
            clip.open(ais);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void playIncorrectSound(){
        try {
            URL errorSound = Main.class.getClassLoader().getResource("sounds/error.wav");
            Clip clip = AudioSystem.getClip();
            AudioInputStream ais = AudioSystem.getAudioInputStream(errorSound);
            clip.open(ais);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void gameOverSound(){
        try {
            URL gameOverMusic = Main.class.getClassLoader().getResource("sounds/gameover.wav");
            Clip clip = AudioSystem.getClip();
            AudioInputStream ais = AudioSystem.getAudioInputStream(gameOverMusic);
            clip.open(ais);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void playWinMusic(){
        try {
            URL winMusic = Main.class.getClassLoader().getResource("sounds/win.wav");
            Clip clip = AudioSystem.getClip();
            AudioInputStream ais = AudioSystem.getAudioInputStream(winMusic);
            clip.open(ais);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void playIntroMusic(){
        try {
            URL sound = Main.class.getClassLoader().getResource("sounds/introsound.wav");
            Clip clip = AudioSystem.getClip();
            AudioInputStream ais = AudioSystem.getAudioInputStream(sound);
            clip.open(ais);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
