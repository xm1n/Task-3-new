public class Microwave extends Kitchen {
    public boolean grill;
    public String door_type;
    public void info () {
        System.out.println (energy_consumption);
        System.out.println (getState());
        System.out.println (weight);
        System.out.println (color);
        System.out.println (noise_level);
        System.out.println (remote_control);
        System.out.println (grill);
        System.out.println (door_type);
    }
    public Microwave (double energy_consumption, boolean isOn, double weight, String color, double noise_level, boolean remote_control, boolean grill, String door_type) {
        super (energy_consumption, isOn, weight, color, noise_level, remote_control);
        this.grill = grill;
        this.door_type = door_type;
    }
}