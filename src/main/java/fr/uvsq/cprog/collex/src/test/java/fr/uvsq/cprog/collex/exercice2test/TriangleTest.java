package fr.uvsq.cprog.collex.exercice2test;

import fr.uvsq.cprog.collex.exercice2.Point;
import fr.uvsq.cprog.collex.exercice2.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class TriangleTest{

  @Test
  public void TriangleTest(){
    Point a = new Point(2,2);
    Point b = new Point(3,3);
    Point c = new Point(2,6);
    Triangle triangle = new Triangle(a, b, c);
    Assert.assertEquals(a, triangle.getPointA());
    Assert.assertEquals(b, triangle.getPointB());
    Assert.assertEquals(c, triangle.getPointC());
  }

    @Test
  public void longeurATest(){
    Point a = new Point(2,2);
    Point b = new Point(3,3);
    Point c = new Point(2,6);
    Triangle triangle = new Triangle(a, b, c);
    Assert.assertEquals(3.1622776601683795, triangle.longeurA(), 0.1);
  }

  @Test
  public void longeurBTest(){
    Point a = new Point(2,2);
    Point b = new Point(3,3);
    Point c = new Point(2,6);
    Triangle triangle = new Triangle(a, b, c);
    Assert.assertEquals(4.0, triangle.longeurB(), 0.1);
  }

  @Test
  public void longeurCTest(){
    Point a = new Point(2,2);
    Point b = new Point(3,3);
    Point c = new Point(2,6);
    Triangle triangle = new Triangle(a, b, c);
    Assert.assertEquals(1.4142135623730951, triangle.longeurC(), 0.1);
  }

  @Test
  public void calcPerimeterTest(){
    Point a = new Point(2,2);
    Point b = new Point(3,3);
    Point c = new Point(2,6);
    Triangle triangle = new Triangle(a, b, c);
    Assert.assertEquals(8.576491222541476, triangle.calcPerimeter(), 0.1);
  }

  @Test
  public void calcSurface(){
    Point a = new Point(2,2);
    Point b = new Point(3,3);
    Point c = new Point(2,6);
    Triangle triangle = new Triangle(a, b, c);
    Assert.assertEquals(2.000000000000003, triangle.calcSurface(), 0.1);
  }
}