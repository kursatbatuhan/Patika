import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Game {
    private List<Area> areas;
    private Area activeArea;
    private Player player;

    public Game() {
        areas = new ArrayList<>();
        createAreas();
    }

    public void start() {
        // Game start operations
    }

    public void checkWinCondition() {
        // Check if the game is won
    }

    private void createAreas() {
        // Güvenli Ev
        Area safeHouse = new Area("Güvenli Ev", "Can Yenileniyor");
        areas.add(safeHouse);

        // Mağara
        Area cave = new Area("Mağara", "Savaş + Ganimet");
        cave.setMonster(new Monster("Zombi", 1, 3));
        cave.addItem(new Item("Yemek", "Food"));
        areas.add(cave);

        // Orman
        Area forest = new Area("Orman", "Savaş + Ganimet");
        forest.setMonster(new Monster("Vampir", 1, 3));
        forest.addItem(new Item("Odun", "Firewood"));
        areas.add(forest);

        // Nehir
        Area river = new Area("Nehir", "Savaş + Ganimet");
        river.setMonster(new Monster("Ayı", 1, 3));
        river.addItem(new Item("Su", "Water"));
        areas.add(river);

        // Mağaza
        Area shop = new Area("Mağaza", "Destekleyici Eşyalar Satın Almak");
        shop.addWeapon(new Weapon("Tabanca", 1, 2, 25));
        shop.addWeapon(new Weapon("Kılıç", 2, 3, 35));
        shop.addWeapon(new Weapon("Tüfek", 3, 7, 45));
        shop.addArmor(new Armor("Hafif", 1, 1, 15));
        shop.addArmor(new Armor("Orta", 2, 3, 25));
        shop.addArmor(new Armor("Ağır", 3, 5, 40));
        areas.add(shop);
    }
}