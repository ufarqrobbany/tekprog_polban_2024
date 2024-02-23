public class Menu {
  // atribut
  private String nama_makanan;
  private double harga_makanan;
  private int stok;

  // constructor
  public Menu(String nama, double harga, int stok) {
    this.nama_makanan = nama;
    this.harga_makanan = harga;
    this.stok = stok;
  }

  // getter dan setter
  public String getNamaMakanan() {
    return nama_makanan;
  }

  public double getHargaMakanan() {
    return harga_makanan;
  }

  public int getStok() {
    return stok;
  }

  // method
  public boolean isOutofStock() {
    if(getStok() == 0) {
        return true;
    } else {
        return false;
    }
  } 
}
