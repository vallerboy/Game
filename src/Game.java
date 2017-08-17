import com.sun.scenario.effect.impl.prism.PrImage;
import javafx.application.Platform;
import player.Player;
import utils.MenuUtils;

/**
 * Created by Lenovo on 17.08.2017.
 */
public class Game {
    private int day;
    private Player player;

    public Game(int startDay){
        player = new Player();
        day = startDay;
    }

    public void startGame() {
        MenuUtils.printStartMenu();


    }

}
