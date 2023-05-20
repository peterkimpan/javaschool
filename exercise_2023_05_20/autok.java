package exercise_2023_05_20;

public class autok {
    public static void main(String[] args){
        auto bmw = new auto();
        auto mercedes = new auto();
        auto porsche = new auto();
        //bmw = new auto(); így is lehet
        //mercedes = new auto();
        //porsche = new auto();
        bmw.név = "X5";
        mercedes.név ="ASD";
        porsche.név = "DSDSD";
        bmw.szín = "Piros";
        mercedes.szín = "Kék";
        porsche.szín = "Fehér";
        bmw.alvázszám = 21422142;
        mercedes.alvázszám = 44434333;
        porsche.alvázszám = 55453343;
        bmw.kilóméteróra = 17755;
        mercedes.kilóméteróra = 44343;
        porsche.kilóméteróra = 44222;
        System.out.println("A Porsche kilóméterórája: "+porsche.kilóméteróra);
    }
}
