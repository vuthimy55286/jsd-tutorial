package F2024_JSD_2101040126_VuThiMy_TutorialWeek04.powerups.F2024_JSD_2101040126_VuThiMy_TutorialWeek04.tanks;

public class EnemyTank extends  Tank {
    private String name;
    point2D position;
    private Directions direction;
    private int point;
    private int health;
    private int movementSpeed;
    private int bulletSpeed;
    private String description;
    public EnemyTank(String name, point2D position, int point, int health, int movementSpeed, int bulletSpeed,
                     String description) throws Exception {
        super();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public point2D getPosition() {
        return position;
    }

    public void setPosition(point2D position) {
        this.position = position;
    }

    public Directions getDirection() {
        return direction;
    }

    public void setDirection(Directions direction) {
        this.direction = direction;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    public int getBulletSpeed() {
        return bulletSpeed;
    }

    public void setBulletSpeed(int bulletSpeed) {
        this.bulletSpeed = bulletSpeed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "EnemyTank [name=" + name + ", position=" + position + ", direction=" + direction + ", point=" + point
                + ", health=" + health + ", movementSpeed=" + movementSpeed + ", bulletSpeed=" + bulletSpeed
                + ", description=" + description + "]";
    }
}
