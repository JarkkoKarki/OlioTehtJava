import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private Map<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<>();
    }

    public void addword(String word, String meaning) {
        dictionary.put(word.toLowerCase(), meaning);
        System.out.println("Word: " + word + " Added.");
    }

    public String searchWord(String word) {
        if (dictionary.containsKey(word)) {
            return word.toLowerCase();
        } else {
            return "Word not found";
        }
    }
}