package fr.uvsq.cprog.collex.exercice1test;

import fr.uvsq.cprog.collex.exercice1.NomMachine;
import org.junit.Assert;
import org.junit.Test;

public class NomMachineTest {

  @Test(expected = IllegalArgumentException.class)
  public void NomMachineTest(){
    NomMachine nomMachine = new NomMachine("Machine.domaine.local");
    Assert.assertEquals(nomMachine.getNomMachine(), "Machine.domaine.local");
    Assert.assertNotEquals(nomMachine.getNomMachine(), "nom.machine.local");

    nomMachine = new NomMachine("machine.%");

    Assert.assertEquals(nomMachine.getNom(), "nom");
    Assert.assertEquals(nomMachine.getDomain(), "machine");
    Assert.assertEquals(nomMachine.getNetwork(), "local");


  }

  @Test
  public void isValidTest(){
    Assert.assertTrue(NomMachine.isValid("Nom.Domaine.Local"));
    Assert.assertTrue(NomMachine.isValid("machine1.domaine2.local3"));
    Assert.assertTrue(NomMachine.isValid("1machine.2domaine.3local"));
    Assert.assertTrue(NomMachine.isValid("machine.google.internet"));
    Assert.assertTrue(NomMachine.isValid("www.facebook.com"));
    Assert.assertTrue(NomMachine.isValid("N@m.Domaine-1.Local_1"));

    Assert.assertFalse(NomMachine.isValid("Nom.machine"));
    Assert.assertFalse(NomMachine.isValid("Nom.machine.nom.machine"));
    Assert.assertFalse(NomMachine.isValid("Nom,machine,domaine"));
    Assert.assertFalse(NomMachine.isValid("Nom..machine.domaine"));
    Assert.assertFalse(NomMachine.isValid(".Nom.machine.domaine"));
    Assert.assertFalse(NomMachine.isValid("Nom.machine.domaine."));
    Assert.assertFalse(NomMachine.isValid("(domaine).(machine).1"));
    Assert.assertFalse(NomMachine.isValid("1.2.3"));
  }

  public void equalsTest(){
    NomMachine nomMachine1 = new NomMachine("machine1.domaine1.local");
    NomMachine nomMachine2 = new NomMachine("machine1.domaine1.local");

    Assert.assertEquals(nomMachine1, nomMachine2);

    nomMachine2 = new NomMachine("Machine1.domaine1.local");
    Assert.assertNotEquals(nomMachine1, nomMachine2);;
  }
}