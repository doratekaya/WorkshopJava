package stream.levels;

import models.Subject;
import models.Teacher;
import utils.Data;

import java.util.Comparator;
import java.util.List;

public class Level1 {

    public static void main(String[] args) {
        List<Teacher> teachers = Data.employees();

        /*
         * TO DO 1: Afficher tous les enseignants
         */
        teachers.stream().forEach(System.out::println);

        /*
         * TO DO 2: Afficher les enseignants dont le nom commence par la lettre n
         */
        teachers.stream().filter(teacher -> teacher.getName().startsWith("n")).forEach(System.out::println);

        /*
         * TO DO 3: Afficher les enseignants dont le nom commence par la lettre n et le salaire > 100000
         */
        teachers.stream().filter(teacher -> teacher.getName().startsWith("n")).filter(teacher -> teacher.getSalary()>100000).forEach(System.out::println);


        /*
         * TO DO 4: Afficher les enseignants JAVA triés par salaire (éliminer les redondances)
         */
        teachers.stream().distinct().filter(teacher -> teacher.getSubject().equals(Subject.JAVA)).sorted(Comparator.comparing(Teacher::getSalary)).forEach(System.out::println);

        /*
         * TO DO 5: Afficher les noms des enseignants dont le salaire > 60000 avec 2 manières différentes
         */

        /* Second Way */
        teachers.stream().filter(teacher -> teacher.getSalary()>60000).map(Teacher::getName).forEach(System.out::println);

        /*
         * TO DO 6:  Ajouter 200 Dt pour les enseignants dont le nom commence par m et afficher celui qui a le salaire le plus élevé
         */
        teachers.stream().filter(t-> t.getName().startsWith("m")).peek(t->t.setSalary(t.getSalary()+200)).max(Comparator.comparing(Teacher::getSalary)).ifPresent(System.out::println);

    }
}
