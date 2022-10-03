package fr.uvsq.cprog.collex.exercice1test;

import fr.uvsq.cprog.collex.exercice1.RechercheIp;
import org.junit.Assert;
import org.junit.Test;

public class RechercheIpTest {
  @Test(expected = IllegalArgumentException.class)
  public void executeTest(){
    RechercheIp rechercheIp = new RechercheIp("192.168.1.1");
    String nomDeMachine = "nom.de.machine1";
    Assert.assertEquals(nomDeMachine, rechercheIp.execute());
    nomDeMachine = "nom.de.machine2";
    rechercheIp = new RechercheIp("192.168.1.2");
    Assert.assertEquals(nomDeMachine, rechercheIp.execute());
    nomDeMachine = "nom.de.machine3";
    Assert.assertNotEquals(nomDeMachine, rechercheIp.execute());

    rechercheIp = new RechercheIp("192");
    Assert.assertEquals(nomDeMachine, rechercheIp.execute());
  }
}
