package Observer.weatherStationObservable;

import Observer.weatherStationObservable.*;

import java.util.Observable;
import java.util.Observer;

import lombok.Data;

@Data
public class CurrentConditionDisplay implements Observer, DisplayElements {
    private float temp;
    private float humidity;
    private Observable observable;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Current conditions: " + temp + " F degrees and " + humidity + "% humidity");
    }


    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData data = (WeatherData) o;
            this.temp = data.getTemperature();
            this.humidity = data.getHumidity();
        }
        display();
    }
}
