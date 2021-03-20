package Observer.weatherStation;

import lombok.Data;

@Data
public class CurrentConditionDisplay implements Observer, DisplayElements{
    private float temp;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.register(this);
    }
    @Override
    public void display() {
        System.out.println("Current conditions: " + temp + " F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.humidity = humidity;
        this.temp = temp;
        display();
    }
}
