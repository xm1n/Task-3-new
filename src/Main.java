public class Main {
    public static void main (String[] args) {
        //создание Продукта Телевизор
        double total = 0;
        Fridge FR1 = new Fridge (140, true, 90, "grey", 20, false, 2, 0.9);
        Microwave MW1 = new Microwave (214, false, 10.6, "yellow", 60,true, true, "1");
        TV TV1 = new TV (55, false, 15, "black", 2, true, 27, 60);
        TV TV2 = new TV (43, false, 10, "white", 1, false, 23, 144);
        TV2.on();
        TV1.toString();
        /*
        System.out.println ("Цвет телевизора ТВ1: " + TV1.color);
        System.out.println ("Включен ли ТВ2: " + TV2.getState());
        System.out.println ("Энергопотребление МВ1: " + MW1.energy_consumption);
        System.out.println ("Все включенные электроприборы потребляют " + total + " Ватт");
        System.out.println ("Уровень шума у ФР1: " + FR1.noise_level);
        */
    }
}