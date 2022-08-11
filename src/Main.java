public class Main {

    public static void main(String[] args) {
        String play = "y";
        System.out.println(Graphics.getGameTitle());
        Sound.playIntroMusic();

        Game currentGame = new Game();
        currentGame.printHeader();

        while (play.equals("y")) {
            while (!currentGame.isGameOverCheck()) {
                System.out.println(Graphics.drawHangman(currentGame.guessesLeft()));
                System.out.println("\nSolve: " + currentGame.displayGameBoard() + "\n");
                currentGame.takeTurn();
                currentGame.validateGameOver();
            }
            play = Interact.playAgainCheck();

            if (play.equals("x")) {
                currentGame.changeDifficulty();
                currentGame.initGame();
                play = "y";
            }

            if (play.equals("y")) {
                currentGame.initGame();
                currentGame.printHeader();
            }
       }
        System.out.println("Thanks for playing!");
        System.exit(0);

    }
}
