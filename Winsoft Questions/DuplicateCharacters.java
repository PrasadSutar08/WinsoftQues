import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "programming";
        
        // Create a HashMap to store characters and their counts
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        // Convert the string to character array
        char[] chars = str.toCharArray();
        
        // Count the occurrence of each character
        for (char ch : chars) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        
        // Print duplicate characters
        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
