package fr.uvsq.cprog.collex.exercice2test;

import fr.uvsq.cprog.collex.exercice2.Cercle;
import fr.uvsq.cprog.collex.exercice2.Point;
import org.junit.Assert;
import org.junit.Test;

public class CercleTest {
  @Test
  public void CerleTest(){
    Point p = new Point(2,3);
    double r = 4.0;
    Cercle cercle = new Cercle(p, r);
    Assert.assertEquals(p, cercle.getCenter());
    Assert.assertEquals(4,cercle.getRadius(),0);
  }

  @Test
  public void calcDiameterTest(){
    Point p = new Point(2,3);
    double r = 4.0;
    Cercle cercle = new Cercle(p, r);
    Assert.assertEquals(8,cercle.calcDiameter(), 0);
  }

   @Test
  public void calcPerimeterTest(){
    Point p = new Point(2,3);
    double r = 4.0;
    Cercle cercle = new Cercle(p, r);
    Assert.assertEquals(25.132741228718345, cercle.calcPerimeter(), 0.1);
  }

  @Test
  public void calcSurfaceTest(){
     Point p = new Point(2,3);
     double r = 4.0;
     Cercle cercle = new Cercle(p, r);
     Assert.assertEquals(50.26548245743669,cercle.calcSurface(),0.1);
   }
}