package enums;

public enum SpellType {
    FIRE_SPELL(200),
    ICE_SPELL(180);

    private final int spellDamage;

    SpellType(int spellDamage){
        this.spellDamage = spellDamage;
    }

    public int getSpellDamage() {
        return spellDamage;
    }
}
