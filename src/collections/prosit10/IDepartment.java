package collections.prosit10;

import java.util.TreeSet;

public interface IDepartment<T> {


        public void ajouterDepartement(T t);
        public boolean rechercherDepartement(String nom);
        public boolean rechercherDepartement(T t);
        public void supprimerDepartement(T t);
        public void displayDepartement();
        public TreeSet<T> trierDepartementByld();

}
