public class Fridge extends Kitchen {
    public int freezers_qty;
    public double volume;
    public String toString () {
        return "ddd" + energy_consumption;
    }
    public Fridge (double energy_consumption, boolean isOn, double weight, String color, double noise_level, boolean remote_control, int freezers_qty, double volume) {
        super (energy_consumption, isOn, weight, color, noise_level, remote_control);
        this.freezers_qty = freezers_qty;
        this.volume = volume;
    }
}