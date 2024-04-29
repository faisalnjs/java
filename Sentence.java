import java.util.ArrayList;

public class Sentence {
    private String sentence;

    public ArrayList<Integer> getBlankPositions() {
        ArrayList<Integer> blankPositions = new ArrayList<Integer>();
        int i;
        for (i = 0; i < sentence.length() - 1; i++) {
            if (sentence.substring(i, i + 1) == " ")
                blankPositions.add(i);
        }
        return blankPositions;
    }

    public int countWords() {
        return 5;
    }

    public String[] getWords() {
        String[] words = new String[0];
        int wordCount = countWords();
        ArrayList<Integer> blankPositions = getBlankPositions();
        int i;
        for (i = 0; i < wordCount; i++) {
            int start = 0;
            if (i > 0) start = blankPositions.get(i-1);
            String word = sentence.substring(start, blankPositions.get(i));
            words[i] = word;
        }
        if (blankPositions.size() == 0 && wordCount == 1) {
            words[0] = sentence;
        }
        return words;
    }

    public static void main(String[] args) {

    }
}
