import components.Treasure;
import components.TreasureValue;
import components.Weapon;
import org.junit.Before;
import org.junit.Test;
import players.melees.Dwarf;

import static org.junit.Assert.assertEquals;

public class DwarfTest {
    Dwarf dwarf;
    Weapon weapon;
    Treasure treasure;

    @Before
    public void before() {
        weapon = new Weapon("Axe", 5);
        dwarf = new Dwarf(100, 7, weapon);
        treasure = new Treasure("Ruby", TreasureValue.RARE);
    }

    @Test
    public void canGetHealth() {
        assertEquals(100, dwarf.getHealth());
    }

    @Test
    public void canGetStrength() {
        assertEquals(7, dwarf.getStrength());
    }

    @Test
    public void canGetEquippedWeapon() {
        assertEquals(weapon, dwarf.getEquippedWeapon());
    }

    @Test
    public void canGetWeaponCount() {
        assertEquals(0, dwarf.getWeaponCount());
    }

    @Test
    public void canGetTreasureCount() {
        assertEquals(0, dwarf.getTreasureCount());
    }

    @Test
    public void canAddTreasure() {
        dwarf.addTreasure(treasure);
        assertEquals(1, dwarf.getTreasureCount());
    }

    @Test
    public void canRemoveTreasure() {
        dwarf.addTreasure(treasure);
        dwarf.removeTreasure(treasure);
        assertEquals(0, dwarf.getTreasureCount());
    }

    @Test
    public void canAddHealth() {
        dwarf.addHealth(10);
        assertEquals(110, dwarf.getHealth());
    }

    @Test
    public void canRemoveHealth() {
        dwarf.removeHealth(10);
        assertEquals(90, dwarf.getHealth());
    }
}
