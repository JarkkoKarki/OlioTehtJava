import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private Map<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<>();
    }

    public void addWord(String word, String meaning) {
        dictionary.put(word.toLowerCase(), meaning);
        System.out.println("Word: " + word + " Added.");
    }

    public String showWords() {
        String keys = "";
        for (String value: dictionary.keySet()) {
            keys += value + ", ";
        }
        return keys;
    }

    public String searchWord(String word) {
        if (dictionary.containsKey(word)) {
            return dictionary.get(word).toLowerCase();
        } else {
            return "Word not found";
        }
    }
}