import java.util.ArrayList;

public class Melee extends Player{

    private MeleeType type;
    private Weapon equippedWeapon;
    private ArrayList<Weapon> armoury;

    public Melee(String name, int health, MeleeType type, Weapon equippedWeapon) {
        super(name, health);
        this.type = type;
        this.equippedWeapon = equippedWeapon;
        this.armoury = new ArrayList<Weapon>();
    }

    public MeleeType getType() {
        return type;
    }

    public Weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public ArrayList<Weapon> getArmoury() {
        return armoury;
    }

    public void setEquippedWeapon(Weapon equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
    }

    public void setArmoury(ArrayList<Weapon> armoury) {
        this.armoury = armoury;
    }
}
