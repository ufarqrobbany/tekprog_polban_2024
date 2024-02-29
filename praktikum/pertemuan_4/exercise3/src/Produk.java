class Produk {
  // atribut
  private String nama_produk;
  private double harga;
  private int qty;

  // constructor
  public Produk(String nama, double harga, int qty) {
    this.nama_produk = nama;
    this.harga = harga;
    this.qty = qty;
  }

  // getter dan setter
  public String getNamaProduk() {
    return nama_produk;
  }

  public double getHarga() {
    return harga;
  }

  public int getQty() {
    return qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  // methods
  public boolean isOutofStock() {
    if(getQty() == 0) {
        return true;
    } else {
        return false;
    }
  } 

  public void penguranganStok(int kuantitas) {
    if(!isOutofStock() && (getQty() - kuantitas >= 0)) {
      setQty(getQty() - kuantitas);
      System.out.println("Berhasil memesan");
    } else {
      System.out.println("Pemesanan gagal");
    }
  }
}

