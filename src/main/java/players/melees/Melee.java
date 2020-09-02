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

    public void addWeapon(Weapon weapon) {
        this.weapons.add(weapon);
    }

    public Weapon removeWeapon(Weapon weapon) {
        int index = this.weapons.indexOf(weapon);
        return this.weapons.remove(index);
    }

    public void changeEquippedWeapon(Weapon weapon) {
        addWeapon(this.equippedWeapon);
        Weapon newWeapon = removeWeapon(weapon);
        this.equippedWeapon = newWeapon;
    }

    public void addStrength(int amount) {
        this.strength += amount;
    }
}
