import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static Scanner scanner = new Scanner(System.in);
  public static ArrayList<DVDFilm> Films = new ArrayList<DVDFilm>();
  public static ArrayList<DVDMusic> Musics = new ArrayList<DVDMusic>();

  // method untuk entry data DVD
  private static void entryDVD(String type) {
    String judul, publisher, kategori, penyanyi = "", produser = "", pemeran = "", sutradara = "", topHits = "";
    int stok;

    System.out.println("\nMasukkan data DVD " + type);
    System.out.println("=====================================");
    System.out.print("Judul\t\t\t: ");
    judul = scanner.nextLine();

    if (type.equals("Film")) {
      System.out.print("Pemeran\t\t\t: ");
      pemeran = scanner.nextLine();
      System.out.print("Sutradara\t\t: ");
      sutradara = scanner.nextLine();
    } else {
      System.out.print("Penyanyi\t\t: ");
      penyanyi = scanner.nextLine();
      System.out.print("Produser\t\t: ");
      produser = scanner.nextLine();
    }

    System.out.print("Publisher\t\t: ");
    publisher = scanner.nextLine();

    if (type.equals("Musik")) {
      System.out.print("Top Hits\t\t: ");
      topHits = scanner.nextLine();
    }

    do {
      System.out.print("Kategori " + ((type.equals("Film")) ? "(SU/D/R/A)" : "(C/J/P/R/O)") + "\t: ");
      kategori = scanner.nextLine();
    } while (!cekKategori(type, kategori.toUpperCase()));

    System.out.print("Stok\t\t\t: ");
    stok = scanner.nextInt();
    scanner.nextLine();

    if (type.equals("Film")) {
      Films.add(new DVDFilm(judul, publisher, kategori, stok, pemeran, sutradara));
    } else {
      Musics.add(new DVDMusic(judul, publisher, kategori, stok, penyanyi, produser, topHits));
    }

    System.out.println("=====================================");
    System.out.println("Berhasil menambahkan data DVD " + type);
  }

  // method untuk mengecek kategori
  private static boolean cekKategori(String type, String kategori) {
    boolean valid = false;
    // cek tipe DVD
    if (type.equals("Film")) {
      valid = (kategori.equals("SU") || kategori.equals("D") || kategori.equals("R") || kategori.equals("A")) ? true
          : false;
    } else {
      valid = (kategori.equals("C") || kategori.equals("J") || kategori.equals("P") || kategori.equals("R")
          || kategori.equals("O")) ? true : false;
    }
    // jika tidak valid
    if (!valid) {
      System.out.println("Kategori Tidak Valid");
    }
    return valid;
  }

  // method tampilkan data
  private static void viewDVD(String type) {
    // tampilkan DVD Film
    if (type.equals("Film") || type.equals("All")) {
      System.out.println("\nList DVD Film");
      System.out.println("=====================================");
      if (Films.isEmpty()) {
        System.out.println("DVD Film kosong");
      } else {
        for (DVDFilm dvdFilm : Films) {
          dvdFilm.viewData();
        }
      }
    }

    // tampilkan DVD Musik
    if (type.equals("Musik") || type.equals("All")) {
      System.out.println("\nList DVD Musik");
      System.out.println("=====================================");
      if (Musics.isEmpty()) {
        System.out.println("DVD Musik kosong");
      } else {
        for (DVDMusic dvdMusic : Musics) {
          dvdMusic.viewData();
        }
      }
    }
  }

  public static void main(String[] args) {
    int repeat = 1, option;

    do {
      System.out.println("\nDatabase DVD");
      System.out.println("=====================================");
      System.out.println("1. Tampilkan Semua DVD");
      System.out.println("2. Tampilkan DVD Film");
      System.out.println("3. Tampilkan DVD Musik");
      System.out.println("4. Tambah Data DVD Film");
      System.out.println("5. Tambah Data DVD Musik");
      System.out.println("6. Keluar");
      System.out.println("=====================================");
      System.out.print("Pilih Opsi: ");
      option = scanner.nextInt();
      scanner.nextLine();

      switch (option) {
        case 1:
          viewDVD("All");
          break;
        case 2:
          viewDVD("Film");
          break;
        case 3:
          viewDVD("Musik");
          break;
        case 4:
          entryDVD("Film");
          break;
        case 5:
          entryDVD("Musik");
          break;
        case 6:
          repeat = 0;
          break;
        default:
          System.out.println("Opsi tidak tersedia");
          break;
      }
    } while (repeat == 1);
  }
}
