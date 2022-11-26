public class Main {
    static Fridge[] ArrayFR = new Fridge[3];
    static TV[] ArrayTV = new TV[4];
    static Microwave[] ArrayMW = new Microwave[3];
    public static void main (String[] args) {
        //создание Продукта Телевизор
        double total = 0;
        ArrayFR[0] = new Fridge (140, true, 90, "grey", 20, false, 2, 0.9);
        ArrayFR[1] = new Fridge (214, false, 10.6, "yellow", 60,true, 3, 1.6);
        ArrayFR[2] = new Fridge (145, false, 5.6, "yellow2", 60.6,true, 4, 1.2);
        ArrayTV[0] = new TV (55, false, 15, "black", 2, true, 27, 60);
        ArrayTV[1] = new TV (43, false, 10, "white", 1, false, 23, 144);
        ArrayTV[2] = new TV (100, true, 25, "black", 5, true, 43, 240);
        ArrayTV[3] = new TV (100, true, 25, "white", 10, true, 65, 360);
        ArrayMW[0] = new Microwave(100, true, 25, "white", 10, true, true, "360");
        ArrayMW[1] = new Microwave(100, true, 25, "white", 10, true, true, "360");
        ArrayTV[0].on();
        ArrayFR[0].toString();
        /*System.out.println ("Цвет телевизора ТВ1: " + ArrayTV[1].color);
        System.out.println ("Включен ли ТВ2: " + ArrayTV[1].getState());
        System.out.println ("Энергопотребление МВ1: " + ArrayMW[1].energy_consumption);
        System.out.println ("Все включенные электроприборы потребляют (" + total + ") Ватт");
        System.out.println ("Уровень шума у ФР1: " + ArrayFR[0].energy_consumption);*/
    }
}