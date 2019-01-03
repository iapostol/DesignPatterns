package creational.singleton;

public class Logger {
    private static Logger instance;

    private String text;

    private Logger()
    {
        text = "";
    }

    public static Logger create() {
        if (instance == null)
        instance = new Logger();

        return instance;
    }

    public void log(String text) {
        this.text += text;
    }

    public String getText() {
        return text;
    }
}