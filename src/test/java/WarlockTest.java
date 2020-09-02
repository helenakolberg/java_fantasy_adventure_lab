import components.Companion;
import components.Spell;
import components.Treasure;
import components.TreasureValue;
import org.junit.Before;
import org.junit.Test;
import players.magic.Warlock;

import static org.junit.Assert.assertEquals;

public class WarlockTest {
    Warlock warlock;
    Companion companion;
    Treasure treasure;
    Spell spell;

    @Before
    public void before() {
        companion = new Companion("Hoot", "owl", 2);
        warlock = new Warlock(100, 9, companion);
        treasure = new Treasure("Ruby", TreasureValue.RARE);
        spell = new Spell("Levitation", 1);
    }

    @Test
    public void canGetHealth() {
        assertEquals(100, warlock.getHealth());
    }

    @Test
    public void canGetIntellect() {
        assertEquals(9, warlock.getIntellect());
    }

    @Test
    public void canGetCompanion() {
        assertEquals(companion, warlock.getCompanion());
    }

    @Test
    public void canGetTreasureCount() {
        assertEquals(0, warlock.getTreasureCount());
    }

    @Test
    public void canAddTreasure() {
        warlock.addTreasure(treasure);
        assertEquals(1, warlock.getTreasureCount());
    }

    @Test
    public void canRemoveTreasure() {
        warlock.addTreasure(treasure);
        warlock.removeTreasure(treasure);
        assertEquals(0, warlock.getTreasureCount());
    }

    @Test
    public void canAddHealth() {
        warlock.addHealth(10);
        assertEquals(110, warlock.getHealth());
    }

    @Test
    public void canRemoveHealth() {
        warlock.removeHealth(10);
        assertEquals(90, warlock.getHealth());
    }

    @Test
    public void canGetSpellCount() {
        assertEquals(0, warlock.getSpellCount());
    }

    @Test
    public void canAddSpell() {
        warlock.addSpell(spell);
        assertEquals(1, warlock.getSpellCount());
    }

    @Test
    public void canRemoveSpell() {
        warlock.addSpell(spell);
        warlock.removeSpell(spell);
        assertEquals(0, warlock.getSpellCount());
    }
}
