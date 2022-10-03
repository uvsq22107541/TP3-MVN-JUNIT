package fr.uvsq.cprog.collex.exercice1;

/** .
 */

public class RechercheNomMachine implements Commande {
  String args;

  /** .
 */

  public RechercheNomMachine(String args) {
    this.args = args;
  }

  /** .
 */

  public String execute() {
    Dns dns = new Dns();
    DnsItem dnsItem = dns.getItem(new NomMachine(args));
    return dnsItem.getAdresseIp().toString();
  }
}