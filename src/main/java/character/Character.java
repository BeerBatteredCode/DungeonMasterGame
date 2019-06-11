package character;

import enums.CharType;
import enums.WeaponType;

public abstract class Character {

    private int hp, speed, armour;
    private String name;
    private CharType charType;
    private WeaponType weaponType;

    public Character(String name, CharType charType) {
        this.name = name;
        this.hp = charType.getHp();
        this.speed = charType.getSpeed();
        this.armour = charType.getArmour();
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    public void takeDamage(int amount){
        hp -= amount;
    }

    public boolean isAlive(){
        return hp > 0;
    }
}
