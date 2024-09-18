package tut04.powerups;
import java.util.List;

import tut04.tanks.point2D;
import tut04.tanks.Tank;
public class Helmet {
    private Tank player;

    public Helmet(Tank player){
        this.player = player;
    }
    public void activate(){
        player.setHealth(player.getHealth() + 1);
    }
}
