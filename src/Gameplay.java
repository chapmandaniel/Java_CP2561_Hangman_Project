public class Gameplay {



    public static void main(String[] args) {
        boolean quit = false;
        System.out.println(Graphics.getGameTitle());
        while (!quit) {
            Game currentGame = new Game();
            while (!currentGame.getGameOver()) {
                currentGame.takeTurn();
                currentGame.printHeader();
                System.out.println(Graphics.drawHangman(currentGame.guessesLeft()));
                currentGame.validateGameOver();
            }
            quit = Interact.askToPlayAgain();
       }

    }
}
