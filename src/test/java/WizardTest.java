import components.Companion;
import components.Treasure;
import components.TreasureValue;
import org.junit.Before;
import org.junit.Test;
import players.magic.Wizard;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Companion companion;
    Treasure treasure;

    @Before
    public void before() {
        companion = new Companion("Hoot", "owl", 2);
        wizard = new Wizard(100, 9, companion);
        treasure = new Treasure("Ruby", TreasureValue.RARE);
    }

    @Test
    public void canGetHealth() {
        assertEquals(100, wizard.getHealth());
    }

    @Test
    public void canGetIntellect() {
        assertEquals(9, wizard.getIntellect());
    }

    @Test
    public void canGetCompanion() {
        assertEquals(companion, wizard.getCompanion());
    }

    @Test
    public void canGetTreasureCount() {
        assertEquals(0, wizard.getTreasureCount());
    }

    @Test
    public void canAddTreasure() {
        wizard.addTreasure(treasure);
        assertEquals(1, wizard.getTreasureCount());
    }

    @Test
    public void canRemoveTreasure() {
        wizard.addTreasure(treasure);
        wizard.removeTreasure(treasure);
        assertEquals(0, wizard.getTreasureCount());
    }

    @Test
    public void canAddHealth() {
        wizard.addHealth(10);
        assertEquals(110, wizard.getHealth());
    }

    @Test
    public void canRemoveHealth() {
        wizard.removeHealth(10);
        assertEquals(90, wizard.getHealth());
    }
}
