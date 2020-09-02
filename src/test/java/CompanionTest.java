import components.Companion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompanionTest {

    Companion companion;

    @Before
    public void before() {
        companion = new Companion("Zeus", "sphinx", 5);
    }

    @Test
    public void canGetName() {
        assertEquals("Zeus", companion.getName());
    }

    @Test
    public void canGetType() {
        assertEquals("sphinx", companion.getType());
    }

    @Test
    public void canGetDamageReduction() {
        assertEquals(5, companion.getDamageReduction());
    }
}
