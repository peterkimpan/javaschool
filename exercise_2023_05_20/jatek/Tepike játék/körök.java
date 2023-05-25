import java.util.Scanner;
public class körök {
   static int  Körszámláló=1;

    public static void getKöröm(){
        Körszámláló=Körszámláló;
    }
    public static void Rounds(){
        
        hero Főhős;
        badguy Badguy;
        Főhős = new hero();
        Badguy = new badguy();
        Scanner bevitel = new Scanner(System.in);
        int Körszámláló=1;
        System.out.println("Megkezdődött az 1. kör");

        do{
            if(hero.getÉlet()<1){
                System.out.println("\nA játék végetért, mert "+Főhős.getHős_neve()+"-t elpusztították");
                break;
            }
            System.out.println("\nHős léphető opciói"+"\s|\sSaját élet= "+hero.getÉlet()+"\nA= Támadás, H= Healelás, D= Damage Boost támadás"+"\s\s |\s\s"+Badguy.getBadguy_neve()+"Életereje = "+Badguy.getÉlet());
            String Hős_válasz = bevitel.next();
            
            switch(Hős_válasz){
                case "A":
                    Badguy.getÉlet();
                    Badguy.setÉlet(Badguy.getÉlet()-Főhős.getDamage());
                    System.out.println("Sikeres támadás bevitel");

                    break;
                case "H":
                    System.out.println(""+Főhős.getHős_neve()+" Healelt");
                    Főhős.Healelés();
                    System.out.println("Így az élete "+hero.getÉlet()+" re nőtt");
                    break;
                case "D":
                    Főhős.Boost_damagebe();
                    Főhős.getDamage();
                    Badguy.setÉlet(Badguy.getÉlet()-Főhős.getDamage());
                    break;


                default:
                    System.out.print("Helytelen beivetl miat próbáld újra");
                    
                    
                

            }
            /*Második szakasz Badguy */

            if(badguy.getÉlet()<1){
                System.out.println("\nA játék végetért, mert "+Badguy.getBadguy_neve()+"-t elpusztítottad");
                break;
            }
                System.out.println("\nKövetkező karakter lép ");

                System.out.println("Gonosz léphető opciói "+"\s|\sSaját élet= "+Badguy.getÉlet());
                System.out.println("A= Támadás, M= Mérgezés"+"\s\s|"+"\s\s"+Főhős.getHős_neve()+"Életereje = "+Főhős.getÉlet());
                String Badguy_válasz = bevitel.next();
                switch(Badguy_válasz){
                    case "A":
                        Főhős.getÉlet();
                        Főhős.setÉlet(Főhős.getÉlet()-Badguy.getDamage());
                        System.out.println("Sikeres támadás bevitel");
                        break;

                    case "M":
                        System.out.println("Méregezés sikeres");
                        Badguy.Mérgezés();
                        break;

                    default:
                    
                        break;
                    
    
                }
                Körszámláló++;
                System.out.println("Jelenlegi kör száma= "+Körszámláló);

        }
        while (Badguy.getÉlet()+Főhős.getÉlet()>99);


    
    


}
}

