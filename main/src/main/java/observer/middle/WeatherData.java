package observer.middle;

import observer.middle.interfaces.Observer;
import observer.middle.interfaces.Subject;

import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;

    @Override
    public void registerObserver(Observer o) {
        if (!observers.contains(o))
            observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        if (observers.contains(o))
            observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers)
            o.update(temp, humidity, pressure);
    }

    public void measurementChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
