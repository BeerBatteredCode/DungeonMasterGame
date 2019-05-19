package enums;

public enum WeaponType {
    GREAT_SWORD(150),
    BROAD_SWORD(100),
    DAGGER(20),
    ORKISH_SWORD(100),
    ORKISH_AXE(120),
    ORKISH_MACE(130),
    ROCK_ON_STICK(200);

    private final int weaponDamage;

    WeaponType(int weaponDamage){
        this.weaponDamage = weaponDamage;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }
}
