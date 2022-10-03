package fr.uvsq.cprog.collex.exercice1;

import java.util.Objects;

/**TODO add javadoc comment.
 */
public class DnsItem {
  private NomMachine nomMachine;
  private AdresseIp adresseIp;

  /**.
    */
  public DnsItem(AdresseIp ip, NomMachine nm) {
    this.nomMachine = nm;
    this.adresseIp = ip;
  }

  public AdresseIp getAdresseIp() {
    return adresseIp;
  }

  public NomMachine getNomMachine() {
    return nomMachine;
  }

  @Override
  public boolean equals(Object objet) {
    if (this == objet) {
      return true;
    }
    if (objet == null || getClass() != objet.getClass()) {
      return false;
    }
    DnsItem dnsItem = (DnsItem) objet;
    return Objects.equals(nomMachine, dnsItem.nomMachine)
        && Objects.equals(adresseIp, dnsItem.adresseIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nomMachine, adresseIp);
  }

  @Override
  public String toString() {
    return "DnsItem{"
        + "nomMachine=" + nomMachine
        + ", adresseIp=" + adresseIp
        + '}';
  }
}
