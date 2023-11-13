public class TemperatureLogger implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Temperature Logger: Registrando temperatura: " + temperature + " graus Celsius.");
    }
}
