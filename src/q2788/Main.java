package q2788;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final Solution sl = new Solution();
        System.out.println(sl.splitWordsBySeparator(List.of("one.two.three", "four.five", "six"), '.'));
    }
}

class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        final List<String> result = new ArrayList<>();
        StringBuilder builder;
        for (final String word : words) {
            final char[] letters = word.toCharArray();
            builder = new StringBuilder();
            for (final char letter : letters) {
                if (letter != separator) {
                    builder.append(letter);
                } else {
                    if (!builder.isEmpty()) {
                        result.add(builder.toString());
                        builder = new StringBuilder();
                    }
                }
            }
            if (!builder.isEmpty()) {
                result.add(builder.toString());
            }
        }
        return result;
    }
}
