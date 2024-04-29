import java.util.ArrayList;
import java.util.Scanner;

public class PigLatin {
    public String line;

    private boolean isVowel(String str) {
        if ((str.substring(0, 1) == "a") || (str.substring(0, 1) == "e") || (str.substring(0, 1) == "i")
                || (str.substring(0, 1) == "o") || (str.substring(0, 1) == "u")) {
            return true;
        } else {
            return false;
        }
    }

    public String toPig(String str) {
        if (isVowel(str)) {
            return str + "yay";
        } else {
            return str.substring(1) + str.substring(0, 1) + "ay";
        }
    }

    private ArrayList<String> getLineWords() {
        ArrayList<String> words = new ArrayList<String>();
        String newLine = line;
        int index = newLine.indexOf(" ");
        while (index != -1) {
            String word = newLine.substring(0, index);
            words.add(word);
            newLine = newLine.substring(index + 1);
        }
        return words;
    }

    public void main() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a sentence to translate to Pig Latin: ");
        String line = keyboard.nextLine();
        keyboard.close();
        System.out.println("Before: " + line);
        String after = "";
        ArrayList<String> words = getLineWords();
        for (String word : words) {
            after += " " + toPig(word);
        }
        System.out.println("After: " + after);
    }

    public static void main(String[] args) {
        PigLatin pig = new PigLatin();
        pig.main();
    }
}
