import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordLibrary {

    private String difficulty;
    private final List<String> SECRET_WORDS = new ArrayList<String>();

    public WordLibrary(String difficulty) {
        this.difficulty = difficulty;
        this.loadWords();
    }

    public void loadWords(){
        BufferedReader br = null;
        String fileName = "";
        if(difficulty.equals("easy")) {
            fileName = "easyWords.txt";
        } else if(difficulty.equals("medium")) {
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

    public String getRandomWord() {
        Random random = new Random();
        int randomIndex = random.nextInt(SECRET_WORDS.size());
        String randomWord = SECRET_WORDS.get(randomIndex);
        SECRET_WORDS.remove(randomIndex);
        return randomWord;
    }

    public int wordsRemaining() {
        return SECRET_WORDS.size();
    }
}
