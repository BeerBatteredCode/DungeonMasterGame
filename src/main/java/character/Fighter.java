package character;

import enums.CharType;
import enums.WeaponType;
import interfaces.IHero;

import java.util.ArrayList;

public class Fighter extends Character implements IHero {

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

    public int getEquippedWeaponDamage(){
        return getEquippedWeapon().getWeaponDamage();
    }

}
