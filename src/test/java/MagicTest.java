import character.Magic;
import enums.CharType;
import enums.SpellType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MagicTest {

    Magic magic;
    SpellType spellType;
    CharType charType;

    @Before
    public void before(){
        magic = new Magic("Churlie", charType.ROGUE, SpellType.ICE_SPELL);
    }

    @Test
    public void canGetName(){
        assertEquals("Churlie", magic.getName());
    }

    @Test
    public void canGetHP(){
        assertEquals(90, magic.getHp());
    }

    @Test
    public void canSetHP(){
        magic.setHp(200);
        assertEquals(200, magic.getHp());
    }

    @Test
    public void canGetSpeed(){
        assertEquals(220, magic.getSpeed());
    }

    @Test
    public void canSetSpeed(){
        magic.setSpeed(100);
        assertEquals(100, magic.getSpeed());
    }

    @Test
    public void canGetWeapon(){
        assertEquals(spellType.ICE_SPELL, magic.getEquippedSpell());
    }

    @Test
    public void canGetArmour(){
        assertEquals(100, magic.getArmour());
    }

    @Test
    public void canGetSpellDamaged(){
        assertEquals(180, magic.getEquippedSpellDamage());
    }


}