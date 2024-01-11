package q0709;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(sn.toLowerCase("Hello"));
    }
}

class Solution {
    public String toLowerCase(String s) {
        final StringBuilder b = new StringBuilder();
        final char[] c = s.toCharArray();
        for (char l : c) {
            if (l >= 'A' && l <= 'Z') {
                l = (char) ((int) l + 32);
            }
            b.append(l);
        }
        return b.toString();
    }
//    public String toLowerCase(String s) {
//        return s.toLowerCase();
//    }
}
