package Observer.weatherStation;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
public class WeatherData implements Subject{
    private float temperature;
    private float humidity;
    private float pressure;
    private List<Observer> subscribers;

    public WeatherData() {
        subscribers = new ArrayList<>();
    }

    @Override
    public void register(Observer o) {
        subscribers.add(o);
    }

    @Override
    public void remove(Observer o) {
        subscribers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : subscribers) {
            o.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }


}
