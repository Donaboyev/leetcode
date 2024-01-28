package q0412;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(sn.addStrings("11", "123"));
    }
}

class Solution {
    public String addStrings(String num1, String num2) {
        final int maxLength = Math.max(num1.length(), num2.length());
        final char[] firstDigits = new char[maxLength];
        final char[] secondDigits = new char[maxLength];
        for (int i = maxLength - 1; i >= 0; i--) {
            firstDigits[i] = (num1.length() - (maxLength - i) >= 0) ? num1.charAt(num1.length() - (maxLength - i)) : '0';
        }
        for (int i = maxLength - 1; i >= 0; i--) {
            secondDigits[i] = (num2.length() - (maxLength - i) >= 0) ? num2.charAt(num2.length() - (maxLength - i)) : '0';
        }
        final char[] result = new char[maxLength + 1];
        int carryOver = 0;
        for (int i = result.length - 1; i >= 0; i--) {
            if (i == 0) {
                if (carryOver != 0) {
                    result[i] = (char) (carryOver + '0');
                }
                break;
            }
            final int current = Integer.parseInt(String.valueOf(firstDigits[i - 1]))
                    + Integer.parseInt(String.valueOf(secondDigits[i - 1]))
                    + carryOver;
            if (current > 9) {
                result[i] = (char) (current % 10 + '0');
                carryOver = current / 10;
            } else {
                result[i] = (char) (current + '0');
                carryOver = 0;
            }
        }
        return (new String(result)).trim();
    }
}
