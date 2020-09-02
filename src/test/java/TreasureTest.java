import components.Treasure;
import components.TreasureValue;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreasureTest {

    Treasure treasure;

    @Before
    public void before() {
        treasure = new Treasure("Gold", TreasureValue.RARE);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Gold", treasure.getMaterial());
    }

    @Test
    public void canGetValue() {
        assertEquals(TreasureValue.RARE, treasure.getValue());
    }


}
