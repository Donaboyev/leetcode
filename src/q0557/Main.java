package q0557;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(sn.reverseWords("Let's take LeetCode contest"));
    }
}

class Solution {
    public String reverseWords(String s) {
        final String[] w = s.split(" ");
        final StringBuilder b = new StringBuilder();
        for (final String i : w) {
            final char[] l = i.toCharArray();
            for (int j = l.length - 1; j >= 0; j--) {
                b.append(l[j]);
            }
            b.append(" ");
        }
        return b.toString().trim();
    }
}
