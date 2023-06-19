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
        int startingHealth = 100;
        health = startingHealth;
    }
}