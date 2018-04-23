package players;

import players.Player;
import weapons.Weapon;

import java.util.ArrayList;

public abstract class Magic extends Player {

    private Spell equippedSpell;
    private ArrayList<Spell> spellbook;

    public Magic(String name, int health) {
        super(name, health);
        this.spellbook = new ArrayList<Spell>();
    }

    public Spell getEquippedSpell() {
        return equippedSpell;
    }

    public ArrayList<Spell> getSpellbook() {
        return spellbook;
    }

    public void setEquippedWeapon(Weapon equippedWeapon) {
        this.equippedSpell = equippedSpell;
    }

    public void setArmoury(ArrayList<Spell> spellbook) {
        this.spellbook = spellbook;
    }

    public void pickUpSpell(Spell spell){
        this.spellbook.add(spell);
    }

    public void selectSpell(int num){
        equippedSpell = spellbook.get(num);
    }




}

