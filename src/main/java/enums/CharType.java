package enums;

public enum CharType {
    KNIGHT(150, 70);


    private final int hp, speed;

    CharType(int hp, int speed){
        this.hp = hp;
        this.speed = speed;
    }

    public int getHp() {
        return hp;
    }

    public int getSpeed() {
        return speed;
    }
}
