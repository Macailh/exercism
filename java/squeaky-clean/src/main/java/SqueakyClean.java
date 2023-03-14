class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder result = new StringBuilder();
        boolean previousCharIsDash = false;
        for (int i = 0; i < identifier.length(); i++) {
            char c = identifier.charAt(i);
            if (Character.isLetter(c)) {
                if (c >= 'α' && c <= 'ω') {
                    continue;
                }
                if (previousCharIsDash) {
                    c = Character.toUpperCase(c);
                }
                result.append(c);
                previousCharIsDash = false;
            } else if (c == '-') {
                previousCharIsDash = true;
            } else if (Character.isWhitespace(c)) {
                result.append("_");
            } else if (Character.isISOControl(c)) {
                result.append("CTRL");
            }
        }
        return result.toString();
    }
}
