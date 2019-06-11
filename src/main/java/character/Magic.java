package character;

import enums.CharType;
import enums.SpellType;
import interfaces.IHero;

import java.util.ArrayList;

public class Magic extends Character implements IHero {

    private ArrayList<SpellType> allSpells;
    private SpellType spellType;

    public Magic(String name, CharType charType, SpellType spellType) {
        super(name, charType);
        this.allSpells = new ArrayList<>();
        addSpell(spellType);
    }

    public void addSpell(SpellType spellType){
        allSpells.add(spellType);
    }

    public SpellType getEquippedSpell() {
        return allSpells.get(0);
    }

    public int getEquippedSpellDamage(){
        return getEquippedSpell().getSpellDamage();
    }
}
