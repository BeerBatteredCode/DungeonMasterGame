package character;

import enums.CharType;
import enums.WeaponType;

import java.util.ArrayList;

public class Fighter extends Character {

    private ArrayList<WeaponType> allWeapons;
    private WeaponType weaponType;

    public Fighter(String name, CharType charType, WeaponType weaponType) {
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
}
