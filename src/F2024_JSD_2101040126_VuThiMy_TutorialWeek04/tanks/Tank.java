package tut04.tanks;

public class Tank  extends TankFunction{
    private String name;
    private point2D position;
    private Directions direction;
    private int point;
    private int health;
    private int movementSpeed;
    private int bulletSpeed;
    private int life;
    private String description;
    private int bullet;
    public Tank() throws Exception {
        if(!isValidName(name)) {
            throw new Exception("Invalid tank name!");
        }
        if(!isValidPosition(position)) {
            throw new Exception("Invalid tank position!");
        }
        //Kiểm tra điểm số phải lớn hơn 0
        if (point < 0) {
            throw new Exception("Point must be greater than or equal to 0!");
        }
        //Kiểm tra lượng sức khoẻ (health) lớn hơn 0
        if (health <= 0) {
            throw new Exception("Health must be greater than 0!");
        }
        //Kiểm tra tốc độ di chuyển phải lớn hơn không
        if (movementSpeed <= 0) {
            throw new Exception("Movement speed must be greater than 0!");
        }
        // Kiểm tra tốc độ đạn phải lớn hơn không
        if (bulletSpeed <= 0) {
            throw new Exception("Bullet speed must be greater than 0!");
        }
        //Kiểm tra mô tả không được để trống
        if (description == null || description.trim().isEmpty()) {
            throw new Exception("Description cannot be empty!");
        }

        this.name = name;
        this.position = position;
        this.direction = Directions.UP;
        this.point = point;
        this.health = health;
        this.movementSpeed = movementSpeed;
        this.bulletSpeed = bulletSpeed;
        this.description = description;
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

    public int getLife(){
        return life;
    }

    public void setLife(int life){
        this.life = life;
    }

    public int getBullet(){
        return bullet;
    }

    public void setBullet(int bullet){
        this.bullet = bullet;
    }

    private boolean isValidPosition(point2D position2) {
        // TODO Auto-generated method stub
        int minX = 1;
        int maxX = 100;
        int minY = 1;
        int maxY = 100;

        if(position2 == null){
            return false;
        }
        if(position2.getX() < minX || position2.getX() > maxX || position2.getY() < minY || position2.getY() > maxY){
            return false;
        }
        return true;
    }
    private boolean isValidName(String name) {
        if(name == null){
            return false;
        }
        if(name.trim().isEmpty()){
            return false;
        }
        int minLength = 1;
        int maxLength = 30;
        if(name.length() < minLength || name.length() > maxLength){
            return false;
        }
        if(!name.matches("[a-zA-Z0-9]+")){
            return false;
        }
        // TODO Auto-generated method stub
        return true;
    }

    public boolean isValidPoint(int point){
        return point >= 0;
    }
    public boolean isValidHealth(int health){
        if(health <= 0 || health > 4){
            return false;
        }
        return true;
    }
    public boolean isValidMovementSpeed(int movementSpeed){
        if(movementSpeed <= 0 || movementSpeed > 3){
            return false;
        }
        return true;
    }
    public boolean isValidBulletSpeed(int bulletSpeed){
        if(bulletSpeed <= 0 || bulletSpeed > 3){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tank [name=" + name + ", position=" + position + ", point=" + point + ", health=" + health
                + ", movementSpeed=" + movementSpeed + ", bulletSpeed=" + bulletSpeed + ", description=" + description
                + "]";
    }

    @Override
    public void move() throws Exception {
        // TODO Auto-generated method stub
        switch (direction){
            case UP:
                position = new point2D(position.getX(), position.getY() - movementSpeed);
            case DOWN:
                position = new point2D(position.getX(), position.getY() + movementSpeed);
            case LEFT:
                position = new point2D(position.getX() - movementSpeed, position.getY());
            case RIGHT:
                position = new point2D(position.getX() + movementSpeed, position.getY());
                break;
            default:
                throw new IllegalStateException("Unexpected direction: " + direction);
        }// Giữ tank trong phạm vi bản đồ
        position = new point2D(Math.max(0, Math.min(100, position.getX())),
                Math.max(0, Math.min(100, position.getY())));
    }

    public void setDirection(Directions direction) {
        this.direction = direction;
    }

    @Override
    public void shoot(Tank tank) {
        // TODO Auto-generated method stub
        int damage = this.bulletSpeed;
        tank.takeDamage(damage);
    }
    public void takeDamage(int damage){
        this.health -= damage;
    }

    public void addPoints(int score){
        this.point += score;
    }

}
