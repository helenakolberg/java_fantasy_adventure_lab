import components.HealingTool;
import components.Treasure;
import components.TreasureValue;
import org.junit.Before;
import org.junit.Test;
import players.healers.Cleric;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    HealingTool tool;
    Treasure treasure;

    @Before
    public void before() {
        tool = new HealingTool("Health potion", 10);
        cleric = new Cleric(80, tool);
        treasure = new Treasure("Ruby", TreasureValue.RARE);
    }

    @Test
    public void canGetHealth() {
        assertEquals(80, cleric.getHealth());
    }

    @Test
    public void canGetEquippedTool() {
        assertEquals(tool, cleric.getEquippedTool());
    }

    @Test
    public void canGetToolCount() {
        assertEquals(0, cleric.getToolCount());
    }

    @Test
    public void canGetTreasureCount() {
        assertEquals(0, cleric.getTreasureCount());
    }

    @Test
    public void canAddTreasure() {
        cleric.addTreasure(treasure);
        assertEquals(1, cleric.getTreasureCount());
    }

    @Test
    public void canRemoveTreasure() {
        cleric.addTreasure(treasure);
        cleric.removeTreasure(treasure);
        assertEquals(0, cleric.getTreasureCount());
    }

    @Test
    public void canAddHealth() {
        cleric.addHealth(10);
        assertEquals(90, cleric.getHealth());
    }

    @Test
    public void canRemoveHealth() {
        cleric.removeHealth(10);
        assertEquals(70, cleric.getHealth());
    }
}
