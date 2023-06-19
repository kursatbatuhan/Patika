public class Armor {
    private int id;
    private String name;
    private int defense;
    private int price;

    public Armor(int id, String name, int defense, int price) {
        this.id = id;
        this.name = name;
        this.defense = defense;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDefense() {
        return defense;
    }

    public int getPrice() {
        return price;
    }
}