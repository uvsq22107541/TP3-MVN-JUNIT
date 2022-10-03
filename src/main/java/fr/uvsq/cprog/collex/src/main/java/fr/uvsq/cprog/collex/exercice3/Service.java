package fr.uvsq.cprog.collex.exercice3;

/** .
 */

public enum Service {

  /**.
   * Service Achat
   */
  Achat { String nom = "Achat";
    String adresse = "Paris 1"; },
  /**..
   * Service Vente
   */
  Vente { String nom = "Vente";
    String adresse = "Paris 13"; },
  /**.
   * Service Maintenance
   */
  Maintenance { String nom = "Maintenance";
    String adresse = "Marseille"; },
  /**.
   * Service ApresVente
   */
  ApresVente { String nom = "ApresVente";
    String adresse = "Lyon 1"; },
  /**.
   * Service Commercial
   */
  Commercial { String nom = "Commercial";
    String adresse = "Lyon 2"; },
  /**.
   * Service Marketing
   */
  Marketing { String nom = "Marketing";
    String adresse = "Lille"; };
}
