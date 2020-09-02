import components.Weapon;
import org.junit.Before;
import org.junit.Test;
import players.melees.Knight;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Weapon weapon;

    @Before
    public void before() {
        weapon = new Weapon("Sword", 5);
        knight = new Knight(100, 7, weapon);
    }

    @Test
    public void canGetHealth() {
        assertEquals(100, knight.getHealth());
    }

    @Test
    public void canGetStrength() {
        assertEquals(7, knight.getStrength());
    }

    @Test
    public void canGetEquippedWeapon() {
        assertEquals(weapon, knight.getEquippedWeapon());
    }
}
