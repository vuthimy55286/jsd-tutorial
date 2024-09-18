package F2024_JSD_2101040126_VuThiMy_TutorialWeek04.powerups.F2024_JSD_2101040126_VuThiMy_TutorialWeek04.tanks;

public class Main {
    public static void main(String[] args) {
        try {
            Tank basicTank01 = new BasicTank(new point2D(3, 5));
        } catch (Exception e) {
            System.err.println("Đã xảy ra lỗi" +e.getMessage());
            e.printStackTrace();
        }

    }
}
