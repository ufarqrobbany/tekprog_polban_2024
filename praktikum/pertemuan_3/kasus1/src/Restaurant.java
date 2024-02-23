public class Restaurant {
    
    // buat menjadi class menu dan gunakan access modifier private
    // public String[] nama_makanan;
    // public double[] harga_makanan;
    // public int[] stok;
    // public static byte id=0;
    private Menu[] menus;
    private static byte id=0;

    // tambahkan paramater maxMenu dan buat objek Menu
    // public Restaurant() {
    //     nama_makanan = new String[10];
    //     harga_makanan = new double[10];
    //     stok = new int[10];
    // }
    public Restaurant(int maxMenu) {
        menus = new Menu[maxMenu];
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        // this.nama_makanan[id] = nama;
        // this.harga_makanan[id] = harga;
        // this.stok[id] = stok;
        menus[id] = new Menu(nama, harga, stok);
        // tambahkan pemanggilan method nextId();
        nextId();
    }

    public void tampilMenuMakanan() {
        for(int i=0; i<=id; i++) {
            if(!menus[i].isOutofStock()) {
                System.out.println(menus[i].getNamaMakanan() + "[" + menus[i].getStok() + "]" + "\tRp. " + menus[i].getHargaMakanan());
            }
        }
    }

    // pindahkan ke class Menu
    // public boolean isOutofStock(int id) {
    //     if(stok[id] == 0) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }

    // public static void nextId() {
    // ubah access modifier menjadi private karena method ini hanya dipanggil di class ini (method tambahMakanan)
    private static void nextId() {
        id++;
    }
}