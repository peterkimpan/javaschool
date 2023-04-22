package exercise_due_2023_04_22.masodik;
import java.util.Scanner;
public class masodik{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString = new String();
        System.out.print("Film besorolási kategória: ");
        inputString = input.nextLine().toUpperCase();
        switch(inputString){
            case "G":System.out.println("G (General audience - All ages admitted) – A filmben semmi olyan nincs, ami a szülőben aggodalmat ébreszthetne. Avagy: vidd el a gyereket!"); break;
            case "PG":System.out.println("G (General audience - All ages admitted) – A filmben semmi olyan nincs, ami a szülőben aggodalmat ébreszthetne. Avagy: vidd el a gyereket!"); break;
            case "PG-13":System.out.println("G (General audience - All ages admitted) – A filmben semmi olyan nincs, ami a szülőben aggodalmat ébreszthetne. Avagy: vidd el a gyereket!"); break;
            case "R":System.out.println("G (General audience - All ages admitted) – A filmben semmi olyan nincs, ami a szülőben aggodalmat ébreszthetne. Avagy: vidd el a gyereket!"); break;
            case "NC-17":System.out.println("G (General audience - All ages admitted) – A filmben semmi olyan nincs, ami a szülőben aggodalmat ébreszthetne. Avagy: vidd el a gyereket!"); break;
            default: System.out.println("Nincs ilyen jelölés!");
        }
        input.close();
    }
}