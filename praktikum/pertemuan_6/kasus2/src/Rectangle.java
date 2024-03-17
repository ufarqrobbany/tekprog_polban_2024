// *********************************************************
//  Rectangle.java
//
//  Author: Umar Faruq Robbany
// *********************************************************

// Rectangle class is descendants of the Shape class
public class Rectangle extends Shape {
  // A rectangle is defined by its length and width
  private double width;
  private double length;

  // --------------------------------
  // Constructor: sets up the rectangle.
  // --------------------------------
  public Rectangle(double w, double l) {
    super("Rectangle");
    width = w;
    length = l;
  }

  // ---------------------------------------
  // Returns the surface area of the rectangle: length times width
  // ---------------------------------------
  public double area() {
    return length * width;
  }

  // --------------------------------
  // Returns the rectangle as a String.
  // --------------------------------
  public String toString() {
    return super.toString() + " of width " + width + " and length " + length;
  }
}
