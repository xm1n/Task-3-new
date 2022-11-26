public class TV extends Living_room {
    public double diagonal;
    public int refresh_rate;
    @Override
    public String toString () {
        return "Потребление энергии: " + energy_consumption + "\nВключен ли: " + getState() + "\nВес: " + weight + "\nЦвет: " + color + "\nДлина кабеля: " + power_cord_length + "\nПоддержка Bluetooth: " + bluetooth_support + "\nДиагональ: " + diagonal + "\nЧастота обновления экрана: " + refresh_rate;
    }

    public TV (double energy_consumption, boolean isOn, double weight, String color, double power_cord_length, boolean bluetooth_support, double diagonal, int refresh_rate) {
        super (energy_consumption, isOn, weight, color, power_cord_length, bluetooth_support);
        this.diagonal = diagonal;
        this.refresh_rate = refresh_rate;
    }
}