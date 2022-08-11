import java.util.ArrayList;
import java.util.List;


public class Game {

    private String difficulty;
    private String secretWord;
    private final String playerName;
    private int guessesLeft = 6;
    private final List<Character> GUESSED = new ArrayList<Character>();
    private Boolean gameOver;
    private WordLibrary wordLibrary;


    /**-----------------------------------------------------------------------
     * Constructor for Game */

    public Game() {
        this.playerName = Interact.getUserName();
        this.difficulty = Interact.getDifficultyLevel();
        this.wordLibrary = new WordLibrary(difficulty);
        this.initGame();
    }


    /**-----------------------------------------------------------------------
     * Method displayGameBoard
     * Method to display word with hidden letters and guessed letters
     * 1. a StringBuilder is used to create a string of the word with hidden letters and guessed letters
     * 2. If the GUESSED list contains the current character in the word variable, it will append that character to the output variable.
     * 3. If the GUESSED list does not contain the current character in the word variable, it will append a '_' to the output variable.
     * 4. It will return the value of the output variable
     * @return String - the word with hidden letters and guessed letters
     */

    public String displayGameBoard() {
        String word = secretWord.toUpperCase();
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


    /**-----------------------------------------------------------------------
     * Method validateGameOver
     * Method to check if the game is over by analyzing the displayGameBoard() method result
     * 1. If the game board doesn't contain any underscores, then the game is over and the player wins.
     * 2. If the player has no guesses left, then the game is over and the player loses.
     */

    public void validateGameOver(){
        //check if output contains underscores
        if(!this.displayGameBoard().contains("_")) {
            this.gameOver = true;
            System.out.println(Graphics.getWinGraphic());
            Sound.playWinMusic();
            System.out.println("Congrats the word was: " + this.secretWord + "!\n");
        }

        //check if guessesLeft is 0
        if (this.guessesLeft == 0) {
            this.gameOver = true;
            System.out.println(Graphics.drawHangman("0"));
            System.out.println(Graphics.getGameOverGraphic());
            System.out.println("The word was: " + this.secretWord);
            Sound.gameOverSound();
        }
    }


    /**-----------------------------------------------------------------------
     * Method printHeader
     * Method to print a UI status bar
     */

    public void printHeader() {
        System.out.println("\n\n" +
                "\n----------------------------------------------------------------------------------------" +
                "\n Name: " + this.playerName + "\t\tDifficulty: " + this.difficulty + "\t\tWords Remaining: " + wordLibrary.wordsRemaining() +
                "\n----------------------------------------------------------------------------------------");

    }

    /**-----------------------------------------------------------------------
     * Method takeTurn
     * 1. It gets the user input
     * 2. If the user input is the secret word, it sets gameOver to true, plays the win music, and prints the win graphic.
     * 3. If the user input is a single character, it adds it to the GUESSED arraylist, and if it's in the secret word, it plays the correct sound, otherwise it plays the incorrect sound.
     */

     public void takeTurn(){
        String userInput = Interact.getUserInput();

         if(userInput.equals(secretWord)){
            this.gameOver = true;
            System.out.println(Graphics.getWinGraphic());
            Sound.playWinMusic();
            System.out.println("Congrats the word was: " + this.secretWord + "!\n");
        }

        if(!userInput.equals(secretWord) && userInput.length() > 1){
            Sound.playIncorrectSound();
            this.gameOver = true;
            System.out.println(Graphics.getGameOverGraphic());
            System.out.println("Sorry Game Over. The word was: " + this.secretWord + "\n");
        }

        if(userInput.length() == 1){

            if(GUESSED.contains(userInput.charAt(0))){
                Sound.playIncorrectSound();
                System.out.println("\nYou already guessed that letter.\n");
            }
            else if(secretWord.contains(userInput)){
                Sound.playCorrectSound();
            }
            else{
                Sound.playIncorrectSound();
                this.guessesLeft--;
            }
        }

        this.GUESSED.add(userInput.charAt(0));



     }


     public void changeDifficulty() {
         this.difficulty = Interact.getDifficultyLevel();
         this.wordLibrary = new WordLibrary(difficulty);
     }

    /**-----------------------------------------------------------------------
     * Method initGame
     * Method to initialize the game
     * 1. It gets a random word from the word library
     * 2. It sets the secret word to the random word
     * 3. It sets the gameOver to false
     * 4. It sets the guessesLeft to 6
     * 5. It sets the GUESSED arraylist to an empty arraylist
     */

    public void initGame() {
        this.gameOver = false;
        this.secretWord = wordLibrary.getRandomWord();
        this.guessesLeft = 6;
        this.GUESSED.clear();
    }


    /**-----------------------------------------------------------------------
     * Getters and setters */

    private String getRandomWord() {
        return this.secretWord;
    }
    public String guessesLeft() {return (Integer.toString(this.guessesLeft));}
    public String getPlayerName() {
        return this.playerName;
    }
    public Boolean isGameOverCheck() {return gameOver;}

}
