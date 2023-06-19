import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Character samurai = new Character(1, "Samurai", 5, 21, 15);
        Character archer = new Character(2, "Archer", 7, 18, 20);
        Character knight = new Character(3, "Knight", 8, 24, 5);

        Weapon pistol = new Weapon(1, "Pistol", 2, 25);
        Weapon sword = new Weapon(2, "Sword", 3, 35);
        Weapon rifle = new Weapon(3, "Rifle", 7, 45);
        
        Player player = new Player();
        player.setCharacter(samurai);

        HashMap<Integer, Monster> monsters = new HashMap<>();
        monsters.put(1, new Monster(1, 3, 10, 4)); // Zombi
        monsters.put(2, new Monster(2, 4, 14, 7)); // Vampir
        monsters.put(3, new Monster(3, 7, 20, 12)); // Ayı

    }
}