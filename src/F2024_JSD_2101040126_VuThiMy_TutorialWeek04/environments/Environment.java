package tut04.environments;

import tut04.tanks.point2D;

public abstract class Environment {
    protected point2D position;

    public Environment(point2D position) throws Exception {
        // kiem tra vi tri co ton tai khong
        if(!isValidPosition(position)) {
            throw new Exception("Vi tri ko ton tai");
        }

        this.position = position;
    }



    public point2D getPosition() {
        return position;
    }



    private boolean isValidPosition(point2D position) {
        return true;
    }
    //Xác định xem xe tăng và đạn có thể đi qua môi trường này hay không.
    public abstract boolean canTankPassThrough();
    public abstract boolean canBulletPassThrough();

}
