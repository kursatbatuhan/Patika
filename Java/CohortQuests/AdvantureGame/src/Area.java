public class Area {
    private String areaName;
    private boolean isSafeHouse;

    public Area(String areaName, boolean isSafeHouse) {
        this.areaName = areaName;
        this.isSafeHouse = isSafeHouse;
    }

    public String getAreaName() {
        return areaName;
    }

    public boolean isSafeHouse() {
        return isSafeHouse;
    }

    public void enterArea(Player player) {
        if (isSafeHouse) {
            player.heal();
        }
    }
}