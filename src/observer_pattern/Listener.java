package observer_pattern;

public class Listener {
    private String name;
    private Provider provider;

    public Listener(String name) {
        this.name = name;
        provider = new Provider();
    }

    public void update(String message) {
        System.out.println(message);
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public String getName() {
        return name;
    }
}
