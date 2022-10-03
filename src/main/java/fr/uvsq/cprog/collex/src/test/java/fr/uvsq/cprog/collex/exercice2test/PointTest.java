package fr.uvsq.cprog.collex.exercice2test;

import fr.uvsq.cprog.collex.exercice2.Point;
import org.junit.Assert;

public class PointTest {
  public void PointTest(){
    Point point = new Point(3, 2);
    Assert.assertEquals(3, point.getPointX());
    Assert.assertEquals(2, point.getPointY());
  }

  public void moveTest(){
    Point point = new Point(3, 2);
    point.move(2,2);
    Assert.assertEquals(5, point.getPointX());
    Assert.assertEquals(4, point.getPointY());
  }
}