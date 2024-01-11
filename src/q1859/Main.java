package q1859;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(sn.sortSentence("is2 sentence4 This1 a3"));
    }
}

class Solution {
    public String sortSentence(String s) {
        final String[] l = s.split(" ");
        String[] t = new String[l.length];
        final StringBuilder b = new StringBuilder();
        for (final String w : l) {
            t[w.charAt(w.length() - 1) - '0' - 1] = w.substring(0, w.length() - 1);
        }
        for (final String i : t) {
            b.append(i).append(' ');
        }
        return b.toString().trim();
    }
//    public String sortSentence(String s) {
//        final String[] l = s.split(" ");
//        final StringBuilder b = new StringBuilder();
//        for (int i = 1; i <= l.length; i++) {
//            for (final String w : l) {
//                if (w.contains(String.valueOf(i))) {
//                    b.append(w, 0, w.length() - 1);
//                    if (i != l.length) {
//                        b.append(" ");
//                    }
//                }
//            }
//        }
//        return b.toString();
//    }
}