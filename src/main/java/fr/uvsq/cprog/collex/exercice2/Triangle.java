package fr.uvsq.cprog.collex.exercice2;

/** .
 * */

public class Triangle implements Figure {

  private Point pointA;
  private Point pointB;
  private Point pointC;

  /** .
 * */

  public Triangle(Point pointa, Point pointb, Point pointC) {
    this.pointA = pointa;
    this.pointB = pointb;
    this.pointC = pointC;
  }

  public Point getPointA() {
    return pointA;
  }

  public Point getPointB() {
    return pointB;
  }

  public Point getPointC() {
    return pointC;
  }

  /** .
 * */

  public double longeurA() {
    double length = Math.sqrt(Math.pow(this.pointB.getPointX() - this.pointC.getPointX(), 2)
        + Math.pow(this.pointB.getPointY() - this.pointC.getPointY(), 2));
    return length;
  }

  /** .
 * */

  public double longeurB() {
    double length = Math.sqrt(Math.pow(this.pointA.getPointX() - this.pointC.getPointX(), 2)
        + Math.pow(this.pointA.getPointY() - this.pointC.getPointY(), 2));
    return length;
  }

  /** .
 * */
  public double longeurC() {
    double length = Math.sqrt(Math.pow(this.pointA.getPointX() - this.pointB.getPointX(), 2)
        + Math.pow(this.pointA.getPointY() - this.pointB.getPointY(), 2));
    return length;
  }

  public double calcPerimeter() {
    double perimeter = longeurA() + longeurB() + longeurC();
    return perimeter;
  }

  /** .
 * */

  public double calcSurface() {
    double semiPerimeter = calcPerimeter() / 2;
    double area = Math.sqrt(semiPerimeter * ((semiPerimeter - longeurA())
        * (semiPerimeter - longeurB()) * (semiPerimeter - longeurC())));
    return area;
  }

  /** .
 * */

  public void move(double dx, double dy) {
    this.pointA.move(dx, dy);
    this.pointB.move(dx, dy);
    this.pointC.move(dx, dy);
  }

  /** .
 * */

  public void afficher() {
    System.out.println("\nTriangle");
    System.out.format("A point at (%.2f, %.2f)\n", this.pointA.getPointX(),
        this.pointA.getPointY());
    System.out.format("B point at (%.2f, %.2f)\n", this.pointB.getPointX(),
        this.pointB.getPointY());
    System.out.format("C point at (%.2f, %.2f)\n", this.pointC.getPointX(),
        this.pointC.getPointY());
    System.out.format("Perimeter = %.2f cm\n", calcPerimeter());
    System.out.format("Area = %.2f cm²\n", calcSurface());
  }
}