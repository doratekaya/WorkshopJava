package zoomanagment.zoomanegment.entities;

public class Terrestrial extends Animal implements Omnivore<Food>{
    int nbLegs;

    public Terrestrial(String name , String family , int age , boolean isMammal , int nbLegs)
        {  super(name, family, age, isMammal);
            this.nbLegs=nbLegs;

        }

    @Override
    public void eatMeat(Food meat) {
        System.out.println("eatPlantandMeat "+meat);
    }

    @Override
    public void eatPlant(Food plant) {
        System.out.println("eatPlantandMeat "+plant);
    }

    @Override
    public void eatPlantandMeat(Food food) {
        System.out.println("eatPlantandMeat "+food);
    }
}
