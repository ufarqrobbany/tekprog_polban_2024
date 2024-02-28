public abstract class DVD {
  // atribut
  protected String judul;
  protected String publisher;
  protected String kategori;
  protected int stok;

  // constructor
  public DVD(String judul, String publisher, String kategori, int stok) {
    this.judul = judul;
    this.publisher = publisher;
    this.kategori = kategori;
    this.kategori = kategori;
    this.stok = stok;
  }

  // getter
  public String getJudul() {
    return judul;
  }

  public String getPublisher() {
    return publisher;
  }

  public String getKategori() {
    return kategori;
  }

  public int getStok() {
    return stok;
  }

  // abstract method
  abstract void viewData();
}
