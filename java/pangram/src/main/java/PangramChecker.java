import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PangramChecker {

    public boolean isPangram(String input) {
        boolean[] alphabet = new boolean[26];
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                int i = Character.toLowerCase(c) - 'a';
                alphabet[i] = true;
            }
        }

        boolean isPangram = true;
        for (boolean b : alphabet) {
            if (!b) {
                isPangram = false;
                break;
            }
        }
        return isPangram;
    }

}
