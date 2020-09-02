import components.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Weapon weapon;

    @Before
    public void before() {
        weapon = new Weapon("Axe", 4);
    }

    @Test
    public void canGetType() {
        assertEquals("Axe", weapon.getType());
    }

    @Test
    public void canGetDamage() {
        assertEquals(4, weapon.getDamage());
    }
}
