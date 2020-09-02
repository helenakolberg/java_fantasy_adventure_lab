import components.Treasure;
import components.TreasureValue;
import components.Weapon;
import org.junit.Before;
import org.junit.Test;
import players.Player;
import players.melees.Dwarf;
import rooms.EnemyRoom;
import rooms.TreasureRoom;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class EnemyRoomTest {

    EnemyRoom enemyRoom;
    Player enemy;
    ArrayList<Player> enemies;
    Weapon weapon;


    @Before
    public void before() {
        weapon = new Weapon("Axe", 5);
        enemy = new Dwarf(80, 10, weapon);
        enemies = new ArrayList<Player>();
        enemies.add(enemy);
        enemyRoom = new EnemyRoom("Creepy Dungeon", enemies);
    }

    @Test
    public void getName() {
        assertEquals("Creepy Dungeon", enemyRoom.getName());
    }

    @Test
    public void canGetEnemies() {
        assertEquals(enemies, enemyRoom.getEnemies());
    }

    @Test
    public void getPlayerCount() {
        assertEquals(0, enemyRoom.getPlayerCount());
    }
}
