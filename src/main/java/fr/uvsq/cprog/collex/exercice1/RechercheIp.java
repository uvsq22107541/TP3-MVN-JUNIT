package fr.uvsq.cprog.collex.exercice1;

/** .
 */

public class RechercheIp implements Commande {
  String args;
  /** .
 */

  public RechercheIp(String args) {
    this.args = args;
  }

  /** .
 */

  public String execute() {
    Dns dns = new Dns();
    DnsItem dnsItem = dns.getItem(new AdresseIp(args));
    return  dnsItem.getNomMachine().toString();
  }
}
