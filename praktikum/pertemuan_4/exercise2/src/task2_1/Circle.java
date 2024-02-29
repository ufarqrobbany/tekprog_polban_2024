package task2_1;

public class Circle extends Shape {
  // instance variables
  private double radius;

  // constructor
  public Circle() {
    super();
    radius = 1.0;
  }

  public Circle(double r) {
    super();
    radius = r;
  }

  public Circle(double r, String c, boolean f) {
    super(c, f);
    radius = r;
  }

  // getter and setter
  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

}
