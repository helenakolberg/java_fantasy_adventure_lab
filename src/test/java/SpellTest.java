import components.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellTest {

    Spell spell;

    @Before
    public void before() {
        spell = new Spell("Fireball", 4);
    }

    @Test
    public void canGetName() {
        assertEquals("Fireball", spell.getName());
    }

    @Test
    public void canGetDamage() {
        assertEquals(4, spell.getDamage());
    }
}
