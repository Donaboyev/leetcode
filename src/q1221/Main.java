package q1221;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(sn.balancedStringSplit("LLLLRRRR"));
    }
}

class Solution {
    public int balancedStringSplit(String s) {
        final char[] cs = s.toCharArray();
        int m = 0;
        int c = 0;
        for (char val : cs) {
            if (val == 'L') {
                c++;
            } else {
                c--;
            }
            if (c == 0) {
                m++;
            }
        }
        return m;
    }
}