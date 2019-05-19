package character;

import enums.CharType;
import enums.WeaponType;
import interfaces.IVillain;

import java.util.ArrayList;

public class Baddy extends Character implements IVillain {

    private ArrayList<WeaponType> allWeapons;
    private WeaponType weaponType;

    public Baddy(String name, CharType charType, WeaponType weaponType) {
        super(name, charType);
        this.allWeapons = new ArrayList<>();
        addWeapon(weaponType);
    }

    public void addWeapon(WeaponType weaponType){
        allWeapons.add(weaponType);
    }

    public WeaponType getEquippedWeapon() {
        return allWeapons.get(0);
    }

    public int getEquippedWeaponDamage(){
        return getEquippedWeapon().getWeaponDamage();
    }
}
