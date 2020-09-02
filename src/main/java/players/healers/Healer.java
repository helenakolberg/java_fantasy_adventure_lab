package players.healers;

import components.HealingTool;
import players.Player;

import java.util.ArrayList;

public abstract class Healer extends Player {

    private HealingTool equippedTool;
    private ArrayList<HealingTool> tools;

    public Healer(int health, HealingTool equippedTool) {
        super(health);
        this.equippedTool = equippedTool;
        this.tools = new ArrayList<HealingTool>();
    }

    public HealingTool getEquippedTool() {
        return equippedTool;
    }

    public int getToolCount() {
        return this.tools.size();
    }

    public void addTool(HealingTool tool) {
        this.tools.add(tool);
    }

    public HealingTool removeTool(HealingTool tool) {
        int index = this.tools.indexOf(tool);
        return this.tools.remove(index);
    }

    public void changeEquippedTool(HealingTool tool) {
        addTool(this.equippedTool);
        HealingTool newTool = removeTool(tool);
        this.equippedTool = newTool;
    }
}
