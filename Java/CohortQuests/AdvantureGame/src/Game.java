import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private Area activeArea;
    private Player player;
    private Scanner scanner;

    public Game() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Oyuna hoş geldiniz!");

        selectCharacter();
        selectArea();

        // Other game logic
    }

    private void selectCharacter() {
        System.out.println("Lütfen bir karakter seçin:");
        System.out.println("1. Samurai");
        System.out.println("2. Archer");
        System.out.println("3. Knight");

        int characterChoice = scanner.nextInt();

        switch (characterChoice) {
            case 1:
                player.setCharacter(new Character(1, "Samurai", 5, 21, 15));
                break;
            case 2:
                player.setCharacter(new Character(2, "Archer", 7, 18, 20));
                break;
            case 3:
                player.setCharacter(new Character(3, "Knight", 8, 24, 5));
                break;
            default:
                System.out.println("Geçersiz karakter seçimi. Varsayılan olarak Samurai seçildi.");
                player.setCharacter(new Character(1, "Samurai", 5, 21, 15));
                break;
        }

        System.out.println("Seçtiğiniz karakter: " + player.getCharacter().getName());
    }

    private void selectArea() {
        System.out.println("Lütfen bir mekan seçin:");
        System.out.println("1. Güvenli Ev");
        System.out.println("2. Mağara");
        System.out.println("3. Orman");
        System.out.println("4. Nehir");
        System.out.println("5. Mağaza");

        int areaChoice = scanner.nextInt();

        switch (areaChoice) {
            case 1:
                activeArea = new SafeHouse();
                break;
            case 2:
                activeArea = new Cave();
                break;
            case 3:
                activeArea = new Forest();
                break;
            case 4:
                activeArea = new River();
                break;
            case 5:
                activeArea = new Shop();
                break;
            default:
                System.out.println("Geçersiz mekan seçimi. Varsayılan olarak Güvenli Ev seçildi.");
                activeArea = new SafeHouse();
                break;
        }

        System.out.println("Seçtiğiniz mekan: " + activeArea.getAreaName());

        if (activeArea instanceof BattleArea) {
            BattleArea battleArea = (BattleArea) activeArea;
            List<Monster> monsters = battleArea.getMonsters();

            if (!monsters.isEmpty()) {
                System.out.println("Bu mekanda canavarlar var!");

                for (Monster monster : monsters) {
                    int monsterDamage = monster.getDamage();
                    int playerHealth = player.getCharacter().getHealth();

                    if (monsterDamage >= playerHealth) {
                        System.out.println("Canavarlar çok güçlü, karakter öldü! Oyun bitti.");
                        System.exit(0);
                    } else {
                        player.getCharacter().reduceHealth(monsterDamage);
                        System.out.println("Canavar saldırdı! Karakterin sağlığı: " + player.getCharacter().getHealth());
                    }
                }
            }
        } else if (activeArea instanceof SafeHouse) {
            SafeHouse safeHouse = (SafeHouse) activeArea;
            safeHouse.healPlayer(player);
        }
    }

    public void checkWinCondition() {
        // Check if the game is won
    }
}
