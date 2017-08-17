package items;

import player.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Lenovo on 17.08.2017.
 */
public class Item implements IItemAction{

    public static List<Item> staticItemList = new ArrayList<>();

    static  {
        staticItemList.add(new ItemHpPot());
    }

    private String name;
    private boolean hasAction;
    private int lift;
    private Random random;

    public Item(String name, boolean hasAction, int lift) {
        this.name = name;
        this.hasAction = hasAction;
        this.lift = lift;
        random = new Random();
    }

    @Override
    public void performAction(Player player) {

    }

    public Random getRandom() {
        return random;
    }

    public String getName() {
        return name;
    }

    public int getLift() {
        return lift;
    }

    public boolean isHasAction() {
        return hasAction;
    }
}
