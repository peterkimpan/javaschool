package exercise_2023_06_03.virag;

public class virag {
    /*  1. Nézzétek meg a 13. diát! Az osztályunk kiegészül az osztályra jellemző metódussal. Itt egy kiírással.
        2. Készítsetek viragok neven egy osztályt! Határozzátok meg a növények tulajdonságát (pl név, maxmagasság, öntözésgyakoriság, ár)! Készítsetek kiírás metódust is, mely meghatározza egy növény öntözési gyakoriságát. 
        3. Töltsétek fel a feladatot időre! */
    private String név;
    private String maxmagasság;
    private String öntözésgyakoriság;
    private Integer ár;
    
    public virag(String név, String maxmagasság, String öntözésgyakoriság, Integer ár){
        this.név = név;
        this.maxmagasság = maxmagasság;
        this.öntözésgyakoriság = öntözésgyakoriság;
        this.ár = ár;
    }
    public String öntözésgyakoriság(String s){
        öntözésgyakoriság = s;
        return s;
    }
}
