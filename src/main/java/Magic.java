import java.util.ArrayList;

public abstract class Magic extends Player{

    private Spell equippedSpell;
    private ArrayList<Spell> spellbook;

    public Melee(String name, int health) {
        super(name, health);
        this.spellbook = new ArrayList<Spell>();
    }

    public Spell getEquippedSpell() {
        return equippedSpell;
    }

    public ArrayList<Weapon> getArmoury() {
        return spellbook;
    }

    public void setEquippedWeapon(Weapon equippedWeapon) {
        this.equippedSpell = equippedSpell;
    }

    public void setArmoury(ArrayList<Weapon> armoury) {
        this.spellbook = armoury;
    }

    public void pickUpWeapon(Weapon weapon){
        this.armoury.add(weapon);
    }




}

