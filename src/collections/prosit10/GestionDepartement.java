package collections.prosit10;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GestionDepartement implements IDepartment<Depratement>{

    Set<Depratement> depratementSet;

    public GestionDepartement(){
        depratementSet = new HashSet<>();
    }


    @Override
    public void ajouterDepartement(Depratement depratement) {
        depratementSet.add(depratement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for(Depratement d:depratementSet){
            if(d.getNom().equals(nom))return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Depratement depratement) {
        return  depratementSet.contains(depratement);
    }

    @Override
    public void supprimerDepartement(Depratement depratement) {
     depratementSet.remove(depratement);
    }

    @Override
    public void displayDepartement() {
        for (Depratement d :depratementSet){
            System.out.println(d);
        }

    }


    //1 er methode par comprabale
    @Override
    public TreeSet<Depratement> trierDepartementByld() {
        //1 er methode par comprabale
        Set<Depratement> treeSet = new TreeSet<>(depratementSet);
        return (TreeSet<Depratement>) treeSet;
    }


    //2 eme methode para comparator
    public TreeSet<Depratement> trierDepartementByNBEmployee() {
        //1 er methode par comprabale
        Set<Depratement> treeSet = new TreeSet<>(new ComparatorNBEmp());
        treeSet.addAll(depratementSet);
        return (TreeSet<Depratement>) treeSet;
    }
}
