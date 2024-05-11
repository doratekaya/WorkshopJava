package collections.prosit9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GestionEmployee implements IGestion<Employe> {
    List<Employe> employeList;
    public GestionEmployee(){
        employeList = new ArrayList<>();
    }


    @Override
    public void ajouterEmploye(Employe employe) {
        employeList.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e:employeList){
            if (e.getNom().equals(nom))return true;
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
       return employeList.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
       employeList.remove(employe);
    }

    @Override
    public void displayEmploye() {
      for(Employe e : employeList){
          System.out.println(e);
      }
    }
//Comparable
    @Override
    public void trierEmployeParId() {
        Collections.sort(employeList);
    }
//Comparator
    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(employeList,new ComparatorDep().thenComparing(new ComparatorGrade()));
    }
}
