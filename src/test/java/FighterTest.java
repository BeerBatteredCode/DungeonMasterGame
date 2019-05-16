import character.Fighter;
import enums.CharType;
import enums.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FighterTest {

    Fighter fighter;
    WeaponType weaponType;
    CharType charType;

    @Before
    public void before(){
        fighter = new Fighter("Grint", charType.KNIGHT, weaponType.GREAT_SWORD);
    }

    @Test
    public void canGetName(){
        assertEquals("Grint", fighter.getName());
    }

    @Test
    public void canGetHP(){
        assertEquals(150, fighter.getHp());
    }

    @Test
    public void canSetHP(){
        fighter.setHp(200);
        assertEquals(200, fighter.getHp());
    }

    @Test
    public void canGetSpeed(){
        assertEquals(70, fighter.getSpeed());
    }

    @Test
    public void canSetSpeed(){
        fighter.setSpeed(100);
        assertEquals(100, fighter.getSpeed());
    }

    @Test
    public void canGetWeapon(){
        assertEquals(weaponType.GREAT_SWORD, fighter.getEquippedWeapon());
    }

    @Test
    public void canGetArmour(){
        assertEquals(150, fighter.getArmour());
    }

    @Test
    public void canGetWeaponDamaged(){
        assertEquals(150, fighter.getEquippedWeaponDamage());
    }


}
