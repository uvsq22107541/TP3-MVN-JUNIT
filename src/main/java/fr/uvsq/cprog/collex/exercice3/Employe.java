package fr.uvsq.cprog.collex.exercice3;

import java.math.BigDecimal;
import java.time.LocalDate;

/** .
 * */

public class Employe {

  /** .
 * */

  public enum Sex { MASCULIN, FEMININ, AUTRE
  }

  private int age;
  private String nom;
  private BigDecimal salaire;
  private LocalDate dateEmbauche;
  private Sex sex;
  private Service service;

  /** .
 * */
  public Employe(String nom, int age, BigDecimal salaire, LocalDate dateEmbauche,
                 Sex sex, Service service) {
    this.nom = nom;
    this.age = age;
    this.salaire = salaire;
    this.dateEmbauche = dateEmbauche;
    this.sex = sex;
    this.service = service;
  }

  public int getAge() {
    return age;
  }

  public String getNom() {
    return nom;
  }

  public BigDecimal getSalaire() {
    return salaire;
  }

  public LocalDate getDateEmbauche() {
    return dateEmbauche;
  }

  public Sex getSex() {
    return sex;
  }

  public Service getService() {
    return service;
  }

  @Override
  public String toString() {
    return "Employe {"
        + "age=" + age
        + ", nom='" + nom + '\''
        + ", salaire=" + salaire
        + ", dateEmbauche=" + dateEmbauche
        + ", sex=" + sex
        + ", service=" + service
        + '}' + "\n";
  }
}