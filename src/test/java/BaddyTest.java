import character.Baddy;
import enums.CharType;
import enums.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BaddyTest {

    Baddy baddy;
    WeaponType weaponType;
    CharType charType;

    @Before
    public void before(){
        baddy = new Baddy("Charlie the Troll", charType.TROLL, weaponType.ROCK_ON_STICK);
    }

    @Test
    public void canGetName(){
        assertEquals("Charlie the Troll", baddy.getName());
    }

    @Test
    public void canGetHP(){
        assertEquals(200, baddy.getHp());
    }

    @Test
    public void canSetHP(){
        baddy.setHp(200);
        assertEquals(200, baddy.getHp());
    }

    @Test
    public void canGetSpeed(){
        assertEquals(10, baddy.getSpeed());
    }

    @Test
    public void canSetSpeed(){
        baddy.setSpeed(100);
        assertEquals(100, baddy.getSpeed());
    }

    @Test
    public void canGetWeapon(){
        assertEquals(weaponType.ROCK_ON_STICK, baddy.getEquippedWeapon());
    }

    @Test
    public void canGetArmour(){
        assertEquals(50, baddy.getArmour());
    }

    @Test
    public void canGetWeaponDamaged(){
        assertEquals(200, baddy.getEquippedWeaponDamage());
    }
}