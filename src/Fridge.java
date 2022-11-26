public class Fridge extends Kitchen {
    public int freezers_qty;
    public double volume;
    public void info () {
        System.out.println (energy_consumption);
        System.out.println (getState());
        System.out.println (weight);
        System.out.println (color);
        System.out.println (noise_level);
        System.out.println (remote_control);
        System.out.println (freezers_qty);
        System.out.println (volume);
    }
    public String toString () {
        return "Робит";
    }
    public Fridge (double energy_consumption, boolean isOn, double weight, String color, double noise_level, boolean remote_control, int freezers_qty, double volume) {
        super (energy_consumption, isOn, weight, color, noise_level, remote_control);
        this.freezers_qty = freezers_qty;
        this.volume = volume;
    }
}