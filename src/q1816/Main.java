package q1816;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(sn.truncateSentence("Hello how are you Contestant", 4));
    }
}

class Solution {
    public String truncateSentence(String s, int k) {
        final char[] l = s.toCharArray();
        int c = 0;
        for (int i = 0; i < l.length; i++) {
            if (l[i] == ' ') {
                c++;
                if (c == k) {
                    return s.substring(0, i);
                }
            }
        }
        return s;
    }
//    public String truncateSentence(String s, int k) {
//        final String[] l = s.split(" ");
//        final StringBuilder b = new StringBuilder();
//        for (int i = 0; i < k; i++) {
//            b.append(l[i]).append((i == k - 1) ? "" : " ");
//        }
//        return b.toString();
//    }
}