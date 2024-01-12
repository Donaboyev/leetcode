package q2828;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final Solution sl = new Solution();
        System.out.println(sl.isAcronym(List.of("alice","bob","dharlie"),  "abc"));
    }
}

class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length()) {
            return false;
        }
        final char[] l = s.toCharArray();
        for (int i = 0; i < l.length; i++) {
            final char[] w = words.get(i).toCharArray();
            if (w[0] != l[i]) {
                return false;
            }
        }
        return true;
    }
}
