package F2024_JSD_2101040126_VuThiMy_TutorialWeek04.powerups.F2024_JSD_2101040126_VuThiMy_TutorialWeek04.powerups;

import F2024_JSD_2101040126_VuThiMy_TutorialWeek04.powerups.F2024_JSD_2101040126_VuThiMy_TutorialWeek04.tanks.EnemyTank;

import java.util.List;

public class Grenade{


    public void activate(List<EnemyTank> enemyTanks){
        for (EnemyTank tank : enemyTanks){
            tank.takeDamage(1);
        }


}}
