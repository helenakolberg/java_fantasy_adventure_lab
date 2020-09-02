package components;

public class Treasure {

    private String material;
    private TreasureValue value;

    public Treasure(String material, TreasureValue value) {
        this.material = material;
        this.value = value;
    }

    public String getMaterial() {
        return material;
    }

    public TreasureValue getValue() {
        return value;
    }
}
