package q2839;

public class Main {
    public static void main(String[] args) {
        final Solution sl = new Solution();
        System.out.println(sl.canBeEqual("abcd", "dacb"));
    }
}

class Solution {
    public boolean canBeEqual(String s1, String s2) {
        final char s10 = s1.charAt(0);
        final char s11 = s1.charAt(1);
        final char s12 = s1.charAt(2);
        final char s13 = s1.charAt(3);
        final char s20 = s2.charAt(0);
        final char s21 = s2.charAt(1);
        final char s22 = s2.charAt(2);
        final char s23 = s2.charAt(3);
        return (s10 == s20 && s11 == s21 && s12 == s22 && s13 == s23)
                || (s12 == s20 && s11 == s21 && s10 == s22 && s13 == s23)
                || (s12 == s20 && s13 == s21 && s10 == s22 && s11 == s23)
                || (s10 == s20 && s13 == s21 && s12 == s22 && s11 == s23);
    }
//    public boolean canBeEqual(String s1, String s2) {
//        final byte s10 = (byte) s1.charAt(0);
//        final byte s11 = (byte) s1.charAt(1);
//        final byte s12 = (byte) s1.charAt(2);
//        final byte s13 = (byte) s1.charAt(3);
//        final byte s20 = (byte) s2.charAt(0);
//        final byte s21 = (byte) s2.charAt(1);
//        final byte s22 = (byte) s2.charAt(2);
//        final byte s23 = (byte) s2.charAt(3);
//        return (s10 == s20 && s11 == s21 && s12 == s22 && s13 == s23)
//                || (s12 == s20 && s11 == s21 && s10 == s22 && s13 == s23)
//                || (s12 == s20 && s13 == s21 && s10 == s22 && s11 == s23)
//                || (s10 == s20 && s13 == s21 && s12 == s22 && s11 == s23);
//    }
//    public boolean canBeEqual(String s1, String s2) {
//        if (Objects.equals(s1, s2)) {
//            return true;
//        }
//        final StringBuilder builder = new StringBuilder(4);
//        builder
//                .append(s1.charAt(2))
//                .append(s1.charAt(1))
//                .append(s1.charAt(0))
//                .append(s1.charAt(3));
//        if (Objects.equals(builder.toString(), s2)) {
//            return true;
//        }
//        builder.setCharAt(1, s1.charAt(3));
//        builder.setCharAt(3, s1.charAt(1));
//        if (Objects.equals(builder.toString(), s2)) {
//            return true;
//        }
//        builder.setCharAt(0, s1.charAt(0));
//        builder.setCharAt(2, s1.charAt(2));
//        return Objects.equals(builder.toString(), s2);
//    }
}
