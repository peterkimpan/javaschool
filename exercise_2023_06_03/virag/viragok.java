package exercise_2023_06_03.virag;

public class viragok {
    public static void main(String[] args){
    virag Leander = new virag("Leander",3000,"3 naponta", 1000, 200, 200);
    virag Mézvirág = new virag("Mézvirág",100,"5 naponta", 200, 10, 5);
    virag Petúnia = new virag("Petúnia",200,"2 naponta", 1500, 50, 20);
    virag Rózsa = new virag("Rózsa",500,"7 naponta", 1200, 200, 50);

    Leander.eltelthónap(3);
    Leander.magasságkiír();
    }
}
