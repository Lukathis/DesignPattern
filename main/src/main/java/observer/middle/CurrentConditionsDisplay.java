package observer.middle;

import observer.middle.interfaces.DisplayElement;
import observer.middle.interfaces.Observer;
import observer.middle.interfaces.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private Subject weatherData;
    private float temp;
    private float humidity;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(String.format("[Current Condition]Temperature: %s, Humidity: %s", temp, humidity));
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }
}


