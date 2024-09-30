
import java.util.ArrayList;
import java.util.List;

public abstract class Sensor {
    protected List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        if (observer == null) {
            throw new IllegalArgumentException("Observer cannot be null");
        }
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObservers(double value) {
        for (Observer observer : observers) {
            observer.update(this, value);
        }
    }
}
