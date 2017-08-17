package player;

import items.Item;

import java.util.List;

/**
 * Created by Lenovo on 17.08.2017.
 */
public class Player {
    private String nick;
    private int lvl;
    private int def;
    private int lift;
    private int hp;
    private int mana;
    private int exp;
    private int expToLvL;


    private ClassModel classModel;

    private List<Item> eq;

    public Player(){
        // Ustawiamy wartości startowe
        classModel = ClassModel.WARRIOR;

        hp = classModel.getHp();
        mana = classModel.getMana();
        expToLvL = 100 + 100 * lvl;

    }

    public void addSomeExp(int exp){
        this.exp += exp;
        checkIfLvlUp();
    }

    private void checkIfLvlUp() {
        if(exp >= expToLvL){
            lvl++;
            exp = 0;
            expToLvL = expToLvL + 100 * lvl;
            System.out.println(" ~ Awansowałeś!");
        }
    }



    public void damagePlayer(int hp){
        this.hp -= hp;
    }

    public void healPlayer(int hp){
        this.hp += hp;
    }

    public void addItemToEq(Item item){
        if(canLiftMore()){
            if(getEqLift() + item.getLift() > lift){
                System.out.println(" ~ Nie podniesiesz więcej");
            }else{
                eq.add(item);
            }
        }
    }

    public void dropItem(Item item){
        eq.remove(item);
    }

    public boolean canLiftMore(){
        return getEqLift() < lift;
    }

    public int getEqLift() {
        int sum = 0;
        for (Item item : eq) {
            sum += item.getLift();
        }
        return sum;
    }
}
