
public class MobileDisplay implements Observer {
    private String displayId;

    public MobileDisplay(String displayId) {
        if (displayId == null || displayId.isEmpty()) {
            throw new IllegalArgumentException("Display ID cannot be null or empty");
        }
        this.displayId = displayId;
    }

    @Override
    public void update(Sensor sensor, double value) {
        System.out.println("Mobile Display " + displayId + " - " + sensor.getClass().getSimpleName() + ": " + value);
    }
}
