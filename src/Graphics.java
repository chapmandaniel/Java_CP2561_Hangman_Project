public class Graphics {

        /**
         * Class requirements
         * 1. display game title
         * 2. display hangman progress
         * 3. display win screen
         * 4. display lose screen
         */

        private static String gameTitle = "\n" +
                        "\n===============================================================\n" +
                        "\n██   ██  █████  ███    ██  ██████  ███    ███  █████  ███    ██" +
                        "\n██   ██ ██   ██ ████   ██ ██       ████  ████ ██   ██ ████   ██" +
                        "\n███████ ███████ ██ ██  ██ ██   ███ ██ ████ ██ ███████ ██ ██  ██" +
                        "\n██   ██ ██   ██ ██  ██ ██ ██    ██ ██  ██  ██ ██   ██ ██  ██ ██" +
                        "\n██   ██ ██   ██ ██   ████  ██████  ██      ██ ██   ██ ██   ████" +
                        "\n\nVersion 0.1 by Daniel Chapman" +
                        "\n===============================================================\n";

        public static String getGameTitle() {
                return gameTitle;
        }
}
