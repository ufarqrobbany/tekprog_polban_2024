class Penjualan {
    private Produk[] menus;
    private static byte id=0;

    public Penjualan(int maxMenu) {
        menus = new Produk[maxMenu];
    }

    public void tambahProduk(String nama, double harga, int stok) {
        menus[id] = new Produk(nama, harga, stok);
        id++;
    }

    public void tampilSemuaProduk() {
        for(int i=0; i<id; i++) {
            if(!menus[i].isOutofStock()) {
                System.out.println(menus[i].getNamaProduk() + "[" + menus[i].getQty() + "]" + "\tRp. " + menus[i].getHarga());
            }
        }
    }

    public String tampilProduk(String nama) {
        for(int i = 0; i < id; i++) {
            if(menus[i].getNamaProduk().equals(nama)) {
                return menus[i].getNamaProduk();
            }
        }
        return "Nama makanan tidak ditemukan";
    }

    public void pesanProduk(String nama, int kuantitas) {
        boolean valid = false;
        for(int i = 0; i < id; i++) {
            if(menus[i].getNamaProduk().equals(nama)) {
                menus[i].penguranganStok(kuantitas);
                valid = true;
            }
        }
        if(valid == false) {
            System.out.println("Nama makanan tidak ditemukan");
        }
    }

    public double totalHarga(String nama, int kuantitas) {
        for(int i = 0; i < id; i++) {
            if(menus[i].getNamaProduk().equals(nama)) {
                return menus[i].getHarga() * kuantitas;
            }
        }
        return 0;
    }
}