package hu.petrik.harcos;

public class Harcos {
    private String name;
    private int level;
    private int xp;
    private int hp;
    private int baseHp;
    private int baseDmg;

    public Harcos(String name, int statusTemplate) {
        this.name = name;
        this.level = 1;
        this.xp = 0;
        switch (statusTemplate){
            case 1:
                baseHp = 15;
                baseDmg = 3;
                break;
            case 2:
                baseHp = 12;
                baseDmg = 4;
                break;
            case 3:
                baseHp = 8;
                baseDmg = 5;
                break;
        }
        this.hp = getMaxHp();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDmg(){
        return baseDmg + level;
    }

    public int getToNextLevel(){
        return 10+level*5;
    }

    public int getMaxHp(){
        return baseHp+level*3;
    }
}
