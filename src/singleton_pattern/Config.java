package singleton_pattern;

public class Config {
    private static Config config;

    private Config() {
        System.out.println("Inside constructor");
    }

    public static Config getInstance() {
        if (config == null) {
            config = new Config();
        }
        return config;
    }
}
