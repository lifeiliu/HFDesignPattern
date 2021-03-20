package Observer.weatherStation;

public class WeatherStationApp {
    public static void main(String[] args) {
        WeatherData data = new WeatherData();

        CurrentConditionDisplay display1 = new CurrentConditionDisplay(data);
        HeatIndexDisplay display2 = new HeatIndexDisplay(data);

        data.setMeasurements(80, 65, 30.4f);
        data.setMeasurements(82, 70, 29.2f);
        data.setMeasurements(78, 90, 35);

    }
}
