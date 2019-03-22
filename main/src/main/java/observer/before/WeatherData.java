package observer.before;

public class WeatherData {

    public void measurementChanged() {

        /**
         * Maybe the WeatherData use polling for getting new data
         */
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        /**
         * This is our part, we need to design the relationship between WeatherData and different Displays
         */
        Display currentConditionsDisplay = new Display();
        Display statisticsDisplay = new Display();
        Display forecastDisplay = new Display();
        currentConditionsDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);
    }

    private float getTemperature() {
        return 20.0f;
    }

    private float getHumidity() {
        return 25.0f;
    }

    private float getPressure() {
        return 1.0f;
    }
}
