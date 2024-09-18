package tut04.powerups;

import tut04.tanks.EnemyTank;

public class Timer {
    private EnemyTank enemyTanks;
    public Timer(){
        this.enemyTanks = enemyTanks;
    }
    public void activate(){
        enemyTanks.setPosition(enemyTanks.getPosition());
    }
}
