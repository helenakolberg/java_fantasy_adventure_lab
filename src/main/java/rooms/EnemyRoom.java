package rooms;

import players.Player;

import java.util.ArrayList;

public class EnemyRoom extends Room {

    private ArrayList<Player> enemies;

    public EnemyRoom(String name, ArrayList<Player> enemies) {
        super(name);
        this.enemies = enemies;
    }

    public ArrayList<Player> getEnemies() {
        return this.enemies;
    }
}
