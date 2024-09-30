
public class MonitoringSystem {
    public static void main(String[] args) {
        TemperatureSensor tempSensor = new TemperatureSensor();

        Observer mobileDisplay = new MobileDisplay("MD1");
        Observer webDisplay = new WebDisplay("http://localhost/display");

        tempSensor.attach(mobileDisplay);
        tempSensor.attach(webDisplay);

        tempSensor.setTemperature(25.5);
        tempSensor.setTemperature(26.0);
    }
}
