package Q3;
import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence with some words. This sentence will be used for word count.";
        
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        
        // Split the sentence into words
        String[] words = sentence.split("\\s+");
        
        // Count the occurrence of each word
        for (String word : words) {
            // Remove punctuation marks from the word
            word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }
        
        // Display the word count
        System.out.println("Word Count:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
