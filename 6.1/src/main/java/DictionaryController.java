public class DictionaryController {
    static Dictionary dictionary = new Dictionary();
    public String handleSearch(String word) {
        return  dictionary.searchWord(word);
    }

    public void handleAdd(String word, String definition) {
        dictionary.addWord(word, definition);
    }

    public String getWords() {
        return dictionary.showWords();
    }


    public static void main(String[] args) {
        dictionary.addWord("word", "gagagaga");
        dictionary.addWord("hello", "dadadada");
        DictionaryView.launch(DictionaryView.class);
    }
}
