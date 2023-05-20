package exercise_2023_05_20;

public class autok {
    public static void main(String[] args){

        auto bmw = new auto("BMW X5","Piros",21422142,17755);
        auto mercedes = new auto("Mercedes ASD","Kék",44434333,44343);
        auto porsche = new auto("Porsche XYZ","Fehér",55453343,44222);

        elektromosAutó elektro = new elektromosAutó("Mr. Electric","Lila",11111111,13235,200);
        elektro.printRemainingCharge();
        

        benzinesAutó vinBenzin = new benzinesAutó("Vin Benzin","Fekete",99999999,176555,10);
        vinBenzin.tankolás(10);
        vinBenzin.printRemainingFuel();

        bmw.kilóméterórakiír();
        bmw.hozzáadkilómétert(150);
        bmw.kilóméterórakiír();
    }
}
