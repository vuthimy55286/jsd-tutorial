package F2024_JSD_2101040126_VuThiMy_TutorialWeek04.powerups.F2024_JSD_2101040126_VuThiMy_TutorialWeek04.powerups;

import java.util.Random;

public enum Type {
    GRENADE, HELMET, SHOVEL, STAR, TANK, TIMER;
    public static Type getRandomType(){
        Random random = new Random();
        return values()[random.nextInt(values().length)];

    }
}
