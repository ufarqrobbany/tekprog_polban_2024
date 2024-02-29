package task2_1;

public class Shape {
    // private instance variables
    private String color;
    private boolean filled;

    // Constructor
    public Shape() {
        color = "green";
        filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // getter and setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // method
    public String toString() {
        return "A Shape with color of " + color + " and " + ((filled) ? "filled" : "Not filled");
    }
}