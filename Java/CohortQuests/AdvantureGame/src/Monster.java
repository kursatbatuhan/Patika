public class Monster {
    private int id;
    private int damage;
    private int health;
    private int currency;

    public Monster(int id, int damage, int health, int currency) {
        this.id = id;
        this.damage = damage;
        this.health = health;
        this.currency = currency;
    }

    public int getId() {
        return id;
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
