package enums;

public enum WeaponType {
    GREAT_SWORD(150);

    private final int weaponDamage;

    WeaponType(int weaponDamage){
        this.weaponDamage = weaponDamage;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }
}
