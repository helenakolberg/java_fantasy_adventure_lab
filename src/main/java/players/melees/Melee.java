package players.melees;

import components.Weapon;
import players.Player;

import java.util.ArrayList;

public abstract class Melee extends Player {

    private Weapon equippedWeapon;
    private ArrayList<Weapon> weapons;
    private int strength;

    public Melee(int health, int strength, Weapon equippedWeapon) {
        super(health);
        this.strength = strength;
        this.equippedWeapon = equippedWeapon;
        this.weapons = new ArrayList<Weapon>();
    }

    public Weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public int getWeaponCount() {
        return this.weapons.size();
    }

    public int getStrength() {
        return strength;
    }
}
