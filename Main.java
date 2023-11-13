public class Main {
    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();

        TemperatureDisplay display = new TemperatureDisplay();
        TemperatureLogger logger = new TemperatureLogger();

        sensor.registerObserver(display);
        sensor.registerObserver(logger);

        sensor.setTemperature(25.5f);
        sensor.setTemperature(26.0f);

        sensor.removeObserver(logger);

        sensor.setTemperature(27.2f);
    }
}
