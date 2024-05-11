package collections.prosit11;

import prosit10.Depratement;
import prosit9.Employe;

import java.util.*;

public class AffectationHashMap {
    Map<Employe, Depratement> mapAffectation;
    public AffectationHashMap(){
        mapAffectation =new HashMap<>();
    }


    //TODO 1
    public void ajouterEmployeDepartement(Employe e, Depratement d){
        mapAffectation.put(e,d);

    }

    //TODO 2
    public void afficherEmployesEtDepartements(){
        for(Map.Entry<Employe,Depratement> aff : mapAffectation.entrySet()){
            System.out.println("l'employe "+aff.getKey()+"est affecté au dep "+aff.getValue());
        }

    }

    //TODO 3
    public boolean supprimerEmploye (Employe e){

        Depratement d = mapAffectation.get(e);
       if(mapAffectation.remove(e).equals(d))return true;
       return false;
    }

    public boolean supprimerEmployeEtDepartement (Employe e, Depratement d){
        return mapAffectation.remove(e,d);
    }

    public void  afficherEmployes(){
        Set<Employe> emp = mapAffectation.keySet();
        for (Employe e : emp){
            System.out.println(e);
        }
    }

    public void afficherDepartements(){
        Collection<Depratement> dep =mapAffectation.values();
        for(Depratement d : dep){
            System.out.println(d);
        }
    }
   public boolean rechercherEmploye (Employe e){
       return mapAffectation.containsKey(e);
   }
    public boolean rechercherDepartement (Depratement d){
        return mapAffectation.containsValue(d);
    }

    public TreeMap<Employe, Depratement> trierMap(){
        Map<Employe,Depratement> mapTrier = new TreeMap<>(new CompartorID());
        mapTrier.putAll(mapAffectation);
        return (TreeMap<Employe, Depratement>) mapTrier;

    }

}
