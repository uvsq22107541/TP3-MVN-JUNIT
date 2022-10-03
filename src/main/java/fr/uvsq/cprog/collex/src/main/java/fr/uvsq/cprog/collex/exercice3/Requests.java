package fr.uvsq.cprog.collex.exercice3;

import static java.util.stream.Collectors.averagingLong;
import static java.util.stream.Collectors.groupingBy;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
* La calasse des traitements des requetes.
 */
public class Requests {

  /** .
 */

  public static void allEmploye(List<Employe> employes) {
    // Filtrage de la liste des employés avec la méthode Map de Stream
    System.out.println(employes.stream().map(e -> e).collect(Collectors.toList()));
  }

  /** .
 */

  public static void employeMoins30Ans(List<Employe> employes) {
    // Filtrage des employés moins de 30 ans avec la méthode filter de Stream et collection
    // des résultats avec collect
    System.out.println(employes.stream().filter(e -> e.getAge() < 30).collect(Collectors.toList()));
  }

  /** .
 */

  public static void getNomsHommes(List<Employe> employes) {
    System.out.println(employes.stream().// Filtrage des employés par sex
        filter(e -> e.getSex().equals(Employe.Sex.MASCULIN)).map(Employe::getNom)
        //Extraction des noms
        .collect(Collectors.toList()));
  }

  /** .
 */

  public static void getNomOrdredSalaire(List<Employe> employes) {
    System.out.println(employes.stream()
        .sorted(Comparator.comparing(Employe::getSalaire). //
            reversed()).map(employe -> employe.getNom() + " - " + employe.getSalaire() + "\n")
        .collect(Collectors.toList()));
  }

  /** .
 */

  public static void moyenneSalaires(List<Employe> employes) {
    System.out.println(employes.stream()
        .collect(averagingLong(employe ->
            employe.getSalaire().longValue())));
  }

  /** .
 */

  public static void employeGroupBySex(List<Employe> employes) {
    Map<Employe.Sex, List<Employe>> employeGroupBySex = employes.stream()
        .collect(groupingBy(Employe::getSex));

    employeGroupBySex.forEach((sexe, employess) -> {
      System.out.println("---------------------- "
          + sexe.toString() + " ------------------------");
      employess.forEach(System.out::println);
    });
  }

  /** .
 */

  public static void getMoyenneSalaireBySexe(
      List<Employe> employes) {
    Map<Employe.Sex, Double> salaireparsexe = employes.stream()
        .collect(groupingBy(Employe::getSex,
            averagingLong(employe -> employe.getSalaire().longValue())));


    salaireparsexe.forEach((sexe, salaire) ->
        System.out.println("Sexe : "
            + sexe.toString() + " | Salaire moyen : "
            + salaire.toString()));
    System.out.println(salaireparsexe);
  }

  /** .
 */

  public static void nomDateParService(List<Employe> employes) {
    Map<Service, List<Employe>> employesparservice = employes.stream()
         .collect(groupingBy(Employe::getService));
    //On groupe les deux listes des employés par service dans un map

    employesparservice.forEach((service, employess) -> {
      //nom et date d'embauche des employés groupés par service
      System.out.println(" --------------Service : " + service.toString()
            + "--------------------");
      employess.forEach(employe ->
            System.out.println("Nom : "
                + employe.getNom() + " | Date d'embauche : "
                + employe.getDateEmbauche()));
    });
  }
}