package task2_1;

public class Square extends Rectangle {

  // ocnstructor
  public Square(double side) {
    super(side, side); // Call superclass Rectangle(double, double)
  }

  // method
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

  @Override
  public String toString() {
    return "A Square with side=" + super.getWidth() + ", which is a subclass of " + super.toString();
  }
}
