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

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public Player removePlayer(Player player) {
        int index = this.players.indexOf(player);
        return this.players.remove((index));
    }
}
