public class Gameplay {

    private static Game currentGame;

    public static void main(String[] args) {
        boolean quit = false;
        System.out.println(Graphics.getGameTitle());

        currentGame = new Game();
        currentGame.printHeader();
        Sound.playIntroMusic();

        while (!quit) {
            while (!currentGame.isGameOverCheck()) {
                System.out.println(Graphics.drawHangman(currentGame.guessesLeft()));
                System.out.println("\nSolve: " + currentGame.displayGameBoard() + "\n");
                currentGame.takeTurn();
                currentGame.validateGameOver();
            }
            quit = Interact.askToPlayAgain();
            if (!quit) {
                currentGame.initGame();
                currentGame.printHeader();
            }
       }

    }
}
