public class Character {
    private int id;
    private String name;
    private int damage;
    private int health;
    private int currency;

    // Character properties and behaviors

    public Character(int id, String name, int damage, int health, int currency) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.currency = currency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public int getCurrency() {
        return currency;
    }
}