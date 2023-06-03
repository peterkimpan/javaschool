package exercise_2023_06_03.utazas;

public class utazas {
    /* 
    1. Nézzétek meg a negyedik diát. Ez már használja a létrehozott osztályt. Példányokat készít az osztályhoz.
    2. Hozzatok létre egy utazás osztályt! Adjátok meg a következő tulajdonságokat is: célország, város, ár, utazás, tól, ig. Vegyetek fel három példányt az osztályhoz. Pl. gorog_utazas, olasz_utazas.... A példányoknak határozzátok meg a tulajdonságát!
    3. Adjátok be időre a feladatot!*/
    private String célország;
    private String város;
    private Integer ár;
    private String utazás_kezdete;
    private String utazás_vége;
    public utazas(String célország, String város, Integer ár, String utazás_kezdete, String utazás_vége){
        this.célország = célország;
        this.város = város;
        this.ár = ár;
        this.utazás_kezdete = utazás_kezdete;
        this.utazás_vége = utazás_vége;
    }
}
