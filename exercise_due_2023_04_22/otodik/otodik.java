package exercise_due_2023_04_22.otodik;

import java.util.Scanner;

public class otodik {
    public static void main(String[] args) {
        final String felhasznaloNev = "felhasznalo1";
        final String felhasznaloJelszo = "jelszo123";
        String nev = new String();
        String jelszo = new String();
        Scanner input = new Scanner(System.in);
        System.out.print("Felhasználónév: ");
        nev=input.nextLine();
        System.out.print("Jelszó: ");
        jelszo=input.nextLine();
        int probalkozasok = 0;
        while(!(felhasznaloNev.equals(nev) & felhasznaloJelszo.equals(jelszo))  && probalkozasok < 2){
            System.out.println("Rossz felhasználónév vagy jelszó!");
            System.out.print("Felhasználónév: ");
            nev=input.nextLine();
            System.out.print("Jelszó: ");
            jelszo=input.nextLine();
            probalkozasok++;
        }
        if(probalkozasok < 3){
            System.out.println("Üdvözöljük újra!");
        }
        else{
            System.out.println("Sajnos túllépte a maximális próbálkozások számát. Próbálja újra 3 perc múlva!");
        }
        input.close();
    }
}
