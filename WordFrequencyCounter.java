import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        
        String filePath = "input.txt";
        
       
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Read each line from the file
            while ((line = reader.readLine()) != null) {
                // Split the line into words using whitespace as separator
                String[] words = line.split("\\s+");
                for (String word : words) {
                    // Remove any punctuation marks and convert to lowercase
                    word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
                    // Update the count of the word in the map
                    wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return;
        }

        
        System.out.println("Word Frequency:");
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
