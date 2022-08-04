import java.util.ArrayList;
import java.util.List;


public class Game {

    private String difficulty;
    private String secretWord;
    private String playerName;
    private int guessesLeft = 6;
    private final List<Character> GUESSED = new ArrayList<Character>();
    private Boolean gameOver;

    //constructor for game
    public Game() {
        this.gameOver = false;
        this.playerName = Interact.getUserName();
        this.difficulty = Interact.getDifficultyLevel();
        this.secretWord = getRandomWord(difficulty);
    }


/**
 * Method to set a random secret word
 * NEEDS CUSTOMIZATION CURRENTLY PLACEHOLDER
  */

    private String getRandomWord(String difficulty) {
        return "Puck";
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

    public Boolean getGameOver() {
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
            Graphics.displayWinGraphic();
        }

        //check if guessesLeft is 0
        if (this.guessesLeft == 0) {
            this.gameOver = true;
            System.out.println("You lose!");
        }

    }

    public String getPlayerName() {
        return this.playerName;
    }

    public void printHeader() {
        System.out.println("\n" +
                "\n===============================================================" +
                "\n|| Name: " + this.playerName + "         Difficulty:" + this.difficulty +
                "\n|| Solve: " + displayGameBoard() +
                "\n===============================================================\n");
    }

    private String guessesLeftMessage() {
        return "You have " + this.guessesLeft + " guesses left.\n";
    }

    public void takeTurn() {
        Character letter = Interact.getPlayerGuess();
        GUESSED.add(letter);
     }


    public String guessesLeft() {
        return (Integer.toString(this.guessesLeft));
    }
}
