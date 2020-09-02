package components;

public class Weapon {

    private String type;
    private int damage;

    public Weapon(String type, int damage) {
        this.type = type;
        this.damage = damage;
    }

    public String getType() {
        return type;
    }

    public int getDamage() {
        return damage;
    }
}
