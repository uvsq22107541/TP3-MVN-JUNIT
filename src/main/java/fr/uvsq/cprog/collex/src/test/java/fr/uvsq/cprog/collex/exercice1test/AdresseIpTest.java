package fr.uvsq.cprog.collex.exercice1test;

import fr.uvsq.cprog.collex.exercice1.AdresseIp;
import org.junit.Assert;
import org.junit.Test;

public class AdresseIpTest {

  @Test(expected = IllegalArgumentException.class)
  public void AdresseIpTest(){
    AdresseIp ip = new AdresseIp("192.168.1.1");
    Assert.assertEquals(ip.getIp(), "192.168.1.1");
    Assert.assertNotEquals(ip.getIp(), "192.168.1.0");
    Assert.assertEquals(ip.getPartOne(), "192");
    Assert.assertEquals(ip.getPartTwo(), "168");
    Assert.assertEquals(ip.getPartThree(), "1");
    Assert.assertEquals(ip.getPartFour(), "1");

    // Here we test if the exception is thrown correctly
    ip = new AdresseIp("192.168");
  }

  @Test
  public void isValideTest(){

    Assert.assertTrue(AdresseIp.isValide("192.168.1.1"));
    Assert.assertTrue(AdresseIp.isValide("255.255.255.255"));
    Assert.assertTrue(AdresseIp.isValide("1.1.1.1"));
    Assert.assertTrue(AdresseIp.isValide("0.0.0.0"));

    Assert.assertFalse(AdresseIp.isValide("192.168.1"));
    Assert.assertFalse(AdresseIp.isValide("192.168.1.1.1"));
    Assert.assertFalse(AdresseIp.isValide("255.255.255.256"));
    Assert.assertFalse(AdresseIp.isValide("255.255.255.2555"));
    Assert.assertFalse(AdresseIp.isValide("255.255.255.255a"));
    Assert.assertFalse(AdresseIp.isValide("192,168,1,1"));
    Assert.assertFalse(AdresseIp.isValide("192..168.1.1"));
    Assert.assertFalse(AdresseIp.isValide("192.,168.1.1"));
    Assert.assertFalse(AdresseIp.isValide(".192.168.1.1"));
    Assert.assertFalse(AdresseIp.isValide("192.168.1.1."));
    Assert.assertFalse(AdresseIp.isValide("abc.def.ghi.jkl"));
    Assert.assertFalse(AdresseIp.isValide("a1.1.1.1"));
    Assert.assertFalse(AdresseIp.isValide("a.1.1.1"));
    Assert.assertFalse(AdresseIp.isValide("-192.-168.-1.-1"));
  }

  @Test
  public void equalsTest(){
    AdresseIp ip1 = new AdresseIp("192.168.0.1");
    AdresseIp ip2 = new AdresseIp("192.168.0.1");

    Assert.assertEquals(ip1, ip2);

    ip2 = new AdresseIp("192.168.1.0");
    Assert.assertNotEquals(ip1, ip2);

  }
}