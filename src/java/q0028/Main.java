package java.q0028;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(sn.strStr("leetcode", "leeto"));
    }
}

class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }
        final char[] hayLetters = haystack.toCharArray();
        final char[] needleLetters = needle.toCharArray();
        int index = -1;
        for (int i = 0; i < hayLetters.length; i++) {
            if (hayLetters.length - i < needleLetters.length) {
                return -1;
            }
            boolean contains = true;
            for (int j = 0; j < needleLetters.length; j++) {
                if (hayLetters[i + j] == needleLetters[j]) {
                    if (j == 0) {
                        index = i;
                    }
                } else {
                    contains = false;
                    break;
                }
            }
            if (contains) {
                return index;
            }
        }
        return -1;
    }
}
