import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.*;
import javax.sound.sampled.*;

public class Sound {

        public static void main(String[] args){

        }

        public static void testSound() throws IOException, LineUnavailableException, UnsupportedAudioFileException {
            URL testSound = new URL("https://assets.mixkit.co/sfx/download/mixkit-ominous-drums-227.wav");
            Clip clip = AudioSystem.getClip();

            // getAudioInputStream() also accepts a File or InputStream
            AudioInputStream ais = AudioSystem.getAudioInputStream(testSound);
            clip.open(ais);
            clip.start();
        }
}
