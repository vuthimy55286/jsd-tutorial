package tut04.powerups;

import tut04.tanks.EnemyTank;
import tut04.tanks.point2D;

import java.util.List;

public class Grenade{


    public void activate(List<EnemyTank> enemyTanks){
        for (EnemyTank tank : enemyTanks){
            tank.takeDamage(1);
        }


}}
