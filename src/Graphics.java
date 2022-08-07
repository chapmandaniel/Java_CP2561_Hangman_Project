public class Graphics {

        public static String getGameTitle() {
                String gameTitle = "\n===============================================================\n" +
                        "\n██   ██  █████  ███    ██  ██████  ███    ███  █████  ███    ██" +
                        "\n██   ██ ██   ██ ████   ██ ██       ████  ████ ██   ██ ████   ██" +
                        "\n███████ ███████ ██ ██  ██ ██   ███ ██ ████ ██ ███████ ██ ██  ██" +
                        "\n██   ██ ██   ██ ██  ██ ██ ██    ██ ██  ██  ██ ██   ██ ██  ██ ██" +
                        "\n██   ██ ██   ██ ██   ████  ██████  ██      ██ ██   ██ ██   ████" +
                        "\n===============================================================\n";
                return gameTitle;
        }
        public static String getWinGraphic() {
                String winGraphic = "\n\n" +
                        "██    ██  ██████  ██    ██     ██     ██ ██ ███    ██ ██\n" +
                        " ██  ██  ██    ██ ██    ██     ██     ██ ██ ████   ██ ██\n" +
                        "  ████   ██    ██ ██    ██     ██  █  ██ ██ ██ ██  ██ ██\n" +
                        "   ██    ██    ██ ██    ██     ██ ███ ██ ██ ██  ██ ██\n" +
                        "   ██     ██████   ██████       ███ ███  ██ ██   ████ ██\n\n";
                return winGraphic;
        }

        public static String getGameOverGraphic() {
                String lose = "\n" +
                        " ██████   █████  ███    ███ ███████      ██████  ██    ██ ███████ ██████  \n" +
                        "██       ██   ██ ████  ████ ██          ██    ██ ██    ██ ██      ██   ██ \n" +
                        "██   ███ ███████ ██ ████ ██ █████       ██    ██ ██    ██ █████   ██████  \n" +
                        "██    ██ ██   ██ ██  ██  ██ ██          ██    ██  ██  ██  ██      ██   ██ \n" +
                        " ██████  ██   ██ ██      ██ ███████      ██████    ████   ███████ ██   ██ \n";
                return lose;
        }

        public static String drawHangman(String guessesLeft) {
                switch (guessesLeft) {
                        case "6":
                                return guessesLeftSix;
                        case "5":
                                return guessesLeftFive;
                        case "4":
                                return guessesLeftFour;
                        case "3":
                                return guessesLeftThree;
                        case "2":
                                return guessesLeftTwo;
                        case "1":
                                return guessesLeftOne;
                        case "0":
                                return guessesLeftNone;
                        default:
                                return null;
                }
        }

        public static String guessesLeftNone = "\n\n" +
                " ___________.._______\n" +
                "| .__________))______|\n" +
                "| | / /      ||\n" +
                "| |/ /       ||\n" +
                "| | /        ||.-''.\n" +
                "| |/         |/  _  \\\n" +
                "| |          ||  `/,|\n" +
                "| |          (\\\\`_.'\n" +
                "| |         .-`--'.\n" +
                "| |        /Y . . Y\\\n" +
                "| |       // |   | \\\\\n" +
                "| |      //  | . |  \\\\\n" +
                "| |     ')   |   |   (`\n" +
                "| |          ||'||\n" +
                "| |          || ||\n" +
                "| |          || ||\n" +
                "| |          || ||\n" +
                "| |         / | | \\\n";

        public static String guessesLeftOne = "\n\n" +
                " ___________.._______\n" +
                "| .__________))______|\n" +
                "| | / /      ||\n" +
                "| |/ /       ||\n" +
                "| | /        ||.-''.\n" +
                "| |/         |/  _  \\\n" +
                "| |          ||  `/,|\n" +
                "| |          (\\\\`_.'\n" +
                "| |         .-`--'.\n" +
                "| |        /Y . . Y\\\n" +
                "| |       // |   | \\\\\n" +
                "| |      //  | . |  \\\\\n" +
                "| |     ')   |   |   (`\n" +
                "| |          ||\n" +
                "| |          || \n" +
                "| |          || \n" +
                "| |          || \n" +
                "| |\n";

        public static String guessesLeftTwo = "\n\n" +
                " ___________.._______\n" +
                "| .__________))______|\n" +
                "| | / /      ||\n" +
                "| |/ /       ||\n" +
                "| | /        ||.-''.\n" +
                "| |/         |/  _  \\\n" +
                "| |          ||  `/,|\n" +
                "| |          (\\\\`_.'\n" +
                "| |         .-`--'.\n" +
                "| |        /Y . . Y\\\n" +
                "| |       // |   | \\\\\n" +
                "| |      //  | . |  \\\\\n" +
                "| |     ')   |   |   (`\n" +
                "| |          \n" +
                "| |          \n" +
                "| |         \n" +
                "| |         \n" +
                "| |\n";


        public static String guessesLeftThree = "\n\n" +
                " ___________.._______\n" +
                "| .__________))______|\n" +
                "| | / /      ||\n" +
                "| |/ /       ||\n" +
                "| | /        ||.-''.\n" +
                "| |/         |/  _  \\\n" +
                "| |          ||  `/,|\n" +
                "| |          (\\\\`_.'\n" +
                "| |         .-`--'\n" +
                "| |        /Y . . \n" +
                "| |       // |   | \n" +
                "| |      //  | . |  \n" +
                "| |     ')   |   |   \n" +
                "| |          \n" +
                "| |          \n" +
                "| |         \n" +
                "| |         \n" +
                "| |\n";


        public static String guessesLeftFour = "\n\n" +
                " ___________.._______\n" +
                "| .__________))______|\n" +
                "| | / /      ||\n" +
                "| |/ /       ||\n" +
                "| | /        ||.-''.\n" +
                "| |/         |/  _  \\\n" +
                "| |          ||  `/,|\n" +
                "| |          (\\\\`_.'\n" +
                "| |          -`--'\n" +
                "| |          |. .| \n" +
                "| |          |   | \n" +
                "| |          | . |  \n" +
                "| |          |   |   \n" +
                "| |          \n" +
                "| |          \n" +
                "| |         \n" +
                "| |         \n" +
                "| |\n";


        public static String guessesLeftFive = "\n\n" +
                " ___________.._______\n" +
                "| .__________))______|\n" +
                "| | / /      ||\n" +
                "| |/ /       ||\n" +
                "| | /        ||.-''.\n" +
                "| |/         |/  _  \\\n" +
                "| |          ||  `/,|\n" +
                "| |          (\\\\`_.'\n" +
                "| |          \n" +
                "| |          \n" +
                "| |          \n" +
                "| |          \n" +
                "| |          \n" +
                "| |          \n" +
                "| |          \n" +
                "| |         \n" +
                "| |         \n" +
                "| |\n";

        public static String guessesLeftSix =
                " ___________.._______\n" +
                "| .__________))______|\n" +
                "| | / /      ||\n" +
                "| |/ /       ||\n" +
                "| | /        ||\n" +
                "| |/         ||\n" +
                "| |          ||\n" +
                "| |          (\\\\ \n" +
                "| |          \n" +
                "| |          \n" +
                "| |          \n" +
                "| |          \n" +
                "| |          \n" +
                "| |          \n" +
                "| |          \n" +
                "| |         \n" +
                "| |         \n" +
                "| |\n";

}
