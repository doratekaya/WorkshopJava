package zoomanagment.zoomanegment.entities;

public class Penguin extends Aquatic{
    float swimmingDepth;


    public Penguin(){

    }

    @Override
    public void swim() {
        System.out.println("this penguin  is swimming");
    }

    public Penguin(String name , String family,int age , boolean isMammal , String habitat,float swimmingDepth){
        super(name, family, age, isMammal, habitat);
        this.swimmingDepth=swimmingDepth;
    }

    @Override
    public void eatMeat(Food meat) {
        System.out.println("eatMeat "+meat);
    }
}
