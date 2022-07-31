import java.util.Scanner;

public class Interact {


    /**
     * get Players guess
     * @return guess from player
     */
    static String getPlayerGuess() {
        System.out.print("Enter guess: ");
        Scanner scanner = new Scanner(System.in);
        //regex for only letters
        String guess = scanner.nextLine();
        String regex = "[a-zA-Z]";
        while (!guess.matches(regex)) {
            System.out.println("Invalid guess. Please enter a letter.");
            guess = scanner.nextLine();
        }
        return scanner.nextLine();

    }

    /**
     * Get player's name
     * @return username
     */
    static String getUserName() {
        System.out.print("Enter your name to add your score to leaderboard: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
