package q0067;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(sn.addBinary("11", "1"));
    }
}

class Solution {
    public String addBinary(String a, String b) {
        final int maxLength = Math.max(a.length(), b.length());
        final char[] aDigits = a.toCharArray();
        final char[] bDigits = b.toCharArray();
        char[] result = new char[maxLength + 1];
        char carryOver = '0';
        for (int i = maxLength - 1; i >= 0; i--) {
            char aCurrent = '0';
            char bCurrent = '0';
            if (i < aDigits.length) {
                aCurrent = aDigits[i];
            }
            if (i < bDigits.length) {
                bCurrent = bDigits[i];
            }
            if (aCurrent == '1' && bCurrent == '1') {
                result[i] = '1';
            }
        }
        return "";
    }
}
