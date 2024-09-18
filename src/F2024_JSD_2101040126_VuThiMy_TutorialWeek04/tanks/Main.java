package tut04.tanks;

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
