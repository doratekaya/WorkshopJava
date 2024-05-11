package collections.prosit10;

import java.util.Comparator;

public class ComparatorNBEmp implements Comparator<Depratement> {
    @Override
    public int compare(Depratement o1, Depratement o2) {
        return o1.getNbEmplpyee()-o2.getNbEmplpyee();
    }
}
