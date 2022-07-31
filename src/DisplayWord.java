import java.util.ArrayList;
import java.util.List;

public class DisplayWord {
       private final String WORD;
       private final List<Character> GUESSED = new ArrayList<Character>();


    public static void main(String[] args) {
        DisplayWord d = new DisplayWord("hockey moms");
        System.out.println(d.outputWord());
        d.GUESSED.add('o');
        d.GUESSED.add('c');
        System.out.println(d.outputWord());
    }

    public DisplayWord(String word) {
        this.WORD = word;
    }




    public String outputWord() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < this.WORD.length(); i++) {
            if (this.GUESSED.contains(this.WORD.charAt(i))) {
                output.append(this.WORD.charAt(i));
            } else if(this.WORD.charAt(i) == ' ') {
                output.append(' ');
            }
            else {
                output.append("_");
            }
        }
        return output.toString();
    }
}
