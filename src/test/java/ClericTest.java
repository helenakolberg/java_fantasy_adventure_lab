import components.HealingTool;
import org.junit.Before;
import org.junit.Test;
import players.healers.Cleric;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    HealingTool tool;

    @Before
    public void before() {
        tool = new HealingTool("Health potion", 10);
        cleric = new Cleric(80, tool);
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
}
