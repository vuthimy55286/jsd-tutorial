package tut04.environments;

import tut04.tanks.Tank;
import tut04.tanks.point2D;

public class Ice extends Environment{
    public Ice(point2D position) throws Exception {
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
    public void moveTank(Tank tank) {
        // Xử lý logic để làm cho tank trượt trên băng
        System.out.println("Tank sliding on ice!");
    }

}
