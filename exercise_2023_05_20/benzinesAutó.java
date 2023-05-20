package exercise_2023_05_20;

public class benzinesAutó extends auto {
    private Integer benzinMennyiség = 0;
    private String fillupDate = "";
    public benzinesAutó(String név, String szín, Integer alvázszám, Integer kilóméteróra, Integer benzinMennyiség){
        super(név, szín, alvázszám, kilóméteróra);
        this.benzinMennyiség = benzinMennyiség;
    }
    public void setfillupDate(String s){
        fillupDate = s;
    }
    public Integer tankolás(Integer n){
        if(n >= 0){
            benzinMennyiség = benzinMennyiség + n;
        }
        return benzinMennyiség;
    }
    public Integer fogyasztás(Integer n){
        if(n >= 0){
            benzinMennyiség = benzinMennyiség - n;
        }
        return benzinMennyiség;
    }
    public void printRemainingFuel(){
        System.out.println(benzinMennyiség);
    }
}
