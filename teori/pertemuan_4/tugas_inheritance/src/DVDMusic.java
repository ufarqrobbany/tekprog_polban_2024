
public class DVDMusic extends DVD {
  // atribut
  private String penyanyi;
  private String produser;
  private String topHits;

  // constructor
  public DVDMusic(String judul, String publisher, String kategori, int stok, String penyanyi, String produser,
      String topHits) {
    super(judul, publisher, kategori, stok);
    this.penyanyi = penyanyi;
    this.produser = produser;
    this.topHits = topHits;
  }

  // getter
  public String getPenyanyi() {
    return penyanyi;
  }

  public String getProduser() {
    return produser;
  }

  public String getTopHits() {
    return topHits;
  }

  // method
  @Override
  void viewData() {
    System.out.println("\nJudul Album\t: " + super.getJudul());
    System.out.println("Penyanyi\t: " + this.getPenyanyi());
    System.out.println("Produser\t: " + this.getProduser());
    System.out.println("Publisher\t: " + super.getPublisher());
    System.out.println("Lagu Top Hits\t: " + this.getTopHits());
    System.out.println("Kategori\t: " + super.getKategori());
    System.out.println("Stok\t\t: " + super.getStok());
  }
}