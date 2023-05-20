package exercise_2023_05_20;

public class benzinesAutó extends auto {
    private Integer benzinMennyiség = 0;
    public void tankolás(Integer n){
        if(n >= 0){
            benzinMennyiség = benzinMennyiség + n;
        }
    }
    public void fogyasztás(Integer n){
        if(n >= 0){
            benzinMennyiség = benzinMennyiség - n;
        }
    }
    public void printRemainingFuel(){
        System.out.println(benzinMennyiség);
    }
}
