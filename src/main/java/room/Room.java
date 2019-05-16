package room;

import interfaces.IHero;
import interfaces.IVillain;

import java.util.ArrayList;

public class Room {

    private ArrayList<IHero> allHeros;
    private ArrayList<IVillain> allVillains;

    public Room(){
        this.allHeros = new ArrayList<>();
        this.allVillains = new ArrayList<>();
    }

    public void addHeroToRoom(IHero hero){
        allHeros.add(hero);
    }

    public void addVillainToRoom(IVillain villain){
        allVillains.add(villain);
    }

    public void removeHeroFromRoom(IHero hero){
        allHeros.remove(hero);
    }

    public void removeVillainFromRoom(IVillain villain){
        allVillains.remove(villain);
    }

    public void battleTurnOne(IHero hero, IVillain villain){
        if (hero.isAlive() && villain.isAlive()){
            if (hero.getSpeed() > villain.getSpeed()){
                villain.takeDamage(hero.getEquippedWeaponDamage());
            } else {
                hero.takeDamage(villain.getEquippedWeaponDamage());
            }
        }
    }

    public void battleTurnTwo(IHero hero, IVillain villain){
        if (hero.isAlive() && villain.isAlive()){
            if (hero.getSpeed() < villain.getSpeed()){
                villain.takeDamage(hero.getEquippedWeaponDamage());
            } else {
                hero.takeDamage(villain.getEquippedWeaponDamage());
            }
        }
    }
}
