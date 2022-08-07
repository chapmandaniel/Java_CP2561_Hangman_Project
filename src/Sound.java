import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.*;

public class Sound {

        public static void main(String[] args){

        }

    public static void playCorrectSound(){
        try {
            File correctSound = new File("sounds/correct.wav");
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
            File errorSound = new File("sounds/error.wav");
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
            File gameOverMusic = new File("sounds/gameover.wav");
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
            File winMusic = new File("sounds/win.wav");
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
            File introMusic = new File("sounds/introsound.wav");
            Clip clip = AudioSystem.getClip();
            AudioInputStream ais = AudioSystem.getAudioInputStream(introMusic);
            clip.open(ais);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
