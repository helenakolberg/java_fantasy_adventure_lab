package players.melees;

import components.Weapon;

public class Barbarian extends Melee {

    public Barbarian(int health, int strength, Weapon equippedWeapon) {
        super(health, strength, equippedWeapon);
    }

    public void rage() {
        if (this.getHealth() <= 10) {
            addStrength(20);
        }
    }
}
