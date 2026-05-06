package Observer;

import Observable.WeatherObservable;

// Concrete Observer 2
// Forecast Display

public class ForecastDisplay implements WeatherObserver {

    private final WeatherObservable weatherStation;

    public ForecastDisplay(
            WeatherObservable weatherStation
    ) {

        this.weatherStation = weatherStation;

        weatherStation.addObserver(this);
    }

    // Observer-specific implementation
    @Override
    public void update() {

        System.out.println(
                "Updating weather data to do some analytics: " +
                        weatherStation.toString()
        );

        display();
    }

    // Display forecast
    public void display() {

        System.out.println(
                "Forecast Details: Displaying information " +
                        "about Rain, Temperature Trends, " +
                        "Significant Weather Events and " +
                        "other phenomenon..."
        );
    }
}