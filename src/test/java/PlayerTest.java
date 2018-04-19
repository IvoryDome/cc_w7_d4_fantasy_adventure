import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

public class PlayerTest {

    Dwarf dwarfPlayer1;
    Weapon weapon1;
    Monster monster1;

    @Before
    public void before(){
        monster1 = new Monster("Bog Monster", 10, 100);
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
        dwarfPlayer1.attack(monster1);
        assertEquals(50, monster1.getHealth());
        assertEquals("'Damn you foul beast!' says our Dwarf as he attacks Bog Monster and inflicts 50 damage!", dwarfPlayer1.attack(monster1));
    }





}
