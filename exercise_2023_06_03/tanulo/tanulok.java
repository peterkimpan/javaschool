package exercise_2023_06_03.tanulo;

public class tanulok {
    public static void main(String[] args) {
        tanulo Tanulo1 = new tanulo("Kiss Pista",17,"AEZAKMI",10);
        tanulo Tanulo2 = new tanulo("Kulcsár Aranka",16,"UZUMYMW",12);
        tanulo Tanulo3 = new tanulo("Arató András",77,"HIDETHEPAIN",1337);
        tanulo Tanulo4 = new tanulo("Hegedüs Hedvig",15,"KJKSZPJ",15);
        tanulo Tanulo5 = new tanulo("Köteles Julianna",18,"HESOYAM",20);

        Tanulo1.addScore(5);
        System.out.println(Tanulo1.getScore());
    }
}
