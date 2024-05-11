package collections.prosit11;

import prosit9.Employe;

import java.util.Comparator;

public class CompartorID implements Comparator<Employe> {
    @Override
    public int compare(Employe o1, Employe o2) {
        return o1.getIdentifiant()-o2.getIdentifiant();
    }
}
