package players;

import interfaces.ICastable;
import spells.Spell;
import enemies.*;

import java.util.ArrayList;

public class Wizard extends Magic implements ICastable {

    private Spell equippedSpell;
    private ArrayList<Spell> spellbook;


    public Wizard(String name, int health) {
        super(name, health);
        this.equippedSpell = equippedSpell;
        this.spellbook = new ArrayList<Spell>();
    }

    public String cast(Enemy enemy){
        enemy.takeDamage(equippedSpell.getDamage());
        return "'!' says our Wizard as he attacks " + enemy.getName() + "and inflicts " + equippedSpell.getDamage() + "!";
    }
}
