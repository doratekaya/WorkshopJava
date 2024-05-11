package zoomanagment.zoomanegment.entities;

public class Zoo {

    private String name, city ;
    private int nbrCages;
    private Animal[] animals;


    Aquatic[] aquaticsAnimals;

    private final int NB_MAX=25;


    private int nbAnimalCree;
    private int nbAquaticCree;



    //Constructeur parametree
    public Zoo(String name,String city, int nbrCages){

        this.name=name;
        this.city=city;
        this.nbrCages=nbrCages;

        //Cree le tableau
        animals=new Animal[NB_MAX];
        aquaticsAnimals=new Aquatic[10];
    }



    //Constructeur par defaut
    public Zoo(){

    }

    //Getters
    public int getNbrCages(){
        return nbrCages;
    }
    public  int getNB_MAX(){
        return NB_MAX;
    }
    public int getNbAnimalCree(){
        return nbAnimalCree;
    }

    public String getName(){
        return name;
    }
    public String getCity(){
        return city;
    }

    //Setters
    public void setName(String name){
        if ((name == null)||(name.isEmpty())) {
            System.out.println("le nom est vide");
        } else {
            this.name=name;
        }
    }

    public void setCity(String city){
        this.city=city;

    }
    public  void setNbrCages(int nbrCages){
        this.nbrCages=nbrCages;
    }



   //toString
    @Override
    public String toString() {
        String s= "tn.esprit.zoomanegment.entities.Zoo : "+this.name+" city : "+this.city+ " nbCages: " +this.nbrCages;
        for(int i =0;i<nbAnimalCree;i++){
           s+= animals[i] +" ***** ";
        }
        return s;
    }

    public void addAnimal(Animal a) throws ZooFullException {
        if(isZoofull()) {
            throw new ZooFullException("Zoo Plein");

        }else{

            if(searchAnimal(a)==-1) {
                animals[nbAnimalCree] = a;
                nbAnimalCree++;
            }
        }

    }

    public void addAquaticAnimal(Aquatic aquatic){
        aquaticsAnimals[nbAquaticCree]=aquatic;
        nbAquaticCree++;

    }

    public void afficherSwim(){
        for (int i = 0 ; i<nbAquaticCree;i++){
            aquaticsAnimals[i].swim();
        }
    }


    public float maxPenguinSwimmingDepth(){
        float max=0;
        for (int i = 0 ; i<nbAquaticCree;i++){
            if(aquaticsAnimals[i] instanceof Penguin){
                Penguin p = (Penguin) aquaticsAnimals[i];
                if (max<p.swimmingDepth){
                    max=p.swimmingDepth;
                }
            }
        }
        return max;

    }
    public void displayNumberOfAquaticsByType(){
        int nbP=0;
        int nbD=0;
        for(int i = 0 ; i<nbAquaticCree;i++){
            if(aquaticsAnimals[i]instanceof Dolphin){
                nbD++;
            }else  if(aquaticsAnimals[i]instanceof Penguin){
                nbP++;
            }
        }
        System.out.println("Daulphin " +nbD);
        System.out.println("Penguin " +nbP);
    }






    public int searchAnimal(Animal a){
        for(int i =0;i<nbAnimalCree;i++){
            if(animals[i].getName().equals(a.getName())){
                return i;
            }
        }
        return -1;
    }


    public void displayZoo(){
        String s= "tn.esprit.zoomanegment.entities.Zoo : "+this.name+" city : "+this.city+ " nbCages: " +this.nbrCages;
        for(int i =0;i<nbAnimalCree;i++){
            s+= animals[i] +" ***** ";
        }
        System.out.println(s);

    }

    public boolean removeAnimal(Animal a){
        int index = searchAnimal(a);
        if(index!=-1){
            for(int i= index; i<nbAnimalCree;i++){
                animals[index]=animals[index+1];
                nbAnimalCree--;
                return true;
            }

        }
        return false;
    }


    public boolean isZoofull(){
        if((nbAnimalCree<NB_MAX)&&(nbAnimalCree<nbrCages)){
            return false;
        }
        return true;
    }


    public static String comparerZoo( Zoo z1 ,Zoo z2){
        if(z1.nbAnimalCree>z2.nbAnimalCree){
            return z1.name;
        }
        return z2.name;
    }




}


