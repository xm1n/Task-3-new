public class Fridge extends Kitchen {
    public int freezers_qty;
    public double volume;
    @Override
    public String toString () {
        return "Потребление энергии: " + energy_consumption + "\nВключен ли: " + getState() + "\nВес: " + weight + "\nЦвет: " + color + "\nУровень шума: " + noise_level + "\nУдалённое управление: " + remote_control + "\nКоличество камер: " + freezers_qty + "\nОбъём: " + volume;
    }
    public Fridge (double energy_consumption, boolean isOn, double weight, String color, double noise_level, boolean remote_control, int freezers_qty, double volume) {
        super (energy_consumption, isOn, weight, color, noise_level, remote_control);
        this.freezers_qty = freezers_qty;
        this.volume = volume;
    }
}