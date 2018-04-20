import java.util.ArrayList;

public class Knight extends Melee implements IFightable{

    private Weapon equippedWeapon;
    private ArrayList<Weapon> armoury;


    public Knight(String name, int health) {
        super(name, health);
        this.equippedWeapon = equippedWeapon;
        this.armoury = new ArrayList<Weapon>();
    }

    public String attack(Monster monster){
        monster.takeDamage(equippedWeapon.getDamage());
        return "'For the King!' says our Knight as he attacks " + monster.getName() + "and inflicts " + equippedWeapon.getDamage() + "!";
    }
}
