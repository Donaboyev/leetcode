package q1662;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(sn.arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"}));
    }
}

class Solution {
//    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//        String l = "";
//        String r = "";
//        for (final String e : word1) {
//            l += e;
//        }
//        for (final String e : word2) {
//            r += e;
//        }
//        return l.equals(r);
//    }

//    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//        return String.join("", word1).equals(String.join("", word2));
//    }

//    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//        final StringBuilder sb1 = new StringBuilder();
//        for (final String e : word1) {
//            sb1.append(e);
//        }
//        final StringBuilder sb2 = new StringBuilder();
//        for (final String e : word2) {
//            sb2.append(e);
//        }
//        return sb1.toString().equals(sb2.toString());
//    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        final StringBuilder sb1 = new StringBuilder();
        for (final String e : word1) {
            sb1.append(e);
        }
        final StringBuilder sb2 = new StringBuilder();
        for (final String e : word2) {
            sb2.append(e);
        }
        return sb1.toString().contentEquals(sb2);
    }
}