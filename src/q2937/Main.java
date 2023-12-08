package q2937;

public class Main {
    public static void main(String[] args) {
        final Solution sl = new Solution();
        System.out.println(sl.findMinimumOperations("ab", "ab", "abc"));
    }
}

class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        final int m = Math.min(Math.min(s1.length(), s2.length()), s3.length());
        int c = 0;
        for (int i = 0; i < m; i++) {
            if (s1.charAt(i) == s2.charAt(i) && s1.charAt(i) == s3.charAt(i)) {
                c++;
                continue;
            }
            break;
        }
        return c > 0 ? (s1.length() + s2.length() + s3.length() - 3 * c) : -1;
    }
//    public int findMinimumOperations(String s1, String s2, String s3) {
//        int m = s1.length();
//        final int t = m > s2.length() ? s2.length() : m;
//        m = t > s3.length() ? s3.length() : t;
//        int c = 0;
//        final char[] s1c = s1.toCharArray();
//        final char[] s2c = s2.toCharArray();
//        final char[] s3c = s3.toCharArray();
//        for (int i = 0; i < m; i++) {
//            if (s1c[i] == s2c[i] && s1c[i] == s3c[i]) {
//                c++;
//                continue;
//            }
//            break;
//        }
//        int a = -1;
//        if (c > 0) {
//            a = s1.length() + s2.length() + s3.length() - 3 * c;
//        }
//        return a;
//    }

    /**
     * Optimal solution
     */
//    public int findMinimumOperations(String s1, String s2, String s3) {
//        final int m = Math.min(Math.min(s1.length(), s2.length()), s3.length());
//        int c = 0;
//        for (int i = 0; i < m; i++) {
//            if (s1.charAt(i) == s2.charAt(i) && s1.charAt(i) == s3.charAt(i)) {
//                c++;
//                continue;
//            }
//            break;
//        }
//        int a = -1;
//        if (c > 0) {
//            a = s1.length() + s2.length() + s3.length() - 3 * c;
//        }
//        return a;
//    }
//    public int findMinimumOperations(String s1, String s2, String s3) {
//        if (s1.charAt(0) != s2.charAt(0) || s1.charAt(0) != s3.charAt(0)) {
//            return -1;
//        }
//        int c = 0;
//        final int m = Math.min(Math.min(s1.length(), s2.length()), s3.length());
//        for (int i = 1; i < m; i++) {
//            if (s1.charAt(i) == s2.charAt(i) && s1.charAt(i) == s3.charAt(i)) {
//                c++;
//                continue;
//            }
//            break;
//        }
//        return s1.length() + s2.length() + s3.length() - 3 - 3 * c;
//    }
//    public int findMinimumOperations(String s1, String s2, String s3) {
//        if (s1.charAt(0) != s2.charAt(0) || s1.charAt(0) != s3.charAt(0)) {
//            return -1;
//        }
//        int c = 0;
//        for (int i = 1; i < s1.length(); i++) {
//            if (i >= s2.length() || i >= s3.length()) {
//                break;
//            }
//            if (s1.charAt(i) == s2.charAt(i) && s1.charAt(i) == s3.charAt(i)) {
//                c++;
//                continue;
//            }
//            break;
//        }
//        return s1.length() + s2.length() + s3.length() - 3 - 3 * c;
//    }
}
