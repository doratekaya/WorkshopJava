package zoomanagment.zoomanegment.entities;

public class Dolphin extends Aquatic{
    float swimmingSpeed;
    public Dolphin(String name , String family , int age , boolean isMammal , String habitat , float swimmingSpeed){
        super(name, family, age, isMammal, habitat);
        this.swimmingSpeed=swimmingSpeed;
    }

    public Dolphin(){

    }


    public void swim(){
        System.out.println("this dolphin  is swimming");
    }

    @Override
    public void eatMeat(Food meat) {
        System.out.println("eatPlantandMeat "+meat);
    }
}
