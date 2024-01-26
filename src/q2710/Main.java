package q2710;

public class Main {
    public static void main(String[] args) {
        final Solution sl = new Solution();
        System.out.println(sl.removeTrailingZeros("0"));
    }
}

class Solution {
    public String removeTrailingZeros(String num) {
        final char[] digits = num.toCharArray();
        int lastIndex = digits.length - 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != '0') {
                lastIndex = i;
                break;
            }
        }
        return num.substring(0, lastIndex + 1);
    }
//    public String removeTrailingZeros(String num) {
//        if (Objects.equals(num, "0")) {
//            return "";
//        }
//        final char[] digits = num.toCharArray();
//        int i = 0;
//        while (digits[digits.length - 1 - i] == '0' && i < digits.length - 1) {
//            i++;
//        }
//        return num.substring(0, digits.length - i);
//    }
}
