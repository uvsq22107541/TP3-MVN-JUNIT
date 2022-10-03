package fr.uvsq.cprog.collex.exercice1;

//import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Properties;

/** .
 */

public class Dns {
  Properties appProps;

  /** .
  */
  public Dns() {
    // Create and load default props
    Properties defaultProps = new Properties();
    try {
      FileInputStream in = new FileInputStream(
          "C:\\Users\\HP\\Desktop\\TP3 Cmpl_Prog\\collex-uvsq22107541"
              + "\\src\\main\\java\\fr\\uvsq\\cprog\\collex\\defaultProperties.properties");
      try {
        defaultProps.load(in);
        in.close();
      } catch (IOException e) {
        e.printStackTrace();
      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    // Create props with default
    Properties applicationProps = new Properties(defaultProps);

    // now load properties
    // from last invocation
    try {
      FileInputStream in = new FileInputStream("appProperties");
      try {
        applicationProps.load(in);
        in.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    try {
      AdresseIp ip = new AdresseIp("192.168.1.1");
      NomMachine nomMachine = new NomMachine("nom.de.machine1");

      // Duplicate saving to use the vise-versa search
      applicationProps.setProperty(ip.getIp(), nomMachine.getNomMachine());
      applicationProps.setProperty(nomMachine.getNomMachine(), ip.getIp());

      ip = new AdresseIp("192.168.1.2");
      nomMachine = new NomMachine("nom.de.machine2");

      applicationProps.setProperty(ip.getIp(), nomMachine.getNomMachine());
      applicationProps.setProperty(nomMachine.getNomMachine(), ip.getIp());

      ip = new AdresseIp("192.168.1.3");
      nomMachine = new NomMachine("nom.domaine.machine2");

      applicationProps.setProperty(ip.getIp(), nomMachine.getNomMachine());
      applicationProps.setProperty(nomMachine.getNomMachine(), ip.getIp());


      FileOutputStream out = new FileOutputStream("appProperties");
      try {
        applicationProps.store(out, "---No Comment---");
        out.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    this.appProps = applicationProps;
  }

  /** .
 */

  public DnsItem getItem(AdresseIp ip) {
    String nomMachine = appProps.getProperty(ip.getIp(), null);
    if (nomMachine != null) {
      return new DnsItem(ip, new NomMachine(nomMachine));
    }
    return null;
  }

  /** .
  */

  public DnsItem getItem(NomMachine nomMachine) {
    //System.out.println(appProps);
    String ip = appProps.getProperty(nomMachine.getNomMachine(), null);
    if (ip != null) {
      return new DnsItem(new AdresseIp(ip), nomMachine);
    }
    return null;
  }

  /** .
  */

  public ArrayList<DnsItem> getItems(String domaine) {
    ArrayList<DnsItem> items = new ArrayList<DnsItem>();
    String[] keys = appProps.keySet().toArray(new String[0]);
    for (String k : keys) {
      if (NomMachine.isValid(k)) {
        NomMachine nomMachine = new NomMachine(k);
        if (Objects.equals(nomMachine.getDomain(), domaine)) {
          items.add(getItem(nomMachine));
        }
      }
    }
    return items;
  }
}