public class WebDisplay implements Observer {
    private String url;

    public WebDisplay(String url) {
        if (url == null || url.isEmpty()) {
            throw new IllegalArgumentException("URL cannot be null or empty");
        }
        this.url = url;
    }

    @Override
    public void update(Sensor sensor, double value) {
        System.out.println("Web Display at " + url + " - " + sensor.getClass().getSimpleName() + ": " + value);
    }
}
