package tut03;

import java.io.*;

class FileSearchThread extends Thread {
    private File file;
    private String keyword;

    public FileSearchThread(File file, String keyword) {
        this.file = file;
        this.keyword = keyword;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int lineNumber = 0;
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                if (line.contains(keyword)) {
                    System.out.println("Keyword found in file: " + file.getName() + " at line " + lineNumber);
                    return; // Stop searching this file if keyword is found
                }
            }
            System.out.println("Keyword not found in file: " + file.getName());
        } catch (IOException e) {
            System.err.println("Error reading file: " + file.getName());
        }
    }
}

public class FileSearchApplication {
    public static void main(String[] args) {
        String folderPath = "./files"; // Replace with your folder path
        String keyword = "searchKeyword"; // Replace with your keyword

        File folder = new File(folderPath);
        File[] files = folder.listFiles((dir, name) -> name.endsWith(".txt"));

        if (files == null || files.length == 0) {
            System.out.println("No files found in the folder.");
            return;
        }

        for (File file : files) {
            FileSearchThread thread = new FileSearchThread(file, keyword);
            thread.start();
        }
    }
}