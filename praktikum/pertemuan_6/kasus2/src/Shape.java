// *********************************************************
//  Shape.java
//  Author: Umar Faruq Robbany
//  Abstract Class Shape
// *********************************************************

public abstract class Shape {
  // An instance variable shapeName of type String
  private String shapeName;

  // Constructor
  public Shape(String name) {
    this.shapeName = name;
  }

  // An abstract method area()
  public abstract double area();

  // A toString method that returns the name of the shape
  public String toString() {
    return shapeName;
  }
}
