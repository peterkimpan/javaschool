package exercise_2023_05_20;

public class auto{
    private String név;
    private String szín;
    private Integer alvázszám;
    private Integer kilóméteróra;
    public void kilóméterórakiír(){
        System.out.println("A(z) "+név+" autó kilóméterórája: "+kilóméteróra+" km");
    }
    public Integer hozzáadkilómétert(int mennyit){
        kilóméteróra = kilóméteróra + mennyit;
        return kilóméteróra;
    }
    public void setName(String name){
        név = name;
    }
    public void setColor(String color){
        szín = color;
    }
    public void setChassisNumber(int number){
        alvázszám = number;
    }
    public void setKm(int km){
        kilóméteróra = km;
    }
}