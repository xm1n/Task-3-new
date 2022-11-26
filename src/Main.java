public class Main {
    static Fridge[] ArrayFR = new Fridge[3];
    static TV[] ArrayTV = new TV[4];
    static Microwave[] ArrayMW = new Microwave[3];
    public static void main (String[] args) {
        //создание Продукта Телевизор
        double total = 0;
        ArrayFR[0] = new Fridge (100, Math.random()<0.5, 90, "grey", 20, false, 2, 0.9);
        ArrayFR[1] = new Fridge (100, Math.random()<0.5, 10.6, "yellow", 60,true, 3, 1.6);
        ArrayFR[2] = new Fridge (100, Math.random()<0.5, 5.6, "yellow2", 60.6,true, 4, 1.2);
        ArrayTV[0] = new TV (100, Math.random()<0.5, 15, "black", 2, true, 27, 60);
        ArrayTV[1] = new TV (100, Math.random()<0.5, 10, "white", 1, false, 23, 144);
        ArrayTV[2] = new TV (100, Math.random()<0.5, 25, "black", 5, true, 43, 240);
        ArrayTV[3] = new TV (100, Math.random()<0.5, 25, "white", 10, true, 65, 360);
        ArrayMW[0] = new Microwave(100, Math.random()<0.5, 25, "white", 10, true, true, "360");
        ArrayMW[1] = new Microwave(100, Math.random()<0.5, 22, "white", 17, true, true, "365");
        ArrayMW[2] = new Microwave(100, Math.random()<0.5, 27, "white", 13, true, true, "364");
        for (int i = 0; i < ArrayFR.length; i++) {
            if (ArrayFR[i].getState() == true) {
                total += ArrayFR[i].energy_consumption;
            }
        }
        for (int i = 0; i < ArrayMW.length; i++) {
            if (ArrayMW[i].getState() == true) {
                total += ArrayMW[i].energy_consumption;
            }
        }
        for (int i = 0; i < ArrayTV.length; i++){
            if (ArrayTV[i].getState() == true) {
                total += ArrayTV[i].energy_consumption;
            }
        }
        System.out.println(total);
    }
}