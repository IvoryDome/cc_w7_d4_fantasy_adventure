public class Spell {

    private SpellType type;
    private String name;
    private int damage;

    public Weapon(SpellType type, String name, int damage) {
        this.type = type;
        this.name = name;
        this.damage = damage;
    }

    public SpellType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}
