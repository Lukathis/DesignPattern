package observer.after;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(31.0f, 12.0f, 20.1f);
        weatherData.setMeasurements(32.0f, 14.1f, 21.7f);
        weatherData.setMeasurements(31.0f, 11.5f, 24.2f);

    }
}
