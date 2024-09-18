package tut03;

public class MultiThread {
    // Task 1: Print 'F' 50 times
    static class TaskPrintF implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
                System.out.print("F");
            }
        }
    }

    // Task 2: Print 'I' 50 times
    static class TaskPrintI implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
                System.out.print("I");
            }
        }
    }

    // Task 3: Print 'T' 50 times
    static class TaskPrintT implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
                System.out.print("T");
            }
        }
    }

    // Task 4: Print numbers 1 to 100
    static class TaskPrintNumbers implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 100; i++) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        // Create the tasks
        Runnable task1 = new TaskPrintF();
        Runnable task2 = new TaskPrintI();
        Runnable task3 = new TaskPrintT();
        Runnable task4 = new TaskPrintNumbers();

        // Create the threads
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);
        Thread thread4 = new Thread(task4);

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
