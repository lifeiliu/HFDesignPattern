package Observer.weatherStation;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
