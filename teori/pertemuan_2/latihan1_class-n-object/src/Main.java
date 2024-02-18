class Player {
    // attributes
    private String playerName;
    private int playerLevel;
    private int playerHealth;
    private int playerAttack;
    private int playerDefense;

    // constructor Player
    public Player(String playerName, int playerLevel) {
        this.playerName = playerName;
        this.playerLevel = playerLevel;
        initializePlayerStats();
    }

    // getter
    public String getPlayerName() {
        return this.playerName;
    } 

    public int getPlayerLevel() {
        return this.playerLevel;
    }

    public int getPlayerHealth() {
        return this.playerHealth;
    }

    public int getPlayerAttack() {
        return this.playerAttack;
    }

    public int getPlayerDefense() {
        return this.playerDefense;
    }

    // method untuk menginisialisasi stats berdasarkan level
    private void initializePlayerStats() {
        this.playerHealth = 100 + (this.playerLevel * 10);
        this.playerAttack = 10 + (this.playerLevel * 5);
        this.playerDefense = 5 + (this.playerLevel * 2);
    }
    
    // method ketika menerima serangan dari pemain lain
    public void receiveAttack(int damage) {
        // Pengurangan health setelah menerima serangan dengan memperhitungkan defense
        this.playerHealth -= Math.max(0, damage - playerDefense);
        System.out.println(getPlayerName() + " menerima serangan! HP berkurang menjadi " + getPlayerHealth());
    }

    // method untuk menyerang pemain lain
    public void attack(Player target) {
        int damage = this.playerAttack - target.getPlayerDefense();
        damage = Math.max(0, damage); // Pastikan damage tidak negatif
        System.out.println(getPlayerName() + " menyerang " + target.getPlayerName() + " dan memberikan damage sebesar " + damage);
        target.receiveAttack(damage);
    }

    // method untuk menyerang pemain lain menggunakan senjata
    public void attackWithWeapon(Player target, Weapon weapon) {
        int damage = this.playerAttack + weapon.getWeaponDamage() - target.getPlayerDefense();
        damage = Math.max(0, damage); // Pastikan damage tidak negatif
        System.out.println(getPlayerName() + " menyerang " + target.getPlayerName() + " dengan " + weapon.getWeaponName() + " dan memberikan damage sebesar " + damage);
        target.receiveAttack(damage);
    }
}

class Weapon {
    // attributes
    private String weaponName;
    private int weaponLevel;
    private int weaponDamage;

    // constructor weapon
    public Weapon(String weaponName, int weaponLevel) {
        this.weaponName = weaponName;
        this.weaponLevel = weaponLevel;
        initializeWeaponStats();
    }

    // getter
    public String getWeaponName() {
        return this.weaponName;
    }

    public int getWeaponLevel() {
        return this.weaponLevel;
    }

    public int getWeaponDamage() {
        return this.weaponDamage;
    }

    // method inisialisasi stats weapon berdasarkan level
    private void initializeWeaponStats() {
        this.weaponDamage = 10 + (this.weaponLevel * 5);
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek Player 1 dan Player 2
        Player player1 = new Player("Player 1", 60);
        Player player2 = new Player("Player 2", 54);

        // Membuat objek weapon 1 dan Weapon 2
        Weapon weapon1 = new Weapon("Pedang", 50);
        Weapon weapon2 = new Weapon("Kapak", 50);

        System.out.println("Mulai Pertandingan!");

        // tampilkan stat awal player
        System.out.println("========================");
        System.out.print(player1.getPlayerName());
        System.out.print(", Level " + player1.getPlayerLevel());
        System.out.println(", Health " + player1.getPlayerHealth());
        System.out.print(player2.getPlayerName());
        System.out.print(", Level " + player2.getPlayerLevel());
        System.out.println(", Health " + player2.getPlayerHealth());

        // langkah player
        System.out.println("========================");
        player1.attack(player2);
        System.out.println("========================");
        player2.attack(player1);
        System.out.println("========================");
        player1.attackWithWeapon(player2, weapon1);
        System.out.println("========================");
        player2.attackWithWeapon(player1, weapon2);

        // tampilkan stat akhir player
        System.out.println("========================");
        System.out.print(player1.getPlayerName());
        System.out.print(", Level " + player1.getPlayerLevel());
        System.out.println(", Health " + player1.getPlayerHealth());
        System.out.print(player2.getPlayerName());
        System.out.print(", Level " + player2.getPlayerLevel());
        System.out.println(", Health " + player2.getPlayerHealth());
    }
}