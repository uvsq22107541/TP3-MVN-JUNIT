package fr.uvsq.cprog.collex.exercice1test;

import fr.uvsq.cprog.collex.exercice1.Dns;
import org.junit.Test;
import fr.uvsq.cprog.collex.exercice1.AdresseIp;
import fr.uvsq.cprog.collex.exercice1.DnsItem;
import fr.uvsq.cprog.collex.exercice1.NomMachine;
import org.junit.Assert;
import java.util.ArrayList;


import java.io.FileNotFoundException;

public class DnsTest {
  @Test
  public void DnsTest(){
    Dns dns = new Dns();
  }

  @Test
  public void getItemTest(){
    Dns dns = new Dns();
    DnsItem dnsItem = new DnsItem(new AdresseIp("192.168.1.1"), new NomMachine("nom.de.machine1"));
    Assert.assertEquals(dnsItem, dns.getItem(new AdresseIp("192.168.1.1")));
    Assert.assertEquals(dnsItem, dns.getItem(new NomMachine("nom.de.machine1")));
    dnsItem = new DnsItem(new AdresseIp("192.168.1.1"), new NomMachine("nom.de.machine"));
    Assert.assertNotEquals(dnsItem, dns.getItem(new AdresseIp("192.168.1.1")));
    Assert.assertEquals(null, dns.getItem(new AdresseIp("192.168.1.0")));
  }

  @Test
  public void getItemsTest(){
    Dns dns = new Dns();
    ArrayList<DnsItem> dnsItems = new ArrayList<DnsItem>();
    DnsItem dnsItem = new DnsItem(new AdresseIp("192.168.1.2"), new NomMachine("nom.de.machine2"));
    dnsItems.add(dnsItem);
    dnsItem = new DnsItem(new AdresseIp("192.168.1.1"), new NomMachine("nom.de.machine1"));
    dnsItems.add(dnsItem);
    Assert.assertEquals(dnsItems, dns.getItems("de"));
    Assert.assertNotEquals(dnsItem, dns.getItems("domaine"));
  }
}
