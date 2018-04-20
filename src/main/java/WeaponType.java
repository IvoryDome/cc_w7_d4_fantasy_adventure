public enum WeaponType {


    SWORD("Sword"),
    AXE("Axe"),
    CLUB("Club"),
    SPEAR("Spear"),
    BOW("Bow"),
    STAFF("Staff");


    private String type;

    WeaponType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
