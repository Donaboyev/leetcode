package q1961;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(sn.isPrefixString("a", new String[]{"aa", "aaaa", "banana"}));
    }
}

class Solution {
//    public boolean isPrefixString(String s, String[] words) {
//        final StringBuilder sb = new StringBuilder();
//        for (final String word : words) {
//            sb.append(word);
//            if (sb.toString().equals(s)) {
//                return true;
//            }
//            if (!s.startsWith(sb.toString())) {
//                return false;
//            }
//        }
//        return false;
//    }
    public boolean isPrefixString(String s, String[] words) {
        int i = 0;
        final char[] ml = s.toCharArray();
        for (final String w : words) {
            final char[] l = w.toCharArray();
            for (int j = 0; j < l.length; j++) {
                if (l[j] == ml[i]) {
                    if (i == ml.length - 1) {
                        return j == l.length - 1;
                    }
                    i++;
                    continue;
                }
                return false;
            }
        }
        return false;
    }

//    public boolean isPrefixString(String s, String[] words) {
//        int i = 0;
//        for (final String word : words) {
//            for (int j = 0; j < word.length(); j++) {
//                if (word.charAt(j) == s.charAt(i)) {
//                    if (i == s.length() - 1) {
//                        return j == word.length() - 1;
//                    }
//                    i++;
//                    continue;
//                }
//                return false;
//            }
//        }
//        return false;
//    }
}