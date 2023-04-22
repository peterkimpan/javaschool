package exercise_due_2023_04_22.harmadik;

import java.util.Scanner;
import java.util.Arrays;
public class harmadik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kérem a versenyzők számát: ");
        int versenyzokSzama = input.nextInt();
        int[] magassagok = new int[versenyzokSzama];
        int[] testsulyok = new int[versenyzokSzama];
        for (int i = 0; i < versenyzokSzama; i++) {
            System.out.print("Kérem a(z) "+(i+1)+" versenyző magasságát: ");
            magassagok[i] = input.nextInt();
            System.out.print("Kérem a(z) "+(i+1)+" versenyző testsúlyát: ");
            testsulyok[i] = input.nextInt();
        }
        int atlagMagassag = 0;
        for (int i = 0; i < testsulyok.length; i++) {
            atlagMagassag += magassagok[i];
        }
        atlagMagassag=atlagMagassag/versenyzokSzama;
        int[] magassagokEmelkedo = new int[versenyzokSzama];
        magassagokEmelkedo = magassagok.clone();
        
        Arrays.sort(magassagokEmelkedo);
        System.out.print("Legalacsonyabb sportoló magassága: "+magassagokEmelkedo[0]+" kg");
        System.out.print("Legmagasabb sportoló magassága: "+magassagokEmelkedo[versenyzokSzama-1]+" kg");3
        input.close();
    }
}
