package java.q0009;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(sn.isPalindrome(2002));
    }
}

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int temp = x;
        int reversed = 0;
        while (temp > 0) {
            reversed = reversed * 10 + temp % 10;
            temp = temp / 10;
        }
        return reversed == x;
    }
//    public boolean isPalindrome(int x) {
//        if (x < 0) {
//            return false;
//        }
//        final char[] digits = String.valueOf(x).toCharArray();
//        final int length = digits.length;
//        for (int i = 0; i < length / 2; i++) {
//            if (digits[i] != digits[length - 1 - i]) {
//                return false;
//            }
//        }
//        return true;
//    }
}
