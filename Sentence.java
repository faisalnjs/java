import java.util.ArrayList;

public class Sentence {
    private String sentence;

    public ArrayList<Integer> getBlankPositions() {
        ArrayList<Integer> blankPositions = new ArrayList<Integer>();
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.substring(i, i + 1).equals(" "))
                blankPositions.add(i);
        }
        return blankPositions;
    }

    public int countWords() {
        return getBlankPositions().size() + 1;
    }

    public String[] getWords() {
        int wordCount = countWords();
        String[] words = new String[wordCount];
        ArrayList<Integer> blankPositions = getBlankPositions();
        int i;
        if (blankPositions.size() == 0 && wordCount == 1) {
            words[0] = sentence;
        } else {
            for (i = 0; i < wordCount; i++) {
                int start = 0;
                if (i > 0)
                    start = blankPositions.get(i - 1) + 1;
                if (blankPositions.size() == i) {
                    String word = sentence.substring(start);
                    words[i] = word;
                } else {
                    String word = sentence.substring(start, blankPositions.get(i));
                    words[i] = word;
                }
            }
        }
        return words;
    }

    public static void main(String[] args) {
        Sentence sentence1 = new Sentence();
        sentence1.sentence = "The bird flew away!";
        System.out.println(sentence1.getBlankPositions());
        System.out.println(sentence1.countWords());
        int i;
        for (i = 0; i < sentence1.countWords(); i++) {
            System.out.println(sentence1.getWords()[i]);
        }
    }
}
