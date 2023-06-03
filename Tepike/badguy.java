import java.util.Random;
public class badguy {
    Random random = new Random();


    /*static kellet a név elé, hogy tudja kezelni  hero.Név/badguy.Név formában másik programkód */
    static String Név="Diablo";
    private static int Élet=100;
    String Heal;
    int Poison=0;
    int Damage=5;
    int Mana=10;



    public String getBadguy_neve(){
        return Név;
    }

    public static int getÉlet(){
        return Élet;
    }
    public void setÉlet(int Életmegadása){
        Élet=Életmegadása;
    }

    public void setBadguy_Mana(){
        Mana=Mana+2;
        if(Mana>10){
            Mana=10;
        }

    }




    public void Mérgezés(){
        /*getKöröm még nem működik. Cél, hogy 2 körig mérgezzen és ne lehessen csak 3-4 körönként használni */
        int Random_Mérgezés = random.nextInt(12);
        int Hős_élet= hero.getÉlet();
        if (Random_Mérgezés<6)
            Random_Mérgezés=6;
            Poison=Random_Mérgezés;
        Poison=Random_Mérgezés;
        int sebzett_élet= Hős_élet-Poison;
        hero.setÉlet(sebzett_élet);
        System.out.println("A hős életéből levett a méreg: "+Poison+"-et, így a fennmaradó mennyiség = "+sebzett_élet);
        
           
    }

    public void Mérgezés_nagysága(){
    System.out.println("\nA hősünk ("+hero.Név+")"+" mérgezett sebzése: "+Poison);
    }

    public int getDamage(){
        return Damage;
    }




}
