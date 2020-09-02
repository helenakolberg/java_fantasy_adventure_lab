import components.Treasure;
import components.TreasureValue;
import components.Weapon;
import org.junit.Before;
import org.junit.Test;
import players.Player;
import players.melees.Knight;
import rooms.TreasureRoom;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TreasureRoomTest {

    TreasureRoom treasureRoom;
    Treasure treasure;
    ArrayList<Treasure> treasures;
    Player player;
    Weapon weapon;

    @Before
    public void before() {
        treasure = new Treasure("Gold", TreasureValue.RARE);
        treasures = new ArrayList<Treasure>();
        treasures.add(treasure);
        treasureRoom = new TreasureRoom("Chamber of Gold", treasures);
        weapon = new Weapon("Axe", 5);
        player = new Knight(50, 10, weapon);
    }

    @Test
    public void canGetName() {
        assertEquals("Chamber of Gold", treasureRoom.getName());
    }

    @Test
    public void canGetTreasures() {
        assertEquals(treasures, treasureRoom.getTreasures());
    }

    @Test
    public void canGetPlayerCount() {
        assertEquals(0, treasureRoom.getPlayerCount());
    }

    @Test
    public void canAddPlayer() {
        treasureRoom.addPlayer(player);
        assertEquals(1, treasureRoom.getPlayerCount());
    }

    @Test
    public void canRemovePlayer() {
        treasureRoom.addPlayer(player);
        treasureRoom.removePlayer(player);
        assertEquals(0, treasureRoom.getPlayerCount());
    }
}
