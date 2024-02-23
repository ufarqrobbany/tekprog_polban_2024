public class RestaurantMain {
    public static void main(String[] args) {
        // karena pada constructor ditambahkan parameter maxMenu, maka tambahkan
        // argumen jumlah menu pada objek restoran yang dibuat
        // Restaurant menu = new Restaurant();
        Restaurant menu = new Restaurant(10);

        menu.tambahMenuMakanan("Bala-Bala", 1000,20);
        // pemanggilan method nextId dipindahkan ke method tambahMenuMakanan di class Restaurant
        // Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1000, 20);
        // Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1000, 0);
        // Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1000, 20);
       
        menu.tampilMenuMakanan();
    }
}

