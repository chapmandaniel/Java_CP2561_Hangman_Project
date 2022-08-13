import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.net.URL;

public class Sound {

    private static Clip backgroundMusic;
    private static Clip soundClip;
    private static final URL correctSound = Main.class.getClassLoader().getResource("sounds/correct.wav");
    private static final URL errorSound = Main.class.getClassLoader().getResource("sounds/error.wav");
    private static final URL gameOverMusic = Main.class.getClassLoader().getResource("sounds/gameover.wav");
    private static final URL winMusic = Main.class.getClassLoader().getResource("sounds/win.wav");
    private static final URL introSound = Main.class.getClassLoader().getResource("sounds/introsound.wav");
    private static final URL background = Main.class.getClassLoader().getResource("sounds/background.wav");



    private static void playSoundEffect(URL soundEffect) {
        try {
            soundClip = AudioSystem.getClip();
            assert soundEffect != null;
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundEffect);
            soundClip.open(ais);
            soundClip.start();
            ais.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void playBackgroundMusic() {
        try {
            assert background != null;
            AudioInputStream ais = AudioSystem.getAudioInputStream(background);
            backgroundMusic = AudioSystem.getClip();
            backgroundMusic.open(ais);
            backgroundMusic.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void stopBackgroundMusic() {
        backgroundMusic.stop();
    }

    public static void playCorrectSound() {
        playSoundEffect(correctSound);
    }

    public static void playIncorrectSound() {
        playSoundEffect(errorSound);
    }

    public static void gameOverSound() {
        playSoundEffect(gameOverMusic);
    }


    public static void playWinMusic() {
        playSoundEffect(winMusic);
    }

    public static void playIntroMusic() {
        playSoundEffect(introSound);
    }

}
