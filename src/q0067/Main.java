package q0067;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(sn.addBinary("0", "0"));
    }
}

class Solution {
    public String addBinary(String a, String b) {
        final int maxLength = Math.max(a.length(), b.length());
        final char[] aDigits = new char[maxLength];
        final char[] bDigits = new char[maxLength];
        for (int i = maxLength - 1; i >= 0; i--) {
            aDigits[i] = (a.length() - (maxLength - i) >= 0) ? a.charAt(a.length() - (maxLength - i)) : '0';
        }
        for (int i = maxLength - 1; i >= 0; i--) {
            bDigits[i] = (b.length() - (maxLength - i) >= 0) ? b.charAt(b.length() - (maxLength - i)) : '0';
        }
        final char[] result = new char[maxLength + 1];
        char carryOver = '0';
        for (int i = maxLength; i >= 0; i--) {
            if (i == 0) {
                result[i] = carryOver == '0' ? ' ' : '1';
                break;
            }
            char aCurrent = aDigits[i - 1];
            char bCurrent = bDigits[i - 1];
            if (aCurrent == '1' && bCurrent == '1') {
                if (carryOver == '1') {
                    result[i] = '1';
                } else {
                    result[i] = '0';
                    carryOver = '1';
                }
            } else if ((aCurrent == '0' && bCurrent == '1') || (aCurrent == '1' && bCurrent == '0')) {
                if (carryOver == '1') {
                    result[i] = '0';
                } else {
                    result[i] = '1';
                }
            } else {
                if (carryOver == '1') {
                    result[i] = '1';
                    carryOver = '0';
                } else {
                    result[i] = '0';
                }
            }
        }
        return new String(result).trim();
    }
}
