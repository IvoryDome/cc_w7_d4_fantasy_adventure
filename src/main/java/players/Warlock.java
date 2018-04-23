package players;

import enemies.Enemy;
import interfaces.ICastable;
import interfaces.IFightable;
import spells.Spell;

import java.util.ArrayList;

public class Warlock extends Magic implements ICastable {

    private Spell equippedSpell;
    private ArrayList<Spell> spellbook;


    public Warlock(String name, int health) {
        super(name, health);
        this.equippedSpell = equippedSpell;
        this.spellbook = new ArrayList<Spell>();
    }

    public String cast(Enemy enemy){
        enemy.takeDamage(equippedSpell.getDamage());
        return "'!' says our Warlock as he casts a spell on  " + enemy.getName() + "and inflicts " + equippedSpell.getDamage() + "!";
    }
}
