package q2114;

public class Main {
    public static void main(String[] args) {
        final Solution sl = new Solution();
        System.out.println(sl.mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
    }
}

class Solution {
    public int mostWordsFound(String[] sentences) {
        int m = 0;
        for (final String s : sentences) {
            int c = 1;
            final char[] ls = s.toCharArray();
            for (final char l : ls) {
                if (l == ' ') {
                    c++;
                }
            }
            if (c > m) {
                m = c;
            }
        }
        return m;
    }
}
