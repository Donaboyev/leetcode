package q0804;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(sn.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
    }
}

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        final String[] morse = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        int count = 0;
        String[] cypheredWords = new String[words.length];
        for (final String word : words) {
            final String converted = convertToCyphered(word, morse);
            if (!checkContains(converted, cypheredWords)) {
                cypheredWords[count] = converted;
                count++;
            }
        }
        return count;
    }

    private boolean checkContains(String text, String[] cyphered) {
        for (final String c : cyphered) {
            if (Objects.equals(c, text)) {
                return true;
            }
        }
        return false;
    }

    private String convertToCyphered(String text, String[] morse) {
        final StringBuilder b = new StringBuilder();
        final char[] letters = text.toCharArray();
        for (final char letter : letters) {
            b.append(morse[letter - 'a']);
        }
        return b.toString();
    }
}
