package fr.uvsq.cprog.collex.exercice3test;

import fr.uvsq.cprog.collex.exercice3.Employe;
import fr.uvsq.cprog.collex.exercice3.Service;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class EmployeTest {
  Employe employe = new Employe("employe1", 23, new BigDecimal(30000),
      LocalDate.of(2019, 11, 30), Employe.Sex.FEMININ, Service.Vente);
  @Test
  public void EmployeTest(){
    LocalDate date_embauhe = LocalDate.of(2019,11,30);
    Assert.assertEquals("employe1", employe.getNom());
    Assert.assertEquals(23, employe.getAge());
    Assert.assertEquals(new BigDecimal(30000), employe.getSalaire());
    Assert.assertEquals(date_embauhe, employe.getDateEmbauche());
    Assert.assertEquals(Employe.Sex.FEMININ, employe.getSex());
    Assert.assertEquals(Service.Vente, employe.getService());
  }
}