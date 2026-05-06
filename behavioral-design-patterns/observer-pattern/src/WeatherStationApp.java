import Observable.WeatherStation;
import Observable.WeatherObservable;

import Observer.CurrentConditionsDisplay;
import Observer.ForecastDisplay;

// Client code to demonstrate Observer Pattern

public class WeatherStationApp {

    public static void main(String[] args) {

        System.out.println(
                "###### Observer Design Pattern ######"
        );

        // Create Observable
        WeatherObservable weatherStation = new WeatherStation();

        // Create Observers
        CurrentConditionsDisplay currentDisplay = new
                CurrentConditionsDisplay(weatherStation);

        ForecastDisplay forecastDisplay = new
                ForecastDisplay(weatherStation);

        System.out.println("===>>> Initial Weather Update");
        weatherStation.setWeatherReadings(80, 65, 30.4f);

        System.out.println("===>>> Second Weather Update");
        weatherStation.setWeatherReadings(82, 70, 29.2f);

        // Remove forecast display
        weatherStation.removeObserver(forecastDisplay);
        System.out.println("===>>> Third Weather Update");

        weatherStation.setWeatherReadings(70, 21, 29.2f);
        // Forecast display will not be notified

    }
}