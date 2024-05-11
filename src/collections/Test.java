package collections;

import prosit10.Depratement;
import prosit10.GestionDepartement;
import prosit9.Employe;
import prosit9.GestionEmployee;

public class Test {
    public static void main(String[] args) {
        Employe e1 = new Employe(123,"salah","salah","INFO",2);
        Employe e2 = new Employe(234,"dora","dora","Finance",4);
        Employe e3 = new Employe(345,"ines","ines","Marketing",3);
        Employe e4 = new Employe(456,"wijden","wijden","INFO",2);

        Depratement d = new Depratement(222,"INFO",2);
        Depratement d2 = new Depratement(33,"Marketing",1);
        Depratement d4 = new Depratement(33,"Marketing",1);
        Depratement d3 = new Depratement(4,"Finance",4);


        GestionDepartement gd= new GestionDepartement();
        GestionEmployee ge = new GestionEmployee();
        ge.ajouterEmploye(e1);
        ge.ajouterEmploye(e2);
        ge.ajouterEmploye(e3);
        ge.ajouterEmploye(e3);
        ge.ajouterEmploye(e4);

        ge.displayEmploye();
        System.out.println("************");
        gd.ajouterDepartement(d);
        gd.ajouterDepartement(d2);
        gd.ajouterDepartement(d4);
        gd.ajouterDepartement(d3);

        gd.displayDepartement();





        testservices ts =new testservices() {
            @Override
            public void meth1() {

            }

            @Override
            public void meth2() {

            }


        };

    }
}
