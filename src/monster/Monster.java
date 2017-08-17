package monster;

import items.Item;
import items.ItemHpPot;
import javafx.application.Platform;
import player.Player;

import java.util.Random;

/**
 * Created by Lenovo on 17.08.2017.
 */
public class Monster {
    private int damage;
    private int hp;
    private int lootRang;
    private int gameDay;

    public Monster(int gameDay)  {
        this.gameDay = gameDay;
    }



    public void damageMonster(int attack){
        hp -= attack;
    }

    public Item lootFromMonster() {
        return Item.staticItemList.get(new Random().nextInt(lootRang));
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getLootRang() {
        return lootRang;
    }

    public void setLootRang(int lootRang) {
        this.lootRang = lootRang;
    }
}
