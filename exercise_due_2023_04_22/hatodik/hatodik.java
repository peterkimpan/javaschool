package exercise_due_2023_04_22.hatodik;

import java.util.Scanner;

public class hatodik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kérem a számot: ");
        int szam = input.nextInt();
        if(szam % 2 == 0){
            System.out.println("A szám páros");
        }
        else{
            System.out.println("A szám páratlan");
        }
        if(szam < 0){
            System.out.println("A szám negatív");
        }
        else{
            System.out.println("A szám pozitív");
        }
        input.close();
    }
}
