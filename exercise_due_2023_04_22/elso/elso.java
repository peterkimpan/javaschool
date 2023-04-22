import java.util.Scanner;
public class elso{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int elso;
        int masodik;
        System.out.print("Kérem az első számot: ");
        elso=input.nextInt();
        System.out.print("Kérem a második számot: ");
        masodik=input.nextInt();
        System.out.println(elso+" + "+masodik+" = "+(elso+masodik));
        System.out.println(elso+" - "+masodik+" = "+(elso-masodik));
        System.out.println(elso+" * "+masodik+" = "+(elso*masodik));
        System.out.println(elso+" / "+masodik+" = "+(elso/masodik));
        input.close();
    }
}