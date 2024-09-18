package tut04.powerups;
import tut04.tanks.point2D;
import tut04.tanks.Tank;

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
    public abstract void applyEffectToTank(Tank playerTank);

    public abstract void applyEffectToTank(tut04.powerups.Tank playerTank);

    // Ảnh hưởng tới tất cả
    public abstract void applyEffect();

    public abstract void applyEffectToEnemies(List<Tank> enemies);


    public abstract void applyEffectToEnemies(List<tut04.powerups.Tank> enemies);
}
