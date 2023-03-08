class Acronym {

    private final String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        StringBuilder acronym = new StringBuilder();
        for (int i = 0; i < phrase.length(); i++) {
            if (i == 0 && Character.isLetter(phrase.charAt(0))) {
                acronym.append(phrase.charAt(i));
            }
            if (!Character.isLetter(phrase.charAt(i)) && Character.isLetter(phrase.charAt(i + 1)) && phrase.charAt(i) != '\'') {
                acronym.append(phrase.charAt(i + 1));
            }
        }
        return acronym.toString().toUpperCase();
    }
}
