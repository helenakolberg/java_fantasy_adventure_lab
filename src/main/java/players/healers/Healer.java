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
}
