package tut02.WordOccurrence;
import java.io.*;
import java.util.*;
public class WordOccurrence {
    public static void main(String[] args) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("D:\\JavaSD\\JSD\\src\\tut02\\WordOccurrence\\data.in.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    word = word.trim();
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                    System.out.println(word);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Map.Entry<String, Integer>> wordList = new ArrayList<>(wordCountMap.entrySet());
        wordList.sort(Map.Entry.comparingByKey());


        try (PrintWriter writer = new PrintWriter(new FileWriter("D:\\JavaSD\\JSD\\src\\tut02\\WordOccurrence\\result.out"))) {
            writer.println(wordList.size());
            for (Map.Entry<String, Integer> entry : wordList) {
                writer.println(entry.getKey() + " " + entry.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
