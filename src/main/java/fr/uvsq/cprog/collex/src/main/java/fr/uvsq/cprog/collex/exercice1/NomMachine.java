package fr.uvsq.cprog.collex.exercice1;

import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Pattern;

/**TODO add javadoc comment.
 */

public class NomMachine {
  private String nomMachine;

  /**Default constructor.
   */
  public NomMachine(String nomMachine) {
    if (NomMachine.isValid(nomMachine)) {
      this.nomMachine = nomMachine;
    } else {
      throw new IllegalArgumentException();
    }
  }

  /** .
  */

  public String getNomMachine() {
    return nomMachine;
  }

  /** .
  */
  public static boolean isValid(String userNomMachine) {
    if (userNomMachine.endsWith(".")) {
      return false;
    }

    String[] parts = userNomMachine.split("\\.");
    if (parts.length != 3) {
      return false;
    } else {
      // Check if every substring is alphanumeric
      Pattern alphaNum = Pattern.compile("/^[ A-Za-z0-9_@-]*$/");
      for (String part : parts) {
        try {
          int pointi = Integer.parseInt(part);
          return false;
        } catch (NumberFormatException e) {
          if (part.contains("(") || part.contains(")")) {
            return false;
          }
          if (alphaNum.matcher(part).find()) {
            return false;
          }
        }
      }
      return true;
    }
  }

  /** .
  */

  public String getNom() {
    return nomMachine.split("\\.")[0];
  }

  /** .
  */

  public String getDomain() {
    return nomMachine.split("\\.")[1];
  }

  /** .
  */
  public String getNetwork() {
    return nomMachine.split("\\.")[2];
  }

  @Override
  public boolean equals(Object objet) {
    if (this == objet) {
      return true;
    }
    if (objet == null || getClass() != objet.getClass()) {
      return false;
    }
    NomMachine that = (NomMachine) objet;
    return Objects.equals(nomMachine, that.nomMachine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nomMachine);
  }

  @Override
  public String toString() {
    return nomMachine;
  }
}
