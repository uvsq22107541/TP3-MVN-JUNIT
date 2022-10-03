package fr.uvsq.cprog.collex.exercice1test;
import fr.uvsq.cprog.collex.exercice1.RechercheDomaine;
import org.junit.Assert;
import org.junit.Test;

public class RechercheDomaineTest {
  @Test
  public void executeTest(){
    RechercheDomaine rechercheDomaine = new RechercheDomaine("de", false);
    String machines = "\nnom.de.machine1 - 192.168.1.1\nnom.de.machine2 - 192.168.1.2";
    Assert.assertEquals(machines, rechercheDomaine.execute());

    rechercheDomaine = new RechercheDomaine("de", true);
    machines = "\nnom.de.machine1 - 192.168.1.1\nnom.de.machine2 - 192.168.1.2";
    Assert.assertEquals(machines, rechercheDomaine.execute());

    rechercheDomaine = new RechercheDomaine("domaine", false);
    machines = "\nnom.domaine.machine2 - 192.168.1.3";
    Assert.assertEquals(machines, rechercheDomaine.execute());

    rechercheDomaine = new RechercheDomaine("domaine", false);
    machines = "\n192.168.1.8";
    Assert.assertNotEquals(machines, rechercheDomaine.execute());
  }
}