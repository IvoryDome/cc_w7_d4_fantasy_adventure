import java.util.ArrayList;

public class Healer {

    import java.util.ArrayList;

    public abstract class Healer extends Player{

        private HealingImplement equippedspell;
        private ArrayList<Spell> spellbook;

        public Melee(String name, int health) {
            super(name, health);
            this.spellbook = new ArrayList<Spell>();
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


}
