package exercise_2023_06_03.virag;

public class virag {
    /*  1. Nézzétek meg a 13. diát! Az osztályunk kiegészül az osztályra jellemző metódussal. Itt egy kiírással.
        2. Készítsetek viragok neven egy osztályt! Határozzátok meg a növények tulajdonságát (pl név, maxmagasság, öntözésgyakoriság, ár)! Készítsetek kiírás metódust is, mely meghatározza egy növény öntözési gyakoriságát. 
        3. Töltsétek fel a feladatot időre! */

    /*A 18. dián két metódust is tartalmaz az osztály. Nézzétek meg ezeket. Az egyik kiírást végez, a másik pedig növeli az egyenleg értékét
Tegyük fel, hogy a növény osztályt alkalmazzuk. Felvettetek négy példányt (tetszőleges növények, tetszőleges tulajdonságokkal)
Tudjuk, hogy egy hónap alatt hány mm-t nő átlagosan a növény. Kérjük be a felhasználótól, hogy hány hónap telt el a vásárlás óta!
Készítsetek metódust, mely növelni tudja a megadott növény magasságát. Egy másik metódus pedig tudja kiírni a pillanatnyi állapotot
Pl. a Leandre 3 hónap után 40,3 cm */
    private String név;
    private Integer maxmagasság;
    private Integer magasság;
    private String öntözésgyakoriság;
    private Integer havinövekedés;
    private Integer ár;
    
    public virag(String név, Integer maxmagasság, String öntözésgyakoriság, Integer ár, Integer magasság, Integer havinövekedés){
        this.név = név;
        this.maxmagasság = maxmagasság;
        this.öntözésgyakoriság = öntözésgyakoriság;
        this.ár = ár;
        this.magasság = magasság;
        this.havinövekedés = havinövekedés;
    }
    public String öntözésgyakoriság(String s){
        öntözésgyakoriság = s;
        return s;
    }
    public void eltelthónap(Integer N){
        magasság = magasság + N*havinövekedés;
    }
    public void magasságkiír(){
        System.out.println(név+" magassága "+magasság+" mm.");
    }
    
}
