package F2024_JSD_2101040126_VuThiMy_TutorialWeek04.powerups.F2024_JSD_2101040126_VuThiMy_TutorialWeek04.powerups;

import F2024_JSD_2101040126_VuThiMy_TutorialWeek04.powerups.F2024_JSD_2101040126_VuThiMy_TutorialWeek04.tanks.Tank;

public class Helmet {
    private Tank player;

    public Helmet(Tank player){
        this.player = player;
    }
    public void activate(){
        player.setHealth(player.getHealth() + 1);
    }
}
