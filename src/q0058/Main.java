package q0058;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(sn.lengthOfLastWord("2"));
    }
}

class Solution {
    public int lengthOfLastWord(String s) {
        if (s.length() == 1) {
            return 1;
        }
        final char[] l = s.toCharArray();
        int c = 0;
        for (int i = l.length - 1; i >= 0; i--) {
            if (l[i] == ' ') {
                if (l[i - 1] == ' ') {
                    c = 0;
                }
            } else {
                c++;
                if (i == 0) {
                    return c;
                }
                if (l[i - 1] == ' ') {
                    return c;
                }
            }
        }
        return c;
    }
}
