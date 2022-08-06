import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordLibrary {

    private String difficulty;
    private final List<String> SECRET_WORDS = new ArrayList<String>();

    /**
     * Constructor for WordLibrary
     * @param difficulty - the difficulty level of the game
     */
    public WordLibrary(String difficulty) {
        this.difficulty = difficulty;
        this.loadWords(difficulty);
    }

    /**
     * Load word library matching difficulty level set by the user
     * @return void
     */
    public void loadWords(String level) {
        BufferedReader br = null;
        String fileName = "";
        if(level.equals("easy")) {
            fileName = "easyWords.txt";
        } else if(level.equals("medium")) {
            fileName = "mediumWords.txt";
        } else {
            fileName = "hardWords.txt";
        }

        try{
            br = new BufferedReader(new FileReader("words/" + fileName));
            String line;
            while((line = br.readLine()) != null){
                SECRET_WORDS.add(line);
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Get a random word from the word library
     * remove the word from the library so it can't be used again
     * @return String - a random word from the word library
     */
    public String getRandomWord() {
        Random random = new Random();
        int randomIndex = random.nextInt(SECRET_WORDS.size());
        String randomWord = SECRET_WORDS.get(randomIndex);
        SECRET_WORDS.remove(randomIndex);
        return randomWord;
    }


    /**
     * Get the number of words in the word library
     * @return int - the number of words in the word library
     */
    public int wordsRemaining() {
        return SECRET_WORDS.size();
    }
}
