import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.exit;

public class WordLibrary {

    private final List<String> SECRET_WORDS = new ArrayList<String>();

    /**
     * Constructor for WordLibrary
     * @param difficulty - the difficulty level of the game
     */
    public WordLibrary(String difficulty) {
        this.loadWords(difficulty);
    }


    /**
     * Load word library matching difficulty level set by the user
     */
    public void loadWords(String level) {

        String fileName = "";

        switch (level) {
            case "easy":
                fileName = "words/easyWords.txt";
                break;
            case "medium":
                fileName = "words/mediumWords.txt";
                break;
            case "hard":
                fileName = "words/hardWords.txt";
                break;
            default:
                System.out.println("Invalid difficulty level");
                exit(0);
        }

        try{
            URL textFile = Main.class.getClassLoader().getResource(fileName);
            assert textFile != null;
            Scanner scanner = new Scanner(textFile.openStream());

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                SECRET_WORDS.add(line.toUpperCase());
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Get a random word from the word library
     * remove the word from the library, so it can't be used again
     * @return String - a random word from the word library
     */
    public String getRandomWord() {
        String randomWord = "";
        if (SECRET_WORDS.size() > 0) {
            Random random = new Random();
            int randomIndex = random.nextInt(SECRET_WORDS.size());
            randomWord = SECRET_WORDS.get(randomIndex);
            SECRET_WORDS.remove(randomIndex);
        } else {
            System.out.println("No words left in library! Game over!");
            exit(0);
        }
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
