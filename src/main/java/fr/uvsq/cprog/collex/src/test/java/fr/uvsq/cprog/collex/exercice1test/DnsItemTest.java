package fr.uvsq.cprog.collex.exercice1test;

import fr.uvsq.cprog.collex.exercice1.AdresseIp;
import fr.uvsq.cprog.collex.exercice1.DnsItem;
import fr.uvsq.cprog.collex.exercice1.NomMachine;
import org.junit.Assert;
import org.junit.Test;

public class DnsItemTest {
  @Test
  public void equalsTest(){
    AdresseIp ip1 = new AdresseIp("192.168.1.1");
    NomMachine nomMachine1 = new NomMachine("nom1.domaine1.local");
    DnsItem dnsItem1 = new DnsItem(ip1, nomMachine1);
    DnsItem dnsItem2 = new DnsItem(ip1, nomMachine1);

    Assert.assertEquals(dnsItem1, dnsItem2);
    AdresseIp ip2 = new AdresseIp("192.168.1.2");
    NomMachine nomMachine2 = new NomMachine("nom2.domaine1.local2");
    dnsItem1 = new DnsItem(ip2, nomMachine2);
    Assert.assertNotEquals(dnsItem1, dnsItem2);
  }
}
