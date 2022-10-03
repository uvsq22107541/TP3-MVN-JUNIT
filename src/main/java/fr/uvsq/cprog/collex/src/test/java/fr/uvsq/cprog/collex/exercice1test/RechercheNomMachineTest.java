package fr.uvsq.cprog.collex.exercice1test;

import fr.uvsq.cprog.collex.exercice1.RechercheNomMachine;
import org.junit.Assert;
import org.junit.Test;

public class RechercheNomMachineTest {
  @Test(expected = IllegalArgumentException.class)
  public void executeTest(){
    RechercheNomMachine rechercheNomMachine = new RechercheNomMachine("nom.de.machine1");
    String ip = "192.168.1.1";
    Assert.assertEquals(ip, rechercheNomMachine.execute());
    ip = "192.168.1.2";
    rechercheNomMachine = new RechercheNomMachine("nom.de.machine2");
    Assert.assertEquals(ip, rechercheNomMachine.execute());

    rechercheNomMachine = new RechercheNomMachine("nom.machine3");
    Assert.assertNotEquals(ip, rechercheNomMachine.execute());

    rechercheNomMachine = new RechercheNomMachine("nom");
    Assert.assertNotEquals(ip, rechercheNomMachine.execute());
  }
}