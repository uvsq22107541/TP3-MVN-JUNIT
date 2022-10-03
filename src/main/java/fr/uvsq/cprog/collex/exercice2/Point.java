package fr.uvsq.cprog.collex.exercice2;

/**
  La classe Point.
 */
public class Point implements Figure {
  private double pointX;
  private double pointY;

  /**
   * Constructeur.
   * */
  public Point(double pointx, double pointy) {
    this.pointX = pointx;
    this.pointY = pointy;
  }

  public double getPointX() {
    return pointX;
  }

  public double getPointY() {
    return pointY;
  }

  @Override
  public void move(double dx, double dy) {
    this.pointX += dx;
    this.pointY += dy;
  }

  @Override
  public void afficher() {
    System.out.println("x = " + this.pointX + ", y = " + this.pointY);
  }
}
