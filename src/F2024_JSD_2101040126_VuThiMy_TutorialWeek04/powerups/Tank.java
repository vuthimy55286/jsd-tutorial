package tut04.powerups;

public class Tank {
    private F2024_JSD_2101040126_VuThiMy_TutorialWeek04.tanks.Tank player;

    public Tank(){
        this.player = player;
    }
    public void activate(){
        if (player.getPoint() >= 20000){
            player.setLife(player.getLife() + 1);
        }
    }
}
