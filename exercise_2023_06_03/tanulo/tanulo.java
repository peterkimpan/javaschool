package exercise_2023_06_03.tanulo;

public class tanulo {
    /*Tanulmányozzátok a 22-23. diát. Csakis set és get segítségével tudunk itt adatot bevinni, illetve lekérni.

    Készítsetek tanulo osztályt (név, kor, diakigszám, pontszám) tulajdonságokkal! Vegyetek fel öt tanulót! A pontszám egy verseny eddigi eredményének a pontszámát tárolja. Tudjuk megadni és lekérdezni ezeket a tulajdonságokat, de csakis set és get segítségével!
    Legyen olyan metódusunk, ahol a tanuló pontot szerezhet és növelheti eddigi pontszámát*/
    private String név;
    private Integer kor;
    private String diakigszam;
    private Integer pontszám;
    
    public tanulo(String név, Integer kor, String diakigszam, Integer pontszám){
        this.név = név;
        this.kor = kor;
        this.diakigszam = diakigszam;
        this.pontszám = pontszám;
    }

    public void setName(String S){
        név = S;
    }
    public void setAge(Integer N){
        if(N >= 0){
            kor = N;
        }
    }
    public void setIDCardNumber(String S){
        diakigszam = S;
    }
    public void setScore(Integer N){
        pontszám = N;
    }
    public void addScore(Integer N){
        pontszám = pontszám + N;
    }
    public String getName(){
        return név;
    }
    public Integer getAge(){
        return kor;
    }
    public String getIDCardNumber(){
        return diakigszam;
    }
    public Integer getScore(){
        return pontszám;
    }
}
