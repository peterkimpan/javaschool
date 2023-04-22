package exercise_due_2023_04_22.hetedik;

import java.util.Scanner;

public class hetedik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kérem az órát: ");
        int ora = input.nextInt();
        switch(ora){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12: System.out.print("Currently it's "+ora+" o'clock in the morning."); break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24: System.out.print("Currently it's "+ora%12+" o'clock in the evening."); break;
        }
    
        input.close();
    }
}
