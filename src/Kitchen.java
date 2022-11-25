public class Kitchen extends Device {
    public double noise_level;
    public boolean remote_control;
    public Kitchen (double energy_consumption, boolean isOn, double weight, String color, double noise_level, boolean remote_control) {
        super (energy_consumption, isOn, weight, color);
        this.noise_level = noise_level;
        this.remote_control = remote_control;
    }
}