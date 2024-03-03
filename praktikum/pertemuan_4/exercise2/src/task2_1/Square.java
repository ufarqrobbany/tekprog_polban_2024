package task2_1;

public class Square extends Rectangle {

  // ocnstructor
  public Square() {
    super();
  }

  public Square(double side) {
    super(side, side); // Call superclass Rectangle(double, double)
  }

  public Square(double side, String color, boolean filled) {
    super(side, side, color, filled);
  }

  // getter and setter
  public double getSide() {
    return super.getWidth();
  }

  public void setSide(double side) {
    super.setLength(side);
    super.setWidth(side);
  }

  @Override
  public void setLength(double side) {
    setWidth(side);
    super.setLength(side);
  }

  @Override
  public void setWidth(double side) {
    setLength(side);
    super.setWidth(side);
  }

  // method
  @Override
  public double getArea() {
    return getSide() * getSide();
  }

  @Override
  public double getPerimeter() {
    return 2 * getSide();
  }

  @Override
  public String toString() {
    return "A Square with side=" + super.getWidth() + ", which is a subclass of " + super.toString();
  }
}
