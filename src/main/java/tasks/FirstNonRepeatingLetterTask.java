package tasks;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

public class FirstNonRepeatingLetterTask implements Task {

    private final String input;

    public FirstNonRepeatingLetterTask(String word) {
        this.input = word;
    }

    private Character firstNonRepeatingLetter() {
        Map<Character, Integer> lowercaseCharFrequencies = new HashMap<>();

        for (char c : input.toCharArray()) {
            char lowercaseChar = Character.toLowerCase(c);
            lowercaseCharFrequencies.put(lowercaseChar, lowercaseCharFrequencies.getOrDefault(lowercaseChar, 0) + 1);
        }

        for (char c : input.toCharArray()) {
            char lowercaseChar = Character.toLowerCase(c);
            if (lowercaseCharFrequencies.get(lowercaseChar) == 1) {
                return c;
            }
        }

        return ' ';
    }


    @Override
    public Object execute() {
        return firstNonRepeatingLetter();
    }
}
