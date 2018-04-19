import java.util.ArrayList;

public abstract class Melee extends Player{

    private Weapon equippedWeapon;
    private ArrayList<Weapon> armoury;

    public Melee(String name, int health) {
        super(name, health);
        this.armoury = new ArrayList<Weapon>();
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

    public void pickUpWeapon(Weapon weapon){
        this.armoury.add(weapon);
    }




}
