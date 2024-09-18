package tut04.powerups;
import tut04.tanks.Tank;
import tut04.tanks.point2D;

import java.lang.reflect.Type;
import java.util.Random;
public class PowerUpManagement {
    private Powerup currentPowerUp;
    private Random random;

    public PowerUpManagement(){
        this.random = new Random();
    }

    public void spawnPowerUp() throws Exception {
        int x = random.nextInt();
        int y = random.nextInt();
        currentPowerUp = new SpeedBoost(new point2D(x, y));
    }

    public void collectPowerUp(Tank tank) {
        if (currentPowerUp != null) {
            tank.addPoints(500);
            currentPowerUp.activate(tank);
            currentPowerUp = null;
        }
    }
    public void flashingTankHit(Tank tank) throws Exception {
        if (currentPowerUp != null) {
            currentPowerUp = null;
        }
        spawnPowerUp();
    }


}
