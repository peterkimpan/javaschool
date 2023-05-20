package exercise_2023_05_20.jatek;

    public class character{
        private String name;
        private double HP;
        private double baseAttack;
        private double activeAttack;
        private String special;
        private String effects;
        public character(String név, double HP, String special, double baseAttack){
            this.name = név;
            this.HP = HP;
            this.special = special;
            this.baseAttack = baseAttack;
            this.effects = "";
        }
        public double getActiveAttack(){
            return activeAttack;
        }
        public double getHP(){
            return HP;
        }
        public void setHP(double n){
            if(n>=0){
                HP = n;
            }
        }
        public void heal(double n){
            setHP(getHP()+n);
        }
        public void die(){
            System.out.println(name+" died.");
        }
        public void damage(Integer n){
            HP = HP-n;
            if(HP <= 0){
                die();
            }
        }
        public void addEffect(String s){
            effects = s;
        }
        public void roundHandler(){
            switch(effects){
                case "poisoned": HP = HP - 5;
                case "buffed": activeAttack = baseAttack*1.2;
            }
        }
    }
