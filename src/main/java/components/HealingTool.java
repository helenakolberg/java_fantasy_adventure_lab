package components;

public class HealingTool {

    private String name;
    private int healingPoints;

    public HealingTool(String name, int healingPoints) {
        this.name = name;
        this.healingPoints = healingPoints;
    }

    public String getName() {
        return name;
    }

    public int getHealingPoints() {
        return healingPoints;
    }
}
