package fr.uvsq.cprog.collex.exercice2;

//import java.util.*;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/** .
 * */

public class InterfaceUtilisateur {
  // Attributes
  private String[] knownCommands;
  private String[] knownFigures;
  private int maxDrawnFigures;
  private int currentlyDrawnFigures;
  private Figure[] drawnFigures;

  // Constructor

  /** .
 * */

  public InterfaceUtilisateur() {
    this.knownCommands = new String[] {"aide", "q", "nv", "afficher", "move", "effacer"};
    this.knownFigures = new String[] {"rectangle", "triangle", "cercle", "q"};
    this.maxDrawnFigures = 10;
    this.currentlyDrawnFigures = 0;
    this.drawnFigures = new Figure[maxDrawnFigures];
  }

  // Methods

  /** .
 * */

  public void printCommands() {
    System.out.println("\nLes commandes disponible:");
    System.out.println("\taide:\tAfficher l'aide");
    System.out.println("\tnv:\tNouvelle figure");
    System.out.println("\tafficher:\tAffiche les informations de figures");
    System.out.println("\tmove:\tDéplacer figure");
    System.out.println("\teffacer:\tEffacer figure");
    System.out.println("\tq:\tQuitter le programme");
  }

  /** .
 * */

  public void printFigures() {
    System.out.println("\nFigures Disponibles:");
    System.out.println("\trectangle");
    System.out.println("\ttriangle");
    System.out.println("\tcercle");
  }

  /** .
 * */

  public void readCommand() {
    System.out.print("\nTapper une commande:\n\t>> ");
    Scanner userInput = new Scanner(System.in);
    String command = userInput.nextLine();
    if (command.equals(this.knownCommands[0])) {
      printCommands();
    } else if (command.equals(this.knownCommands[1])) {
      System.exit(0);
    } else if (command.equals(this.knownCommands[2])) {
      newFigure();
    } else if (command.equals(this.knownCommands[3])) {
      showFigure();
    } else if (command.equals(this.knownCommands[4])) {
      moveFigure();
    } else if (command.equals(this.knownCommands[5])) {
      clearFigure();
    } else {
      System.out.println("Erreur de commande");
    }
  }

  /** .
 * */

  public Point newPoint() {
    double pointx;
    double pointy;
    System.out.print("Les coordonnées X:\n\t>> ");
    Scanner userInput = new Scanner(System.in);
    try {
      pointx = userInput.nextDouble();
    } catch (InputMismatchException e) {
      System.out.println("Error: Type de l'enter");
      pointx = 0;
    }

    userInput = null;
    System.out.print("Les coordonnées Y:\n\t>> ");
    userInput = new Scanner(System.in);
    try {
      pointy = userInput.nextDouble();
    } catch (InputMismatchException e) {
      System.out.println("Error: Type de l'enter");
      pointy = 0;
    }

    return new Point(pointx, pointy);
  }

  /** .
 * */

  public Rectangle newRectangle() {
    System.out.println("Entrer les coordonnées du 1er point:");
    Point bottomLeft = newPoint();
    System.out.println("Entrer les coordonnées du 2eme point:");
    Point topRight = newPoint();
    if (bottomLeft.getPointX() > topRight.getPointX() || bottomLeft.getPointY()
        > topRight.getPointY()) {
      System.out.println("Error: Coordonées impossible");
    }
    return new Rectangle(bottomLeft, topRight);
  }

  /** .
 * */

  public Triangle newTriangle() {
    System.out.println("Entrer les coordonnées du 1er point:");
    Point pointa = newPoint();
    System.out.println("Entrer les coordonnées du 2eme point:");
    Point pointb = newPoint();
    System.out.println("Entrer les coordonnées du 3eme point:");
    Point pointc = newPoint();
    return new Triangle(pointa, pointb, pointc);
  }
  /** .
 * */

  public Cercle newCircle() {
    System.out.println("Entrer les coordonnées du centre de cercle:");
    Point center = newPoint();
    System.out.print("Enter r:\n\t>> ");
    Scanner userInput = new Scanner(System.in);
    double radius;
    try {
      radius = userInput.nextDouble();
    } catch (InputMismatchException e) {
      System.out.println("Erreur");
      radius = 5;
    }
    return new Cercle(center, radius);
  }

  /** .
 * */

  public void newFigure() {
    printFigures();
    System.out.print("\nEntrer le nom de la figure a dessiner:\n\t>> ");
    Scanner userInput = new Scanner(System.in);
    String figure = userInput.nextLine();
    if (currentlyDrawnFigures < maxDrawnFigures) {
      if (figure.equals(knownFigures[0])) {
        drawnFigures[currentlyDrawnFigures] = newRectangle();
        System.out.println("..Complet!");
        currentlyDrawnFigures++;
      } else if (figure.equals(knownFigures[1])) {
        drawnFigures[currentlyDrawnFigures] = newTriangle();
        System.out.println("..Complet!");
        currentlyDrawnFigures++;
      } else if (figure.equals(knownFigures[2])) {
        drawnFigures[currentlyDrawnFigures] = newCircle();
        System.out.println("..Complet!");
        currentlyDrawnFigures++;
      } else if (figure.equals(knownFigures[3])) {
        System.exit(0);
      } else {
        System.out.println("Error: Figure Inconnue");
      }
    } else {
      System.out.println("Erreur: nombre maximale des figures");
    }
  }

  /** .
 * */

  public void showFigure() {
    if (currentlyDrawnFigures > 0) {
      System.out.format("Il y'a %d figures \n", currentlyDrawnFigures);
      List<Integer> figuresToMove = new ArrayList<>();
      int figureNb;

      do {
        System.out.print("Quelle figure afficher? \n\t>> Figure n°");
        Scanner userInput = new Scanner(System.in);
        figureNb = userInput.nextInt();
        if (figureNb != 0) {
          figuresToMove.add(figureNb);
        }
      } while (figureNb != 0);

      for (int i = 0; i < figuresToMove.size(); i++) {
        figureNb = figuresToMove.get(i) - 1;
        if (figureNb <= currentlyDrawnFigures) {
          drawnFigures[figureNb].afficher();
        } else {
          System.out.println("Erreur");
        }
      }
    } else {
      System.out.println("Pas de figure!");
    }
  }

  /** .
 * */

  public void moveFigure() {
    if (currentlyDrawnFigures > 0) {
      System.out.format("Il y'a %d figures\n", currentlyDrawnFigures);
      List<Integer> figuresToMove = new ArrayList<>();
      int figureNb;

      do {
        System.out.print("Quelle figure a déplacer? \n\t>> Figure n°");
        Scanner userInput = new Scanner(System.in);
        figureNb = userInput.nextInt();
        if (figureNb != 0) {
          figuresToMove.add(figureNb);
        }
      } while (figureNb != 0);

      double dx;

      Scanner userInput = new Scanner(System.in);
      System.out.print("dx:?\n\t>> ");
      userInput = new Scanner(System.in);
      dx = userInput.nextDouble();


      userInput = null;
      System.out.print("dy?\n\t>> ");
      userInput = new Scanner(System.in);
      double dy;
      dy = userInput.nextDouble();

      for (int i = 0; i < figuresToMove.size(); i++) {
        figureNb = figuresToMove.get(i) - 1;
        if (figureNb <= currentlyDrawnFigures) {
          drawnFigures[figureNb].move(dx, dy);
          System.out.println("...Complet");
        } else {
          System.out.println("Erreur.");
        }
      }
    } else {
      System.out.println("Pas de figure!");
    }
  }

  /** .
 * */

  public void clearFigure() {
    if (currentlyDrawnFigures > 0) {
      System.out.format("Il y'a %d figures\n", currentlyDrawnFigures);
      System.out.print("Supprimer tout? [Y/n]\n\t>> ");
      Scanner userInput = new Scanner(System.in);
      String answer = userInput.nextLine();

      if (answer.equals("Y")) {
        for (int i = 0; i < currentlyDrawnFigures; i++) {
          drawnFigures[i] = null;
        }
        currentlyDrawnFigures = 0;
      } else if (answer.equals("n")) {
        List<Integer> figuresToMove = new ArrayList<>();
        int figureNb;

        do {
          System.out.print("Quelle figure a supprimer\n\t>> Figure n°");
          userInput = null;
          userInput = new Scanner(System.in);
          figureNb = userInput.nextInt();
          if (figureNb != 0) {
            figuresToMove.add(figureNb);
          }
        } while (figureNb != 0);

        for (int i = 0; i < figuresToMove.size(); i++) {
          figureNb = figuresToMove.get(i) - 1;
          if (figureNb <= currentlyDrawnFigures) {
            drawnFigures[figureNb] = null;
            currentlyDrawnFigures--;
            System.out.println("...corect!");
          } else {
            System.out.println("erreur");
          }
        }
      }
    } else {
      System.out.println("Pas de figure !");
    }
  }
}
