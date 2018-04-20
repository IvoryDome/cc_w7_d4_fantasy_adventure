import java.util.ArrayList;

public class Dwarf extends Melee implements IFightable{

    private Weapon equippedWeapon;
    private ArrayList<Weapon> armoury;

    public Dwarf(String name, int health) {
        super(name, health);
        this.equippedWeapon = equippedWeapon;
        this.armoury = new ArrayList<Weapon>();
    }

    public String attack(Monster monster){
        monster.takeDamage(equippedWeapon.getDamage());
        return "'Damn you foul beast!' says our Dwarf as he attacks " + monster.getName() + "and inflicts " + equippedWeapon.getDamage() + "!";
    }
}
