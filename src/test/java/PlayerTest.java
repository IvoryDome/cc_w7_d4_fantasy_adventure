import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

public class PlayerTest {

    Melee meleePlayer1;
    Weapon weapon1;

    @Before
    public void before(){
        meleePlayer1 = new Melee("Grug", 100);
        weapon1 = new Weapon(WeaponType.SWORD, "William Wallace's Claymore", 50);
    }

    @Test
    public void playerHasName(){
        assertEquals("Grug", meleePlayer1.getName());
    }

    @Test
    public void playerHasHealth(){
        assertEquals(100, meleePlayer1.getHealth());
    }

    @Test
    public void playerHasWeapon(){
        assertEquals(weapon1, meleePlayer1.);
    }





}
