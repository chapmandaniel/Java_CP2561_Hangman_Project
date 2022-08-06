import java.util.ArrayList;
import java.util.List;


public class Game {

    private final String difficulty;
    private String secretWord;
    private final String playerName;
    private int guessesLeft = 6;
    private final List<Character> GUESSED = new ArrayList<Character>();
    private Boolean gameOver;

    private final WordLibrary wordLibrary;

    //constructor for game
    public Game() {
        this.playerName = Interact.getUserName();
        this.difficulty = Interact.getDifficultyLevel();
        wordLibrary = new WordLibrary(difficulty);
        this.initGame();
    }


/**
 * Method to set a random secret word
 * NEEDS CUSTOMIZATION CURRENTLY PLACEHOLDER
  */

    private String getRandomWord() {
        return this.secretWord;
    }


/**
 * Displays the word formatted with underscores and revealed guesses
 * @return String - the word with underscores and revealed guesses
 */

    public String displayGameBoard() {
        String word = secretWord.toLowerCase();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (GUESSED.contains(word.charAt(i))) {
                output.append(word.charAt(i));
            } else if(word.charAt(i) == ' ') {
                output.append(' ');
            }
            else {
                output.append("_");
            }
        }
        return output.toString();
    }

    public Boolean isGameOverCheck() {
        return gameOver;
    }


/**
 * Method to check if the user has won the game
 * if there aren't any underscores in the word, the user has won
 */

    public void validateGameOver(){
        //check if output contains underscores
        if(!this.displayGameBoard().contains("_")) {
            this.gameOver = true;
            System.out.println(Graphics.getWinGraphic());        }

        //check if guessesLeft is 0
        if (this.guessesLeft == 0) {
            this.gameOver = true;
            System.out.println(Graphics.drawHangman("0"));
            System.out.println(Graphics.getGameOverGraphic());
            Sound.gameOverSound();
        }

    }

    public String getPlayerName() {
        return this.playerName;
    }

    public void printHeader() {
        System.out.println(
                "\n------------------------------------------------------------------" +
                "\n Name: " + this.playerName + "\t\tDifficulty: " + this.difficulty + "\t\tWords Remaining: " + wordLibrary.wordsRemaining() +
                "\n------------------------------------------------------------------\n");

    }

    public void takeTurn() {
        Character letter = Interact.getPlayerGuess();
        GUESSED.add(letter);
        if (secretWord.toLowerCase().contains(letter.toString())) {
            Sound.playCorrectSound();
        } else {
            this.guessesLeft--;
            Sound.playIncorrectSound();
        }
     }


    public String guessesLeft() {
        return (Integer.toString(this.guessesLeft));
    }


    public void initGame() {
        this.gameOver = false;
        this.secretWord = wordLibrary.getRandomWord();
        this.guessesLeft = 6;
        this.GUESSED.clear();
    }

}
