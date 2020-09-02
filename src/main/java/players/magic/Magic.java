package players.magic;

import components.Companion;
import components.Spell;
import players.Player;

import java.util.ArrayList;

public abstract class Magic extends Player {

    private int intellect;
    private Companion companion;
    private ArrayList<Spell> spells;

    public Magic(int health, int intellect, Companion companion) {
        super(health);
        this.intellect = intellect;
        this.companion = companion;
        this.spells = new ArrayList<Spell>();
    }

    public int getIntellect() {
        return intellect;
    }

    public Companion getCompanion() {
        return companion;
    }

    public int getSpellCount() {
        return this.spells.size();
    }

    public void addSpell(Spell spell) {
        this.spells.add(spell);
    }

    public Spell removeSpell(Spell spell) {
        int index = this.spells.indexOf(spell);
        return this.spells.remove(index);
    }
}
