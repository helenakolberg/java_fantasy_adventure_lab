package components;

public class Companion {

    private String name;
    private String type;
    private int damageReduction;

    public Companion(String name, String type, int damageReduction) {
        this.name = name;
        this.type = type;
        this.damageReduction = damageReduction;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getDamageReduction() {
        return damageReduction;
    }
}
