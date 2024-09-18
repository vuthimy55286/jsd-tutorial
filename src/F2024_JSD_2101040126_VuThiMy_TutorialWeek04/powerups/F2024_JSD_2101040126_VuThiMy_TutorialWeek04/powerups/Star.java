package F2024_JSD_2101040126_VuThiMy_TutorialWeek04.powerups.F2024_JSD_2101040126_VuThiMy_TutorialWeek04.powerups;

import F2024_JSD_2101040126_VuThiMy_TutorialWeek04.powerups.F2024_JSD_2101040126_VuThiMy_TutorialWeek04.tanks.Tank;
import F2024_JSD_2101040126_VuThiMy_TutorialWeek04.powerups.F2024_JSD_2101040126_VuThiMy_TutorialWeek04.tanks.point2D;

import java.util.List;

public class Star extends Powerup {
    private int tier;
    public Star(point2D position) {
        super(position);
        this.tier = 1;
        // TODO Auto-generated constructor stub
    }


    @Override
    public void applyEffectToTank(Tank playerTank) {
        // TODO Auto-generated method stub

    }

    @Override
    public void applyEffect() {
        // TODO Auto-generated method stub

    }

    @Override
    public void applyEffectToEnemies(List<Tank> enemies) {
        // TODO Auto-generated method stub

    }
    public void activate(Tank tank){
        if(tier < 4){
            tier++;
        }
        switch (tier){
            case 2:
                tank.setBulletSpeed(3);
            case 3:
                tank.setBullet(2);
            case 4:

        }
    }

}
