package zoomanagment.zoomanegment.entities;

public abstract class Aquatic extends Animal implements Carnivore<Food>{
     private String habitat;

     //Getters / Setters
    public String getHabitat(){
        return  habitat;
    }
    public void setHabitat(String habitat){
        this.habitat=habitat;
    }

    //Constructeur par defaut
    public Aquatic(){

    }

    //Constructeur parametree
    public Aquatic(String name ,String family , int age , boolean isMammal , String habitat){
        super(name, family, age, isMammal);
        this.habitat=habitat;
    }

    @Override
    public String toString() {
        return  super.toString() +" habitat "+this.habitat;
    }

    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        //1
        if(obj == null)return false;
        //2
        if(this==obj)return true;
        //3
        if(obj instanceof Aquatic){
            Aquatic a = (Aquatic) obj;
            return a.getName().equals(this.getName())
                    && a.getAge()==this.getAge()
                    &&a.habitat.equals(this.habitat);
        }
        return false;
    }
}
