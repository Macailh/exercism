import java.util.Locale;

class Scrabble {
    private String word;
    Scrabble(String word) {
        this.word = word;
    }

    int getScore() {
        String wordUpperCase = this.word.toUpperCase();
        int score = 0;
        for(int i = 0; i < wordUpperCase.length(); i++) {
            switch (wordUpperCase.charAt(i)) {
                case 'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T' -> score += 1;
                case 'D', 'G' -> score += 2;
                case 'B', 'C', 'M', 'P' -> score += 3;
                case 'F', 'H', 'V', 'W', 'Y' -> score += 4;
                case 'K' -> score += 5;
                case 'J', 'X' -> score += 8;
                case 'Q', 'Z' -> score += 10;
                default -> throw new IllegalArgumentException();
            }
        }
        return score;
    }
}
