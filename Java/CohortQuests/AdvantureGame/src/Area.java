import java.util.List;

public class Area {
    private String areaName;
    private List<Monster> monsters;
    private String reward;
    private boolean areaCleared;

    public Area(String areaName, List<Monster> monsters, String reward) {
        this.areaName = areaName;
        this.monsters = monsters;
        this.reward = reward;
        this.areaCleared = false;
    }

    public String getAreaName() {
        return areaName;
    }

    public List<Monster> getMonster() {
        return monsters;
    }

    public String getReward() {
        return reward;
    }

    public boolean isAreaCleared() {
        return areaCleared;
    }


}