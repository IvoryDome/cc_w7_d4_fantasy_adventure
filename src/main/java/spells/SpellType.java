package spells;

public enum SpellType {


    FIRE("Fire"),
    ICE("Ice"),
    LIGHTNING("Lightning"),
    PLASMA("Plasma");


    private String type;

    SpellType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
