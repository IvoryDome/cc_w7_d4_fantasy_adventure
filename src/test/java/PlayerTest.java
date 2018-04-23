import org.junit.Before;
import org.junit.Test;
import players.Dwarf;
import weapons.Weapon;
import weapons.WeaponType;
import enemies.*;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

public class PlayerTest {

    Dwarf dwarfPlayer1;
    Weapon weapon1;
    Enemy enemy1;

    @Before
    public void before(){
        enemy1 = new Enemy("Bog players.Monster", 10, 100);
        dwarfPlayer1 = new Dwarf("Grug", 100);
        weapon1 = new Weapon(WeaponType.SWORD, "William Wallace's Claymore", 50);
    }

    @Test
    public void playerHasName(){
        assertEquals("Grug", dwarfPlayer1.getName());
    }

    @Test
    public void playerHasHealth(){
        assertEquals(100, dwarfPlayer1.getHealth());
    }

    @Test
    public void playerHasWeapon(){
        dwarfPlayer1.setEquippedWeapon(weapon1);
        assertEquals(weapon1, dwarfPlayer1.getEquippedWeapon());
    }

    @Test
    public void playerCanAttack(){
        dwarfPlayer1.setEquippedWeapon(weapon1);
        dwarfPlayer1.attack(enemy1);
        assertEquals(50, enemy1.getHealth());
        assertEquals("'Damn you foul beast!' says our Dwarf as he attacks Bog and inflicts 50 damage!", dwarfPlayer1.attack(enemy1));
    }

    @Test
    public void playerCanHeal(){
        dwarfPlayer1.getHealed(50);
        assertEquals(150,150);
    }





}
