// superclass abstrak
abstract class Character {
    protected String name;
    protected String type;
    protected int level;

    // constructor
    public Character(String name, String type, int level) {
        this.name = name;
        this.type = type;
        this.level = level;
    }

    // getter dan setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // abstract method
    abstract void displayInfo();
}

// subclass concrete
class Player extends Character {
    // constructor
    public Player(String name, String type, int level) {
        super(name, type, level);
    }

    // method
    @Override
    void displayInfo() {
        // TODO Auto-generated method stub
        System.out.println("Player Information - Name: " + name + ", Type: " + type + ", Level: " + level);
    }

    void levelUp() {
        this.setLevel(this.getLevel() + 1);
        System.out.println(this.getName() + " Naik 1 level");
    }
}

class NPC extends Character {
    // constructor
    public NPC(String name, String type) {
        super(name, type, 0);
    }

    // method
    @Override
    void displayInfo() {
        // TODO Auto-generated method stub
        System.out.println("NPC Information - Name: " + name + ", Type: " + type);
    }
}

class Enemy extends Character {
    // constructor
    public Enemy(String name, String type, int level) {
        super(name, type, level);
    }

    @Override
    void displayInfo() {
        // TODO Auto-generated method stub
        System.out.println("Enemy Information - Name: " + name + ", Type: " + type + ", Level: " + level);
    }    
}

public class Main {
    public static void main(String[] args) {
        Player playerUtama = new Player("Umar", "Human", 99);
        NPC npc = new NPC("baba", "Human");
        Enemy enemy = new Enemy("Goba", "Monster", 8);

        playerUtama.displayInfo();
        npc.displayInfo();
        enemy.displayInfo();

        playerUtama.levelUp();
        playerUtama.displayInfo();
    }
}
