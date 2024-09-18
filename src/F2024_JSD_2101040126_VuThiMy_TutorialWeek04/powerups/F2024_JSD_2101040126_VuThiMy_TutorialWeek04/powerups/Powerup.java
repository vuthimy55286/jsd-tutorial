package F2024_JSD_2101040126_VuThiMy_TutorialWeek04.powerups.F2024_JSD_2101040126_VuThiMy_TutorialWeek04.powerups;
import F2024_JSD_2101040126_VuThiMy_TutorialWeek04.powerups.F2024_JSD_2101040126_VuThiMy_TutorialWeek04.tanks.point2D;

import java.util.List;
public abstract class Powerup {
    private point2D position;
    private boolean isActive;

    public Powerup(point2D position) {
        this.position = position;
        this.isActive = true;
    }

    public point2D getPosition() {
        return position;
    }

    public boolean isActive() {
        return isActive;
    }

    public void collect() {
        this.isActive = false;
        System.out.println("Power-Up collected!");
    }
    // Ảnh hưởng tới xe
    public abstract void applyEffectToTank(F2024_JSD_2101040126_VuThiMy_TutorialWeek04.powerups.F2024_JSD_2101040126_VuThiMy_TutorialWeek04.tanks.Tank playerTank);

    public abstract void applyEffectToTank(Tank playerTank);

    // Ảnh hưởng tới tất cả
    public abstract void applyEffect();

    public abstract void applyEffectToEnemies(List<F2024_JSD_2101040126_VuThiMy_TutorialWeek04.powerups.F2024_JSD_2101040126_VuThiMy_TutorialWeek04.tanks.Tank> enemies);


    public abstract void applyEffectToEnemies(List<Tank> enemies);
}
