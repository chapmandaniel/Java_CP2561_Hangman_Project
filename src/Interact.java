import java.util.Scanner;

public class Interact {

    /**
     * get Players guess
     * @return guess from player
     */
    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter letter or type solution: ");
        String input = scanner.nextLine();

        String regex = "^[a-zA-Z ]+";
        while (!input.matches(regex)) {
            System.out.println("Invalid guess. Alphabet Characters only...");
            input = scanner.nextLine();
        }
        return input.toUpperCase();
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

    /**
     * Get player's difficulty level
     * @return difficulty level 'easy', 'medium', or 'hard'
     */
    static String getDifficultyLevel() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a difficulty level (type number):\n\n1.Easy  2.Medium  3.Hard\n");
        String level = scanner.nextLine();
        String regex = "^[1-3]$";

        while (!level.matches(regex)) {
            System.out.println("Invalid difficulty level. Please enter a number 1, 2, or 3.");
            level = scanner.nextLine();
        }

        System.out.println("You have selected difficulty level " + level);
        if (level.equals("1")) {
            return "easy";
        } else if (level.equals("2")) {
            return "medium";
        } else {
            return "hard";
        }
    }

    /**
     * Ask player if they want to quit
     * @return true if player wants to quit, false if player wants to resume
     */
    public static boolean askToQuitGame(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Would you like to play again? (y/n) ");
        String answer = scanner.nextLine();
        while (!answer.equals("y") && !answer.equals("n")) {
            System.out.println("Invalid answer. Please enter y or n.");
            answer = scanner.nextLine();
        }
        if (answer.equals("y")) {
            return false;
        } else {
            return true;
        }
    }


}
