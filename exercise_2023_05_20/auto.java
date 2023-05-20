package exercise_2023_05_20;

public class auto{
    String név;
    String szín;
    Integer alvázszám;
    Integer kilóméteróra;
    public void kilóméterórakiír(){
        System.out.println("A(z) "+név+" autó kilóméterórája: "+kilóméteróra);
    }
    public Integer hozzáadkilómétert(int mennyit){
        kilóméteróra = kilóméteróra + mennyit;
        return kilóméteróra;
    }
}