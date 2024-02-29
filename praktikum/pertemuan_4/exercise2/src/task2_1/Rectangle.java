package task2_1;

public class Rectangle extends Shape {
  // instance variables
  private double width;
  private double length;

  // constructor
  public Rectangle() {
    super();
    width = 1.0;
    length = 1.0;
  }

  public Rectangle(double w, double l) {
    super();
    width = w;
    length = l;
  }

  public Rectangle(double w, double l, String c, boolean f) {
    super(c, f);
    width = w;
    length = l;
  }

  // getter and setter
  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  // method
  public double getArea() {
    return width * length;
  }

  public double getPerimeter() {
    return 2 * (width + length);
  }

  @Override
  public String toString() {
    return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
  }
}
