public class Microwave extends Kitchen {
    public boolean grill;
    public String door_type;
    @Override
    public String toString () {
        return "Потребление энергии: " + energy_consumption + "\nВключен ли: " + getState() + "\nВес: " + weight + "\nЦвет: " + color + "\nУровень шума: " + noise_level + "\nУдалённое управление: " + remote_control + "\nГриль: " + grill + "\nТип двери: " + door_type;
    }
    public Microwave (double energy_consumption, boolean isOn, double weight, String color, double noise_level, boolean remote_control, boolean grill, String door_type) {
        super (energy_consumption, isOn, weight, color, noise_level, remote_control);
        this.grill = grill;
        this.door_type = door_type;
    }
}