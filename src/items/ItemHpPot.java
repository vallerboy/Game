package items;

import player.Player;

/**
 * Created by Lenovo on 17.08.2017.
 */
public class ItemHpPot extends Item {
    public ItemHpPot() {
        super("HP Pot", true, 5);
    }

    @Override
    public void performAction(Player player) {
        player.healPlayer(getRandom().nextInt(20));
    }
}
