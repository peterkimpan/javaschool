package exercise_2023_06_03.orszag;

public class orszag {
    /*Tanulmányozzátok a 34-35. diát. A dián egy osztály alosztályainak létrehozása, illetve használata látható.
    Egy osztály alosztálya örökli az osztály tulajdonságait, de azon felül lehet plusz tulajdonsága is.
Például az országok osztály tartalmazza az ország nevét, fővároság, népességét, mint tulajdonság.
Legyen az országok osztálynak az ország fővárosát kiíró metódusa, illetve népességnövekedés metódusa,
mely évi 5%-os népesség emelkedéssel tudjon számolni és növelni az addigi népesség számot!
Az uniós_országok alosztály hordozza az ország minden tulajdonságát, de egészítsük ki a belépés dátumával, pénznemmel.
Az ázsiai_orszagok alosztály hordozza az ország osztály minden tulajdonságát, de egészítsük ki az országra jellemző, nevezetesség tulajdonsággal!
Vegyetek fel példányokat mind az ország, mint az uniós, mind az ázsiai országok alosztályhoz.
Végezzetek adatfelvételt és kiírást metódus segítségével! */
    Double Népesség;
    String Név;
    String Főváros;
    public String getCapital(){
        return Főváros;
    }
    public void increasePopulationByPercent(Double N){
        Népesség = Népesség+ Népesség*(N/100)
    }
}
class uniós_országok extends orszag {
    String belépésiDatum;
    String pénznem;
}
class ázsiai_országok extends orszag {
    String nevezetességek;
}