public class Player {
    private Armor armor;
    private Character character;
    private int health;

    // Player properties and behaviors

    public void equipArmor(Armor armor) {
        this.armor = armor;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Character getCharacter() {
        return character;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void heal() {
        // Sağlık yenileme işlemleri burada gerçekleştirilir
        // Örneğin, sağlık değerini başlangıç değerine ayarlayabilirsiniz
        // Bu örnekte başlangıç sağlık değeri 100 olarak varsayıldı
        int startingHealth = 100;
        health = startingHealth;
    }
}
