package rooms;

import components.Treasure;

import java.util.ArrayList;

public class TreasureRoom extends Room {

    private ArrayList<Treasure> treasures;

    public TreasureRoom(String name, ArrayList<Treasure> treasures) {
        super(name);
        this.treasures = treasures;
    }

    public ArrayList<Treasure> getTreasures() {
        return this.treasures;
    }
}
