//package players;
//
//import interfaces.IFightable;
//import interfaces.IHealable;
//import weapons.HealingImplement;
//import weapons.Weapon;
//
//import java.util.ArrayList;
//
//
//public class Cleric extends Melee implements IHealable {
//
//    private Weapon equippedHealingImplement;
//    private ArrayList<Weapon> medkit;
//
//    public Healer(String name, int health) {
//        super(name, health);
//        this.equippedHealingImplement = equippedHealingImplement;
//        this.medkit = new ArrayList<HealingImplement>();
//    }
//
//    public String heal(Player player){
//        enemy.takeDamage(equippedHealingImplement.getDamage());
//        return "'Damn you foul beast!' says our players.Dwarf as he attacks " + enemy.getName() + "and inflicts " + equippedWeapon.getDamage() + "!";
//    }
//}
