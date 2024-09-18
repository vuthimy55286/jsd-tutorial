package F2024_JSD_2101040126_VuThiMy_TutorialWeek04.powerups.F2024_JSD_2101040126_VuThiMy_TutorialWeek04.tanks;

public class point2D {
    private int x;
    private int y;
    public point2D(int x, int y) throws Exception {
        if (!isValidValue(x) || !isValidValue(y)){
            throw new Exception("Invalid value x and y!");
        }
        this.x = x;
        this.y = y;
    }
    public boolean isValidValue(int value){
        return value >= 0;
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(){
        this.y = y;
    }

    }

