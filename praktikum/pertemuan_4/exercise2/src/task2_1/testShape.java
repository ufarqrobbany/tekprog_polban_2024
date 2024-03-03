package task2_1;

public class testShape {
  public static void main(String[] args) {
    // buat objek
    Shape s1 = new Shape();
    Shape s2 = new Shape("red", false);
    Shape s3 = new Shape();

    // ubah nilai atribut pada objek s3
    s3.setColor("brown");
    s3.setFilled(false);

    // tampilkan informasi objek
    System.out.println("Shape : Color = " + s1.getColor() + ", Filled: " + s1.isFilled());
    System.out.println(s2.toString());
    System.out.println(s3.toString());
  }
}
