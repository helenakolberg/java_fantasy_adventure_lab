import components.Treasure;
import components.TreasureValue;
import components.Weapon;
import org.junit.Before;
import org.junit.Test;
import players.melees.Barbarian;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {
    Barbarian barbarian;
    Weapon weapon;
    Weapon weapon2;
    Treasure treasure;

    @Before
    public void before() {
        weapon = new Weapon("Club", 5);
        weapon2 = new Weapon("Mace", 4);
        barbarian = new Barbarian(100, 7, weapon);
        treasure = new Treasure("Ruby", TreasureValue.RARE);
    }

    @Test
    public void canGetHealth() {
        assertEquals(100, barbarian.getHealth());
    }

    @Test
    public void canGetStrength() {
        assertEquals(7, barbarian.getStrength());
    }

    @Test
    public void canGetEquippedWeapon() {
        assertEquals(weapon, barbarian.getEquippedWeapon());
    }

    @Test
    public void canGetWeaponCount() {
        assertEquals(0, barbarian.getWeaponCount());
    }

    @Test
    public void canGetTreasureCount() {
        assertEquals(0, barbarian.getTreasureCount());
    }

    @Test
    public void canAddTreasure() {
        barbarian.addTreasure(treasure);
        assertEquals(1, barbarian.getTreasureCount());
    }

    @Test
    public void canRemoveTreasure() {
        barbarian.addTreasure(treasure);
        barbarian.removeTreasure(treasure);
        assertEquals(0, barbarian.getTreasureCount());
    }

    @Test
    public void canAddHealth() {
        barbarian.addHealth(10);
        assertEquals(110, barbarian.getHealth());
    }

    @Test
    public void canRemoveHealth() {
        barbarian.removeHealth(10);
        assertEquals(90, barbarian.getHealth());
    }

    @Test
    public void canAddWeapon() {
        barbarian.addWeapon(weapon2);
        assertEquals(1, barbarian.getWeaponCount());
    }

    @Test
    public void canRemoveWeapon() {
        barbarian.addWeapon(weapon2);
        barbarian.removeWeapon(weapon2);
        assertEquals(0, barbarian.getWeaponCount());
    }

    @Test
    public void canChangeEquippedWeapon() {
        barbarian.addWeapon(weapon2);
        barbarian.changeEquippedWeapon(weapon2);
        assertEquals(weapon2, barbarian.getEquippedWeapon());
        assertEquals(1, barbarian.getWeaponCount());
    }

    @Test
    public void canRage() {
        barbarian.removeHealth(90);
        barbarian.rage();
        assertEquals(27, barbarian.getStrength());
    }
}
