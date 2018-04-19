import java.util.ArrayList;

public class Dwarf extends Melee implements IFightable{



    public Dwarf(String name, int health) {
        super(name, health);
    }

    public String attack(Monster monster){
        int monsterHealth;
        int damagedHealth;
        monsterHealth = monster.getHealth();
        damagedHealth = (monster.getHealth() - this.getEquippedWeapon().getDamage());
        monster.setHealth(damagedHealth);
        return "'Damn you foul beast!' says our Dwarf as he attacks " + monster.getName() + " and inflicts " + this.getEquippedWeapon().getDamage() + " damage!";
    }
}
