
public class TemperatureSensor extends Sensor {
    private double temperature;

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyObservers(temperature);
    }

    public double getTemperature() {
        return temperature;
    }
}
