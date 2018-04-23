package weapons;

public class Weapon {

    private WeaponType type;
    private String name;
    private int damage;

    public Weapon(WeaponType type, String name, int damage) {
        this.type = type;
        this.name = name;
        this.damage = damage;
    }

    public WeaponType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}
