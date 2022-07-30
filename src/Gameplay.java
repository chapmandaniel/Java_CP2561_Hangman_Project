public class Gameplay {

    public static void main(String[] args) {
        System.out.println(Graphics.getGameTitle());
    }

    /**
     *  Description of events that occur in the game
     *  1. The game starts with a welcome message
     *  2. The user is prompted to enter their name
     *  3. The user is prompted to select a difficulty level
     *  4. The game will then start, graphics appear
     *          - the hangman graphic appears
     *          - the word is displayed as underscores
     *  5. The user is prompted to enter a letter
     *  6. The game checks if the letter is in the word
     *        - if it is, the letter is displayed in the word
     *        - if it is not, the hangman graphic is updated
     *        - if the hangman graphic is completely drawn, the user loses
     *        - if the word is completely displayed, the user wins
     *        - if the user enters a letter that has already been entered, the user is prompted to enter a new letter
     *        - if the user enters a letter that is not in the alphabet, the user is prompted to enter a new letter
     */

    /**
     * Gameplay methods
     * getPlayerName - prompts the user to enter their name
     * getDifficulty - prompts the user to select a difficulty level
     * getWord - returns a random word from the list of words, and removes it from the list
     * getLetter - prompts the user to enter a letter
     * checkLetter - checks if the letter is in the word
     * updateHangman - updates the hangman graphic
     * checkGameOver - checks if the word is completely displayed or if the hangman graphic is completely drawn
     * checkWin - checks if the user has won the game
     * checkLose - checks if the user has lost the game
     * displayWord - displays the word as underscores or letters according to progress
     * displayHangman - displays / updates the updated hangman graphic
     * displayWin - displays the win message
     * displayLose - displays the loss message
     *
     */
}
