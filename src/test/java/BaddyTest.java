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
        assertEquals(150, baddy.getHp());
    }

    @Test
    public void canSetHP(){
        baddy.setHp(200);
        assertEquals(200, baddy.getHp());
    }

    @Test
    public void canGetSpeed(){
        assertEquals(70, baddy.getSpeed());
    }

    @Test
    public void canSetSpeed(){
        baddy.setSpeed(100);
        assertEquals(100, baddy.getSpeed());
    }

    @Test
    public void canGetWeapon(){
        assertEquals(weaponType.GREAT_SWORD, baddy.getEquippedWeapon());
    }
}