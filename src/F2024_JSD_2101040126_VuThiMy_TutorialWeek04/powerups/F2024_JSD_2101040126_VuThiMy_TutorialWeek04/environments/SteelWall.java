package F2024_JSD_2101040126_VuThiMy_TutorialWeek04.powerups.F2024_JSD_2101040126_VuThiMy_TutorialWeek04.environments;

import F2024_JSD_2101040126_VuThiMy_TutorialWeek04.powerups.F2024_JSD_2101040126_VuThiMy_TutorialWeek04.tanks.point2D;

public class SteelWall extends Environment {
    public SteelWall(point2D position) throws Exception {
        super(position);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean canTankPassThrough() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean canBulletPassThrough() {
        // TODO Auto-generated method stub
        return false;
    }

}
