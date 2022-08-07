public class Main {

    public static void main(String[] args) {
        boolean quit = false;
        System.out.println(Graphics.getGameTitle());
        Sound.playIntroMusic();

        Game currentGame = new Game();
        currentGame.printHeader();

        while (!quit) {
            while (!currentGame.isGameOverCheck()) {
                System.out.println(Graphics.drawHangman(currentGame.guessesLeft()));
                System.out.println("\nSolve: " + currentGame.displayGameBoard() + "\n");
                currentGame.takeTurn();
                currentGame.validateGameOver();
            }
            quit = Interact.askToQuitGame();
            if (!quit) {
                currentGame.initGame();
                currentGame.printHeader();
            }
       }

    }
}
