package fr.uvsq.cprog.collex;

import fr.uvsq.cprog.collex.exercice1.DnsApp;
import fr.uvsq.cprog.collex.exercice2.InterfaceUtilisateur;
import fr.uvsq.cprog.collex.exercice3.Exercice3Run;

/**
 * Hello world!.
 *
 */
public class App {

  /** .
 * */

  public static void main(String[] args) {
    /* exo1 - Lancement de l'application DNS (Interface - Ligne de commande)
    DnsApp dnsApp = new DnsApp();
    dnsApp.run();

     */




    //exo3 - Affichage des résultats des 8 requetes
    Exercice3Run.run();



    /*exo2 - Lancement du logiciel de dessin 2D (Interface - Ligne de commande)
    InterfaceUtilisateur ui = new InterfaceUtilisateur();
    ui.printCommands();
    while (true) {
      ui.readCommand();
    }

     */

  }
}
