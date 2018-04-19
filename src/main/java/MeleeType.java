public enum MeleeType {

    DWARF("Dwarf"),
    BARBARIAN("Barbarian"),
    KNIGHT("Knight");

    private String type;

    MeleeType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
