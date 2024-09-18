package tut03;

import java.util.Arrays;

class SortingThread extends Thread {
    private int[] array;
    private String sortType;

    public SortingThread(int[] array, String sortType) {
        this.array = Arrays.copyOf(array, array.length); // Copy the array
        this.sortType = sortType;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        System.out.println(sortType + " started sorting...");

        switch (sortType) {
            case "Selection Sort":
                selectionSort();
                break;
            case "Insertion Sort":
                insertionSort();
                break;
            case "Bubble Sort":
                bubbleSort();
                break;
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println(sortType + " finished sorting in " + duration + " ms");
    }

    private void selectionSort() {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap array[minIndex] and array[i]
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;

            sleepAndPrint();
        }
    }

    private void insertionSort() {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;

            sleepAndPrint();
        }
    }

    private void bubbleSort() {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

            sleepAndPrint();
        }
    }

    private void sleepAndPrint() {
        try {
            Thread.sleep(500); // Sleep for 500 milliseconds (0.5 seconds)
            System.out.println(sortType + ": " + Arrays.toString(array));
        } catch (InterruptedException e) {
            System.err.println("Thread interrupted: " + e.getMessage());
        }
    }
}

public class MultiThreadedSorting {
    public static void main(String[] args) {
        int[] originalArray = new int[50];
        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = i + 1;
        }
        shuffleArray(originalArray);

        // Start sorting in different threads
        SortingThread selectionSortThread = new SortingThread(originalArray, "Selection Sort");
        SortingThread insertionSortThread = new SortingThread(originalArray, "Insertion Sort");
        SortingThread bubbleSortThread = new SortingThread(originalArray, "Bubble Sort");

        long totalStartTime = System.currentTimeMillis();

        selectionSortThread.start();
        insertionSortThread.start();
        bubbleSortThread.start();

        try {
            selectionSortThread.join();
            insertionSortThread.join();
            bubbleSortThread.join();
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted: " + e.getMessage());
        }

        long totalEndTime = System.currentTimeMillis();
        long totalDuration = totalEndTime - totalStartTime;

        System.out.println("All sorting completed. Total time: " + totalDuration + " ms");
        System.out.println("Number of processors: " + Runtime.getRuntime().availableProcessors());
    }

    // Fisher-Yates Shuffle Algorithm
    public static void shuffleArray(int[] array) {
        int n = array.length;
        for (int i = n - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            // Swap array[i] and array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}