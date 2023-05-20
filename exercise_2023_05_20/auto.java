package exercise_2023_05_20;

public class auto{
    private String név;
    private String szín;
    private Integer alvázszám;
    private Integer kilóméteróra;
    
    public auto(String név, String szín, Integer alvázszám, Integer kilóméteróra){
        this.név = név;
        this.szín = szín;
        this.alvázszám = alvázszám;
        this.kilóméteróra = kilóméteróra;
    }
    public void kilóméterórakiír(){
        System.out.println("A(z) "+név+" autó kilóméterórája: "+kilóméteróra+" km");
    }
    public Integer hozzáadkilómétert(int mennyit){
        kilóméteróra = kilóméteróra + mennyit;
        return kilóméteróra;
    }
    public void addKm(Integer km){
        if(km>=0){
            kilóméteróra = kilóméteróra + km;
        }
    }
    public void setName(String name){
        if(name != ""){
            név = name;
        }
        else
        {
            System.out.println("Érvénytelen név");
        }
    }
    public void setColor(String color){
        if(color != ""){
            szín = color;
        }
        else
        {
            System.out.println("Érvénytelen szín");
        }
    }
    public void setChassisNumber(int number){
        alvázszám = number;
    }
    public void setKm(int km){
        if(km >= 0){
            kilóméteróra = km;
        }
        else
        {
            System.out.println("Érvénytelen kilóméterállás");
        }
    }
    public String getName(){return név;}
    public String getColor(){return szín;}
    public Integer getChassisNumber(){return alvázszám;}
    public Integer getKm(){return kilóméteróra;}
}