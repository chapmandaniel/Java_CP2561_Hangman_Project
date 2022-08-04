public class Gameplay {



    public static void main(String[] args) {
        boolean quit = false;
        System.out.println(Graphics.getGameTitle());
        Game currentGame = new Game();
        while (!quit) {
            currentGame.initGame();
            while (!currentGame.isGameOverCheck()) {
                currentGame.printHeader();
                currentGame.takeTurn();
                currentGame.validateGameOver();
            }
            quit = Interact.askToPlayAgain();
       }

    }
}
