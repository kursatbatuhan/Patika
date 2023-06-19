import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Area {
    private String areaName;
    private String feature;
    private Monster monster;
    private List<Item> items;
    private List<Weapon> weapons;
    private List<Armor> armors;
    private boolean areaCleared;

    public Area(String areaName, String feature) {
        this.areaName = areaName;
        this.feature = feature;
        items = new ArrayList<>();
        weapons = new ArrayList<>();
        armors = new ArrayList<>();
    }

    public String getAreaName() {
        return areaName;
    }

    public String getFeature() {
        return feature;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public void addWeapon(Weapon weapon) {
        weapons.add(weapon);
    }

    public List<Armor> getArmors() {
        return armors;
    }

    public void addArmor(Armor armor) {
        armors.add(armor);
    }

    public boolean isAreaCleared() {
        return areaCleared;
    }
}
