package exercise_2023_05_20.jatek;
import java.util.Scanner;

public class jatekMain {
    
    public static void main(String[] args){
        public Integer Round = 1;
        System.out.println("Játék indul");
        String inputString = new String();
        Scanner bevitel = new Scanner(System.in);
        Round = 1;
        Főhős player = new Főhős("Hero",100,"healing",10);
        //Ellenség enemy = new Ellenség("BadGuy", 100, "poison",8);
        while(player.getHP() > 0 && enemy.getHP() > 0){
            //Round handler
            player.roundHandler();
            enemy.roundHandler();
            //Keyboard handler        
            System.out.print("Játékos, válassz: Heal(h), Attack(a)");
            inputString = bevitel.nextLine().toUpperCase();
            switch(inputString){
                case "a": enemy.damage(player.getActiveAttack());
                case "h": player.heal(10);
            }
            //Enemy keyboard handler
            System.out.print("Ellenség, válassz: Poison(p), Attack(a)");
            inputString = bevitel.nextLine().toUpperCase();
            switch(inputString){
                case "p": player.addEffect("poison");
                case "a": player.damage(10);
            }
        }

    }
}
