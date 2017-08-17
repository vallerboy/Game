package player;

/**
 * Created by Lenovo on 17.08.2017.
 */
public enum ClassModel {
    ELF(8, 5, 80, 80), MAG(5, 4, 120, 200), WARRIOR(12, 6, 50, 50);
    private int attack;
    private int def;
    private int hp;
    private int mana;

    ClassModel(int attack, int def, int hp, int mana) {
        this.attack = attack;
        this.def = def;
        this.hp = hp;
        this.mana = mana;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
