package fr.uvsq.cprog.collex.exercice3;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** .
 * */

public class Exercice3Run {

  /** .
 * */

  public static void run() {
    /*Creation d'un jeu de test*/
    Employe e1 = new Employe("Sarah", 23, new BigDecimal(30000),
        LocalDate.of(2019, 11, 30), Employe.Sex.FEMININ, Service.Vente);

    Employe e2 = new Employe("Ali", 50, new BigDecimal(40000),
        LocalDate.of(2019, 11, 30), Employe.Sex.MASCULIN, Service.Achat);

    Employe e3 = new Employe("Karima", 40, new BigDecimal(45000),
        LocalDate.of(2019, 11, 30), Employe.Sex.FEMININ, Service.Maintenance);

    Employe e4 = new Employe("Nazim", 20, new BigDecimal(25000),
        LocalDate.of(2019, 11, 30), Employe.Sex.MASCULIN, Service.Marketing);

    Employe e5 = new Employe("Naila", 43, new BigDecimal(100000),
        LocalDate.of(2019, 9, 30), Employe.Sex.FEMININ, Service.ApresVente);

    Employe e6 = new Employe("Sofiane", 29, new BigDecimal(3000),
        LocalDate.of(2015, 07, 03), Employe.Sex.MASCULIN, Service.Commercial);

    Employe e7 = new Employe("Stephanie", 33, new BigDecimal(15000),
        LocalDate.of(2018, 01, 15), Employe.Sex.FEMININ, Service.Achat);

    final List<Employe> employes = Arrays.asList(e1, e2, e3, e4, e5, e6, e7);

    /* Les requests des tests */
    System.out.println(" ______________________________________________________ ");
    System.out.println(" a. Tous les employés (avec toutes leurs caractéristiques) : ");
    System.out.println(" ______________________________________________________ ");
    Requests.allEmploye(employes);
    System.out.println(" ______________________________________________________ ");
    System.out.println(" b. Les employés de moins de 30 ans : ");
    System.out.println(" ______________________________________________________ ");
    Requests.employeMoins30Ans(employes);
    System.out.println(" ______________________________________________________ ");
    System.out.println(" c. Le nom des hommes : ");
    System.out.println(" ______________________________________________________ ");
    Requests.getNomsHommes(employes);
    System.out.println(" ______________________________________________________ ");
    System.out.println(" d. Le nom et le salaire des employés triés par salaire : ");
    System.out.println(" ______________________________________________________ ");
    Requests.getNomOrdredSalaire(employes);
    System.out.println(" ______________________________________________________ ");
    System.out.println(" e. La moyenne des salaires : ");
    System.out.println(" ______________________________________________________ ");
    Requests.moyenneSalaires(employes);
    System.out.println(" ______________________________________________________ ");
    System.out.println(" f. Les employées regoupés selon leur sexe : ");
    System.out.println(" ______________________________________________________ ");
    Requests.employeGroupBySex(employes);
    System.out.println(" ______________________________________________________ ");
    System.out.println(" g. La moyenne des salaires par Sexe : ");
    System.out.println(" ______________________________________________________ ");
    Requests.getMoyenneSalaireBySexe(employes);
    System.out.println(" ______________________________________________________ ");
    System.out.println(" h. Le nom et la date d'embauche des employés par service");
    System.out.println(" ______________________________________________________ ");
    Requests.nomDateParService(employes);
    System.out.println(" ______________________________________________________ ");
  }
}