package exercise_2023_05_20;

public class autok {
    public static void main(String[] args){
        auto bmw = new auto();
        auto mercedes = new auto();
        auto porsche = new auto();


        elektromosAutó elektro = new elektromosAutó();
        elektro.setName("Mr. Electric");
        elektro.töltés(200);
        elektro.printRemainingCharge();
        

        benzinesAutó vinBenzin = new benzinesAutó();
        vinBenzin.setName("Vin Benzin");
        vinBenzin.tankolás(10);
        vinBenzin.printRemainingFuel();

        bmw.setName("BMW X5");
        mercedes.setName("Mercedes ASD");
        porsche.setName("Porsche XYZ");
        bmw.setColor("Piros");
        mercedes.setColor("Kék");
        porsche.setColor("Fehér");
        bmw.setChassisNumber(21422142);
        mercedes.setChassisNumber(44434333);
        porsche.setChassisNumber(55453343);
        bmw.setKm(17755);
        mercedes.setKm(44343);
        porsche.setKm(44222);

        bmw.kilóméterórakiír();
        bmw.hozzáadkilómétert(150);
        bmw.kilóméterórakiír();
    }
}
