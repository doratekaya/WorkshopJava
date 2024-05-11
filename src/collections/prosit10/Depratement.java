package collections.prosit10;

import java.util.Objects;

public class Depratement implements Comparable<Depratement>{

    private int id;
    private String nom ;
    private int nbEmplpyee;


    public Depratement(int id, String nom, int nbEmplpyee) {
        this.id = id;
        this.nom = nom;
        this.nbEmplpyee = nbEmplpyee;
    }

    public Depratement() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbEmplpyee() {
        return nbEmplpyee;
    }

    public void setNbEmplpyee(int nbEmplpyee) {
        this.nbEmplpyee = nbEmplpyee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Depratement that = (Depratement) o;
        return id == that.id && nbEmplpyee == that.nbEmplpyee && Objects.equals(nom, that.nom);
    }

    @Override
    public int hashCode() {
        int x = 25;
        x+=30 + id;
        x+=30 + nom.hashCode();
        return x;
    }

    @Override
    public String toString() {
        return "Depratement{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbEmplpyee=" + nbEmplpyee +
                '}';
    }

    @Override
    public int compareTo(Depratement o) {
        return this.getId()-o.getId();
    }
}

