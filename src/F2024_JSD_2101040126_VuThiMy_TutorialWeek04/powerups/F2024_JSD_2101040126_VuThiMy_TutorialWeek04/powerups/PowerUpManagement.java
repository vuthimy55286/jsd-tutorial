package F2024_JSD_2101040126_VuThiMy_TutorialWeek04.powerups.F2024_JSD_2101040126_VuThiMy_TutorialWeek04.powerups;
import F2024_JSD_2101040126_VuThiMy_TutorialWeek04.powerups.F2024_JSD_2101040126_VuThiMy_TutorialWeek04.tanks.Tank;
import F2024_JSD_2101040126_VuThiMy_TutorialWeek04.powerups.F2024_JSD_2101040126_VuThiMy_TutorialWeek04.tanks.point2D;

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
