package fr.uvsq.cprog.collex.exercice2;

/** .
 * */

public class Rectangle implements Figure {

  private Point bottomLeft;
  private Point topRight;

  public Rectangle(Point bottomLeft, Point topRight) {
    this.bottomLeft = bottomLeft;
    this.topRight = topRight;
  }

  public Point getBottomLeft() {
    return bottomLeft;
  }

  public Point getTopRight() {
    return topRight;
  }

  public double calcLongeur() {
    double longeur = this.topRight.getPointX() - this.bottomLeft.getPointX();
    return longeur;
  }

  public double calcLargeur() {
    double largeur = this.topRight.getPointY() - this.bottomLeft.getPointY();
    return largeur;
  }

  /** .
 * */

  public double calcPerimeter() {
    double longeur = calcLongeur();
    double largeur = calcLargeur();
    double perimeter = (longeur * 2) + (largeur * 2);
    return perimeter;
  }

  /** .
 * */

  public double calcSurface() {
    double longeur = calcLongeur();
    double largeur = calcLargeur();
    double surface = longeur * largeur;
    return surface;
  }

  public void move(double dx, double dy) {
    this.bottomLeft.move(dx, dy);
    this.topRight.move(dx, dy);
  }

  /** .
 * */

  public void afficher() {
    System.out.println("\nRectangle");
    System.out.format("Bottom left point at (%.2f, %.2f)\n", this.bottomLeft.getPointX(),
        this.bottomLeft.getPointY());
    System.out.format("Top right point at (%.2f, %.2f)\n", this.topRight.getPointX(),
        this.topRight.getPointY());
    System.out.format("Perimeter = %.2f cm\n", calcPerimeter());
    System.out.format("Area = %.2f cm²\n", calcSurface());
  }
}
