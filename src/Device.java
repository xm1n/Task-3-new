public class Device {
    //свойства
    public double energy_consumption;
    private boolean isOn;
    public double weight;
    public String color;
    //функции
    public void on() {
        isOn = true;
    }
    public void off() {
        isOn = false;
    }
    public boolean getState() {
        return isOn;
    }
    //конструктор для создания Девайса
    public Device(double energy_consumption, boolean isOn, double weight, String color) {
        this.energy_consumption = energy_consumption;
        this.isOn = isOn;
        this.weight = weight;
        this.color = color;
    }
}