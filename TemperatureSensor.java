
import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(float temperature);
}


public class TemperatureSensor {
    private final List<Observer> observers = new ArrayList<>();
    private float temperature;

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}

