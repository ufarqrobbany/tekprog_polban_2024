public class DVDFilm extends DVD {
  // atribut
  private String pemeran;
  private String sutradara;

  // constructor
  public DVDFilm(String judul, String publisher, String kategori, int stok, String pemeran, String sutradara) {
    super(judul, publisher, kategori, stok);
    this.pemeran = pemeran;
    this.sutradara = sutradara;
  }

  // getter
  public String getPemeran() {
    return pemeran;
  }

  public String getSutradara() {
    return sutradara;
  }

  // method
  @Override
  void viewData() {
    System.out.println("\nJudul Film\t: " + super.getJudul());
    System.out.println("Pemeran\t\t: " + this.getPemeran());
    System.out.println("Sutradata\t: " + this.getSutradara());
    System.out.println("Publisher\t: " + super.getPublisher());
    System.out.println("Kategori\t: " + super.getKategori());
    System.out.println("Stok\t\t: " + super.getStok());
  }
}
