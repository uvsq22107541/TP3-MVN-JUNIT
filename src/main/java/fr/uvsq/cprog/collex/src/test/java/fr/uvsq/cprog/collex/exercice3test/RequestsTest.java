package fr.uvsq.cprog.collex.exercice3test;

import fr.uvsq.cprog.collex.exercice3.Employe;
import fr.uvsq.cprog.collex.exercice3.Requests;
import fr.uvsq.cprog.collex.exercice3.Service;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class RequestsTest {
  /*Creation d'un jeu de test*/
  Employe e1 = new Employe("employe1", 23, new BigDecimal(30000),
      LocalDate.of(2019, 11, 30), Employe.Sex.FEMININ, Service.Vente);

  Employe e2 = new Employe("employe2", 50, new BigDecimal(40000),
      LocalDate.of(2019, 11, 30), Employe.Sex.MASCULIN, Service.Achat);

  Employe e3 = new Employe("employe3", 40, new BigDecimal(45000),
      LocalDate.of(2019, 11, 30), Employe.Sex.FEMININ, Service.Maintenance);

  Employe e4 = new Employe("employe4", 20, new BigDecimal(25000),
      LocalDate.of(2019, 11, 30), Employe.Sex.MASCULIN, Service.Marketing);

  Employe e5 = new Employe("employe5", 43, new BigDecimal(100000),
      LocalDate.of(2019, 9, 30), Employe.Sex.FEMININ, Service.ApresVente);

  Employe e6 = new Employe("employe6", 29, new BigDecimal(3000),
      LocalDate.of(2015, 07, 03), Employe.Sex.MASCULIN, Service.Commercial);

  Employe e7 = new Employe("employe7", 33, new BigDecimal(15000),
      LocalDate.of(2018, 01, 15), Employe.Sex.FEMININ, Service.Achat);

  List<Employe> employes = Arrays.asList(e1, e2, e3, e4, e5, e6, e7);

  @Test
  public void allEmployeTest(){
    Requests.allEmploye(employes);
  }

  @Test
  public void employeMoins30AnsTest(){
    Requests.employeMoins30Ans(employes);
  }

  @Test
  public void getNomsHommesTest(){
    Requests.getNomsHommes(employes);
  }

  @Test
  public void getNomOrdredSalaireTest(){
    Requests.getNomOrdredSalaire(employes);
  }

  @Test
  public void moyenneSalairesTest(){
    Requests.moyenneSalaires(employes);
  }

  @Test
  public void employeGroupBySex(){
    Requests.employeGroupBySex(employes);
  }

  @Test
  public void employeGroupBySexTest(){
    Requests.getMoyenneSalaireBySexe(employes);
  }

  @Test
  public void nomDateParService(){
    Requests.nomDateParService(employes);
  }
}

