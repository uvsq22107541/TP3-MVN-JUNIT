package fr.uvsq.cprog.collex.exercice2test;

import fr.uvsq.cprog.collex.exercice2.Point;
import fr.uvsq.cprog.collex.exercice2.Rectangle;
import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

  @Test
  public void RectangleTest() {
    Point pbl = new Point(2, 2);
    Point ptr = new Point(4, 4);
    Rectangle rectangle = new Rectangle(pbl, ptr);
    Assert.assertEquals(pbl, rectangle.getBottomLeft());
    Assert.assertEquals(ptr, rectangle.getTopRight());
  }

  @Test
  public void calcLongeurTest(){
    Point pbl = new Point(2,2);
    Point ptr = new Point(4,4);
    Rectangle rectangle = new Rectangle(pbl,ptr);
    Assert.assertEquals(2, rectangle.calcLongeur(),0);
  }

  @Test
  public void calcLargeurTest(){
    Point pbl = new Point(2,2);
    Point ptr = new Point(4,4);
    Rectangle rectangle = new Rectangle(pbl,ptr);
    Assert.assertEquals(2, rectangle.calcLargeur(),0);
  }

  @Test
  public void calcPerimeter(){
    Point pbl = new Point(2,2);
    Point ptr = new Point(4,4);
    Rectangle rectangle = new Rectangle(pbl,ptr);
    Assert.assertEquals(8, rectangle.calcPerimeter(),0);
  }

  @Test
  public void calcSurface(){
    Point pbl = new Point(2,2);
    Point ptr = new Point(4,4);
    Rectangle rectangle = new Rectangle(pbl,ptr);
    Assert.assertEquals(4, rectangle.calcSurface(), 0);
  }
}