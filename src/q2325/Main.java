package q2325;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final Solution sl = new Solution();
        System.out.println(sl.decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
    }
}

class Solution {
    public String decodeMessage(String key, String message) {
        final List<Character> ll = new ArrayList<>();
        final char[] l = key.toCharArray();
        for (final char c : l) {
            if (!ll.contains(c) && c != ' ') {
                ll.add(c);
            }
        }
        final StringBuilder b = new StringBuilder();
        final char[] m = message.toCharArray();
        for (char value : m) {
            if (value == ' ') {
                b.append(value);
                continue;
            }
            int c = 0;
            for (int j = 0; j < ll.size(); j++) {
                if (value == ll.get(j)) {
                    c = j;
                    break;
                }
            }
            b.append((char) ('a' + c));
        }
        return b.toString();
    }

}
