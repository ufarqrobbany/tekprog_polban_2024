public class RestaurantMain {
    public static void main(String[] args) {
        /* karena pada constructor ditambahkan parameter maxMenu, maka tambahkan
        argumen maksimal menu pada objek restoran yang dibuat */
        // Restaurant menu = new Restaurant();
        Restaurant menu = new Restaurant(10);

        menu.tambahMenuMakanan("Bala-Bala", 1000,20);
        menu.tambahMenuMakanan("Gehu", 1000, 20);
        menu.tambahMenuMakanan("Tahu", 1000, 0);
        menu.tambahMenuMakanan("Molen", 1000, 20);
       
        menu.tampilMenuMakanan();

        menu.pesanMenuMakanan("Molen", 10);
        
        menu.tampilMenuMakanan();
    }
}


