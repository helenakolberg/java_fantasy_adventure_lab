package rooms;

import players.Player;

import java.util.ArrayList;

public abstract class Room {

    private String name;
    private ArrayList<Player> players;

    public Room(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
    }

    public String getName() {
        return name;
    }

    public int getPlayerCount() {
        return this.players.size();
    }
}
