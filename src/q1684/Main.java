package q1684;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(sn.countConsistentStrings("ab", new String[]{"ad", "bd", "aaab", "baa", "badab"}));
    }
}

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c = 0;
        final char[] allowedChars = allowed.toCharArray();
        for (final String w : words) {
            final char[] charsOfWord = w.toCharArray();
            if (checkContains(charsOfWord, allowedChars)) {
                c++;
            }
        }
        return c;
    }

    private boolean checkContains(char[] w, char[] a) {
        for (char c : w) {
            boolean inside = false;
            for (char value : a) {
                if (c == value) {
                    inside = true;
                    break;
                }
            }
            if (!inside) {
                return false;
            }
        }
        return true;
    }
}