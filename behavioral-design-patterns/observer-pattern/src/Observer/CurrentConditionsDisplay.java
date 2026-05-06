package Observer;

import Observable.WeatherObservable;

// Concrete Observer 1
// Current Conditions Display

public class CurrentConditionsDisplay implements WeatherObserver {

    private final WeatherObservable weatherStation;

    public CurrentConditionsDisplay(
            WeatherObservable weatherStation
    ) {

        this.weatherStation = weatherStation;

        weatherStation.addObserver(this);
    }

    // Observer-specific implementation
    @Override
    public void update() {

        System.out.println("Saving weather data...");

        display();
    }

    // Display current conditions
    public void display() {

        System.out.println(
                "Current Weather Conditions: " +
                        weatherStation.toString()
        );
    }
}