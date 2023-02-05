public class LogLevels {
    
    public static String message(String logLine) {
        int index = logLine.indexOf("]:");
        if(index != -1) {
            return logLine.substring(index+3).trim();
        }
        return logLine;
    }

    public static String logLevel(String logLine) {
        int indexStart = logLine.indexOf("[");
        int indexFinal = logLine.indexOf("]:");
        if(indexStart != -1 && indexFinal != -1) {
            return logLine.substring(indexStart + 1, indexFinal).trim().toLowerCase();
        } else {
            return "";
        }
    }

    public static String reformat(String logLine) {
        String message = message(logLine);
        String level = "(" + logLevel(logLine) + ")";

        return message +
                " " +
                level;
    }
}
