package q0014;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(sn.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
//    public String longestCommonPrefix(String[] strs) {
//        if (strs.length == 1) {
//            return strs[0];
//        }
//        int count = 200;
//        final char[] letters = strs[0].toCharArray();
//        for (int j = 1; j < strs.length; j++) {
//            int innerCount = 0;
//            final char[] secondLetters = strs[j].toCharArray();
//            final int min = Math.min(letters.length, secondLetters.length);
//            for (int k = 0; k < min; k++) {
//                if (letters[k] == secondLetters[k]) {
//                    innerCount++;
//                    continue;
//                }
//                break;
//            }
//            if (innerCount == 0) {
//                return "";
//            }
//            if (count > innerCount) {
//                count = innerCount;
//            }
//
//        }
//        return strs[0].substring(0, count);
//    }
}
