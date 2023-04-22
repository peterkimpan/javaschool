package exercise_due_2023_04_22.hetedik;

import java.util.Scanner;

public class hetedik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kérem az órát: ");
        int ora = input.nextInt();
        if(ora<=12){
            System.out.print("Currently it's "+ora+" o'clock in the morning.");
        }
        else{
            System.out.print("Currently it's "+ora%12+" o'clock in the evening.");
        }       
        input.close();
    }
}
