package in.cdac;


class Logger {
    private static Logger instance;
    private StringBuilder logMessages = new StringBuilder();

    private Logger() {}  // Private constructor to prevent instantiation

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        logMessages.append(message).append("\n");
    }

    public String getLog() {
        return logMessages.toString();
    }

    public void clearLog() {
        logMessages.setLength(0);
    }
}
