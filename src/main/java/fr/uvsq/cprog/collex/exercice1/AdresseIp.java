package fr.uvsq.cprog.collex.exercice1;

import java.util.Objects;

/**TODO add javadoc comment.
  */
public class AdresseIp {
  private String ip;

  /** Default constructor.
   */
  public AdresseIp(String ip) {
    if (AdresseIp.isValide(ip)) {
      this.ip = ip;
    } else {
      throw new IllegalArgumentException();
    }
  }

  /** Methode.
   */

  public String getIp() {
    return ip;
  }

  /** Methode.
   */

  public static boolean isValide(String ip) {
    String[] parts = ip.split("\\.");
    if (ip.endsWith(".")) {
      return false;
    }
    if (parts.length != 4) {
      return false;
    } else {
      for (int i = 0; i < 4; i++) {
        try {
          int part = Integer.parseInt(parts[i]);
          if ((part > 255) || (part < 0)) {
            return false;
          }
        } catch (NumberFormatException e) {
          return false;
        }
      }
    }
    return true;
  }

  public String getPartOne() {
    return this.ip.split("\\.")[0];
  }

  public String getPartTwo() {
    return this.ip.split("\\.")[1];
  }

  public String getPartThree() {
    return this.ip.split("\\.")[2];
  }

  public String getPartFour() {
    return this.ip.split("\\.")[3];
  }

  @Override
  public boolean equals(Object objet) {
    if (this == objet) {
      return true;
    }
    if (objet == null || getClass() != objet.getClass()) {
      return false;
    }
    AdresseIp adresseIp = (AdresseIp) objet;
    return Objects.equals(ip, adresseIp.ip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ip);
  }

  @Override
  public String toString() {
    return ip;
  }

}
