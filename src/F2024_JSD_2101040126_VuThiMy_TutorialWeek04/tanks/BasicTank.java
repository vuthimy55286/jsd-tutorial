package tut04.tanks;

public class BasicTank  extends EnemyTank{
    private Directions direction;
    public BasicTank(point2D position) throws Exception {
        super("Basic Tank", position, 100, 1, 1, 1, "Desc");
        this.direction = Directions.DOWN;
    }
    public point2D getPosition(){
        return this.position;
    }
    public void setPosition(point2D position){
        this.position = position;
    }
    public Directions getDirection(){
        return this.direction;
    }
    public void setDirection(Directions direction){
        this.direction = direction;
    }
    public String toString() {
        return "Tank [name=" + getName() + ", position=" + getPosition() + ", point=" + getPoint() + ", health=" + getHealth()
                + ", movementSpeed=" + getMovementSpeed() + ", bulletSpeed=" + getBulletSpeed() + ", description=" + getDescription()
                + "]";
    }
}
