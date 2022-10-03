package fr.uvsq.cprog.collex.exercice1;

import java.util.ArrayList;
import java.util.Collections;

/** .
 */

public class RechercheDomaine implements Commande {
  String args;
  boolean flag;
  
  /** .
 */
  
  public RechercheDomaine(String args, boolean flag) {
    this.args = args;
    this.flag = flag;
  }

  /** .
 */
  public String execute() {
    ArrayList<DnsItem> items;
    Dns dns = new Dns();
    items = dns.getItems(args);
    ArrayList<String> ipsMachine = new ArrayList<>();
    for (DnsItem item : items) {
      ipsMachine.add(item.getNomMachine().toString() + " - " + item.getAdresseIp().toString());
    }
    //if(flag){
    Collections.sort(ipsMachine);
    //}

    String result = "";
    for (String s : ipsMachine) {
      result = result + "\n" + s;
    }
    return result;
  }
}