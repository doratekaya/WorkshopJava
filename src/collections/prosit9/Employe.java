package collections.prosit9;

public class Employe implements Comparable<Employe>{
    private int identifiant;
     private String nom , prenom;
   private String nomDep;
    private int grade;

    public Employe() {
    }

    public Employe(int identifiant, String nom, String prenom, String nomDep, int grade) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDep = nomDep;
        this.grade = grade;
    }

    //equals
    public boolean equals(Object o){
        if(o==null)return false;
        if(this==o)return true;
        if(o instanceof Employe){
            Employe emp = (Employe) o;
            return this.identifiant==emp.identifiant&&this.nom.equals(emp.nom);
        }
        return false;
    }


    @Override
    public String toString() {
        return "prosit9.Employe{" +
                "identifiant=" + identifiant +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomDep='" + nomDep + '\'' +
                ", grade=" + grade +
                '}';
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDep() {
        return nomDep;
    }

    public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Employe o) {
        return this.identifiant-o.identifiant;
    }
}
