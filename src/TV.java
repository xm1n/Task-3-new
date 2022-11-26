public class TV extends Living_room {
    public double diagonal;
    public int refresh_rate;
    
    public String toString () {
        return "Робит" + super.toString();
    }

    public TV (double energy_consumption, boolean isOn, double weight, String color, double power_cord_length, boolean bluetooth_support, double diagonal, int refresh_rate) {
        super (energy_consumption, isOn, weight, color, power_cord_length, bluetooth_support);
        this.diagonal = diagonal;
        this.refresh_rate = refresh_rate;
    }
}