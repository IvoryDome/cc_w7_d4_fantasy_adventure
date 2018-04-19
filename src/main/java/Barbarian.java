import java.util.ArrayList;

public class Barbarian extends Melee implements IFightable{

    private Weapon equippedWeapon;
    private ArrayList<Weapon> armoury;


    public Barbarian(String name, int health) {
        super(name, health);
        this.equippedWeapon = equippedWeapon;
        this.armoury = new ArrayList<Weapon>();
    }

    public String attack(Monster monster){
        int monsterHealth;
        monsterHealth = monster.getHealth();
        monster.setHealth(monsterHealth -= equippedWeapon.getDamage());
        return "'Damn you foul beast!' says our Barbarian as he attacks " + monster.getName() + "and inflicts " + equippedWeapon.getDamage() + "!";
    }
}
