package zoomanagment.zoomanegment.entities;

public class Animal {


    private String family , name;
    private int age;
   private boolean isMammal;



    //Constructeur parametre

    public Animal(String name,String family,int age , boolean isMammal){

        this.name=name;
        this.family=family;
        this.age=age;
        this.isMammal=isMammal;
    }

    //Constructeur par defaut
    public Animal(){
        System.out.println("tn.esprit.zoomanegment.entities.Animal created");
    }



    //Getters

    public int getAge(){
        return this.age;
    }
    public String getName(){
        return  name;
    }
    public String getFamily(){
        return family;

    }
    public  boolean isMammal(){
        return isMammal;
    }



    //Setters

    public void setName(String name){
        this.name=name;
    }
    public void setFamily(String family){
        this.family=family;
    }
    public void setMammal(boolean mammal){
        isMammal=mammal;
    }
    public void setAge(int age)throws InvalidAgeException{
        if(age<0){
           throw new InvalidAgeException("L'age doit etre positif");
        }else {
            this.age=age;
        }
    }

    @Override
    public String toString() {
        return  this.name + "family : "+this.family+ " age : "+this.age+" isMammal "+this.isMammal;
    }
}
