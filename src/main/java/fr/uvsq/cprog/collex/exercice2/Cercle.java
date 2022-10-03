package fr.uvsq.cprog.collex.exercice2;

/** .
 * */

public class Cercle implements Figure {

  private Point center;
  private double radius;

  public Cercle(Point center, double radius) {
    this.center = center;
    this.radius = radius;
  }

  public Point getCenter() {
    return center;
  }

  public double getRadius() {
    return radius;
  }

  public double calcDiameter() {
    double diameter = this.radius * 2;
    return diameter;
  }

  public double calcPerimeter() {
    double perimeter = Math.PI * 2 * this.radius;
    return perimeter;
  }

  public double calcSurface() {
    double surface = Math.PI * Math.pow(this.radius, 2);
    return surface;
  }

  public void move(double dx, double dy) {
    this.center.move(dx, dy);
  }

  /** .
 * */
  public void afficher() {
    System.out.println("\nCircle");
    System.out.format("Center point at (%.2f, %.2f)\n", this.center.getPointX(),
        this.center.getPointY());
    System.out.format("Diameter = %.2f cm\n", calcDiameter());
    System.out.format("Perimeter = %.2f cm\n", calcPerimeter());
    System.out.format("Area = %.2f cm²\n", calcSurface());
  }
}
