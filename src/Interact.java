import java.util.Scanner;

public class Interact {


    /**
     * get Players guess
     *
     * @return guess from player
     */
    static char getPlayerGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter guess: ");
        //regex for only letters
        String guess = scanner.nextLine();
        String regex = "[a-zA-Z]";
        while (!guess.matches(regex)) {
            System.out.println("Invalid guess. Please enter a letter.");
            guess = scanner.nextLine();
        }
        return guess.charAt(0);
    }

    /**
     * Get player's name
     * @return username
     */
    static String getUserName() {
        System.out.print("Welcome to Hangman! What's your name? ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static String getDifficultyLevel() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a difficulty level (type number):\n 1. Easy\n 2. Medium\n 3. Hard\n");
        int level = scanner.nextInt();
        while (level < 1 || level > 3) {
            System.out.println("Invalid difficulty level. Please enter a number between 1 and 3.");
            level = scanner.nextInt();
        }
        System.out.println("You have selected difficulty level " + level);
        if (level == 1) {
            return "easy";
        } else if (level == 2) {
            return "medium";
        } else {
            return "hard";
        }
    }


}
