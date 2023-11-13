public class TemperatureDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Temperature Display: A temperatura atual é " + temperature + " graus Celsius.");
    }
}
