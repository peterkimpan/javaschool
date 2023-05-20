package exercise_2023_05_20.jatek;
public class Főhős extends character {
    public Főhős(String név, double HP, String special, double baseAttack){
        super(név, HP, special, baseAttack);
        
    }
    String special = "healing";
    public void healing(){
        setHP(getHP()+10);
    }
    String buff;
    public void Buff(){
        addEffect("buffed");
    }



}