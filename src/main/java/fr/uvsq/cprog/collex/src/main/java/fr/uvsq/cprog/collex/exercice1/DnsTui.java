package fr.uvsq.cprog.collex.exercice1;

import java.lang.reflect.Array;
import java.util.Scanner;

/** .
 */

public class DnsTui {

  public void affiche(Commande com) {
    System.out.println(com.execute());
  }

  /** .
 */

  public Commande nextCommand() {
    Scanner reader = new Scanner(System.in);  // Reading from System.in
    while (true) {
      System.out.println("Enter une commande:");
      String pointn = reader.next();

      if (AdresseIp.isValide(pointn)) {
        affiche(new RechercheIp(pointn));
      } else if (NomMachine.isValid(pointn)) {
        affiche(new RechercheNomMachine(pointn));
      } else if (pointn.equalsIgnoreCase("q")) {
        affiche(new Quit());
      } else if ((pointn.split("-").length > 1) && (pointn.split("-")[1].equals("a"))) {
        affiche(new RechercheDomaine(pointn, true));
      }
      //reader.close();
      affiche(new RechercheDomaine(pointn, false));
    }
  }
}
