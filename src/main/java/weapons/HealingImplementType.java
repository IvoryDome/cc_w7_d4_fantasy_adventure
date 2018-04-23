package weapons;

public enum HealingImplementType {

    HEALING_POTION("Healing Potion"),
    HERB_OF_HEALTH("Herb of Health"),
    MEDKIT("Medkit"),
    SPECIAL_HEALING_ROOT("Special Healing Root"),
    MAGIC_HEALTH_STICK("Magic Health Stick");


    private String type;

    HealingImplementType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }


}







