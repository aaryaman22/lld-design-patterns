package Observable;

import Observer.WeatherObserver;

import java.util.ArrayList;
import java.util.List;

// Concrete Observable (Subject)
// WeatherStation - the concrete observable class that holds weather data

public class WeatherStation implements WeatherObservable {

    // List of observers registered for updates
    private final List<WeatherObserver> observers;

    // Observable Data
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(WeatherObserver observer) {
        observers.add(observer);

        System.out.println(
                "[+] Observer registered: " +
                        observer.getClass().getSimpleName()
        );
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);

        System.out.println(
                "[-] Observer removed: " +
                        observer.getClass().getSimpleName()
        );
    }

    @Override
    public void notifyObservers() {

        for (WeatherObserver observer : observers) {

            // Notify each observer
            observer.update();
        }
    }

    // Method to update weather measurements
    public void setWeatherReadings(
            float temperature,
            float humidity,
            float pressure
    ) {

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyObservers();
    }

    // Getters
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    @Override
    public String toString() {

        return "WeatherStation{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
}