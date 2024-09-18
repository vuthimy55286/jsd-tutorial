package tut04.environments;
import tut04.tanks.point2D;
public class Water  extends Environment{
    public Water(point2D position) throws Exception {
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
    public boolean canTankTraverse() {
        return false;
    }

}
