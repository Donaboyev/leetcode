package q1903;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(sn.largestOddNumber("23"));
    }
}

class Solution {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
//    public String largestOddNumber(String num) {
//        final int a = Integer.parseInt(String.valueOf(num.charAt(num.length() - 1)));
//        if (a % 2 == 1) {
//            return num;
//        }
//        if (num.length() == 1) {
//            return "";
//        }
//        for (int i = num.length() - 2; i >= 0; i--) {
//            final int b = Integer.parseInt(String.valueOf(num.charAt(i)));
//            if (b % 2 == 1) {
//                return num.substring(0, i + 1);
//            }
//        }
//        return "";
//    }
}