public class Living_room extends Device {
    public double power_cord_length;
    public boolean bluetooth_support;
    public Living_room (double energy_consumption, boolean isOn, double weight, String color, double power_cord_length, boolean bluetooth_support) {
        super (energy_consumption, isOn, weight, color);
        this.power_cord_length = power_cord_length;
        this.bluetooth_support = bluetooth_support;
    }
}