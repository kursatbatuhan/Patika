public class Player {
    private Armor armor;
    private Character character;

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
}
