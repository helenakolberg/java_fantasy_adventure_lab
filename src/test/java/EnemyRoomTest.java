import components.Weapon;
import org.junit.Before;
import org.junit.Test;
import players.Player;
import players.melees.Dwarf;
import players.melees.Knight;
import rooms.EnemyRoom;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class EnemyRoomTest {

    EnemyRoom enemyRoom;
    Player enemy;
    ArrayList<Player> enemies;
    Weapon weapon;
    Player player;


    @Before
    public void before() {
        weapon = new Weapon("Axe", 5);
        enemy = new Dwarf(80, 10, weapon);
        enemies = new ArrayList<Player>();
        enemies.add(enemy);
        enemyRoom = new EnemyRoom("Creepy Dungeon", enemies);
        player = new Knight(50, 10, weapon);
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

    @Test
    public void canAddPlayer() {
        enemyRoom.addPlayer(player);
        assertEquals(1, enemyRoom.getPlayerCount());
    }

    @Test
    public void canRemovePlayer() {
        enemyRoom.addPlayer(player);
        enemyRoom.removePlayer(player);
        assertEquals(0, enemyRoom.getPlayerCount());
    }
}
