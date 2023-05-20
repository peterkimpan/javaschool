package exercise_2023_05_20;

public class elektromosAutó extends auto{
    private Integer töltésMennyiség = 0;
    public void töltés(Integer n){
        if(n >= 0){
            töltésMennyiség = töltésMennyiség + n;
        }
    }
    public void fogyasztás(Integer n){
        if(n >= 0){
            töltésMennyiség = töltésMennyiség - n;
        }
    }
    public void printRemainingCharge(){
        System.out.println(töltésMennyiség);
    }

}