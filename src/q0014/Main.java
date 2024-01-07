package q0014;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(sn.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        final StringBuilder s = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].isEmpty()) {
                return "";
            }
//            for (int j = i; j < ; j++) {
//
//            }
        }
        return "";
    }
}
