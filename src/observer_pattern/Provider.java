package observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class Provider {
    private List<Listener> listeners;
    private String title;

    public Provider() {
        listeners = new ArrayList<>();
    }

    public void attachListener(Listener listener) {
        listeners.add(listener);
    }

    public void removeListener(Listener listener) {
        listeners.remove(listener);
    }

    public void notifyListeners(String message) {
        for (Listener l : listeners) {
            l.update("Hey " + l.getName() + ", " + message);
        }
    }

    public void doSomething() {
        // DO SOMETHING
        notifyListeners("Something happened!");
    }
}
