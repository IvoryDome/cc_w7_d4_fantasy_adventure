package weapons;

public class HealingImplement {

    private HealingImplementType type;
    private String name;
    private int healingCapacity;

    public HealingImplement(HealingImplementType type, String name, int healingCapacity) {
        this.type = type;
        this.name = name;
        this.healingCapacity = healingCapacity;
    }

    public HealingImplementType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getHealingCapacity() {
        return healingCapacity;
    }
}

