package fr.uvsq.cprog.collex.exercice1;

/** .
 */

public class Quit implements Commande {

  /** .
 */
  public String execute() {
    System.out.println("Exit...");
    System.exit(0);
    return null;
  }
}