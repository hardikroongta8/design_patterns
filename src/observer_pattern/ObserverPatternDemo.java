package observer_pattern;

public class ObserverPatternDemo {
    public static void showDemo() {
        Provider provider1 = new Provider();

        Listener l1 = new Listener("Luke");
        Listener l2 = new Listener("Alex");
        Listener l3 = new Listener("Haley");
        Listener l4 = new Listener("Lily");
        Listener l5 = new Listener("Manny");

        l1.setProvider(provider1);
        l2.setProvider(provider1);
        l3.setProvider(provider1);
        l4.setProvider(provider1);
        l5.setProvider(provider1);

        provider1.attachListener(l1);
        provider1.attachListener(l2);
        provider1.attachListener(l3);
        provider1.attachListener(l4);
        provider1.attachListener(l5);

        provider1.removeListener(l3);

        provider1.doSomething();
    }
}
