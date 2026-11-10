

class WordCounter {
    static String language = "English";

    void countWords(String sentence) {
        String text = sentence.trim();

        int count;

        if (text.isEmpty()) {
            count = 0;
        } else {
            String[] words = text.split("\\s+");
            count = words.length;
        }

        System.out.println("Language: " + language);
        System.out.println("Sentence: " + sentence);
        System.out.println("Total Words: " + count);
    }
}

public class Q28 {
    public static void main(String[] args) {
        WordCounter w = new WordCounter();

        w.countWords("Java is a programming language");
    }
}
