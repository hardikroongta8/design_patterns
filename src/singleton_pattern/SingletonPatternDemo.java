package singleton_pattern;

public class SingletonPatternDemo {
    public static void showDemo() {
        Config.getInstance();
        Config.getInstance();
        Config.getInstance();
    }
}
