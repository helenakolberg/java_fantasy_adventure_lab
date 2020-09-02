import components.Companion;
import org.junit.Before;
import org.junit.Test;
import players.magic.Wizard;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Companion companion;

    @Before
    public void before() {
        companion = new Companion("Hoot", "owl", 2);
        wizard = new Wizard(100, 9, companion);
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
}
