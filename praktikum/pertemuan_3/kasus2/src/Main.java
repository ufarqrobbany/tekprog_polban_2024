import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Penjualan menu = new Penjualan(11);

        menu.tambahProduk("Bala-Bala", 1000,20);
        menu.tambahProduk("Gehu", 1000, 20);
        menu.tambahProduk("Tahu", 1000, 0);
        menu.tambahProduk("Molen", 1000, 20);
        menu.tambahProduk("Cakue", 1500, 20);
        menu.tambahProduk("Teh Manis", 2000, 20);
        menu.tambahProduk("Susu", 5000, 80);
        menu.tambahProduk("Kopi", 3000, 70);
        menu.tambahProduk("Ayam Geprek", 12000, 30);
        menu.tambahProduk("Nasi Bakar", 10000, 10);
        menu.tambahProduk("Nasi Goreng", 15000, 20);
       

        Scanner scanner = new Scanner(System.in);
        String namaMenu;
        int jml;
        char konfirmasi;
        
        do {
            menu.tampilSemuaProduk();
            System.out.println("\nMasukkan nama menu yang akan dipesan: ");
            namaMenu = scanner.nextLine();

            System.out.println("\nBerapa jumlah yang akan dipesan: ");
            jml = scanner.nextInt();
            scanner.nextLine();

            System.out.println("\nAnda memesan:");
            System.out.println(menu.tampilProduk(namaMenu));
            System.out.println("Total harga: Rp. " + menu.totalHarga(namaMenu, jml));

            menu.pesanProduk(namaMenu, jml);

            System.out.println("Apakah anda ingin memesan lagi? (Y/N)");
            konfirmasi = scanner.next().charAt(0);
        } while( konfirmasi == 'Y');
        
        scanner.close();
    }
}