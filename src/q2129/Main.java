package q2129;

public class Main {
    public static void main(String[] args) {
        final Solution sl = new Solution();
        System.out.println(sl.capitalizeTitle("i lOve leetcode"));
    }
}

class Solution {
    public String capitalizeTitle(String title) {
        char[] c = title.toCharArray();
        for (int i = 0; i < c.length; i++) {
            final int f = i;
            while (i < c.length && c[i] != ' ') {
                c[i] = Character.toLowerCase(c[i]);
                i++;
            }
            if (i - f > 2) {
                c[f] = Character.toUpperCase(c[f]);
            }
        }
        return String.valueOf(c);
    }
//    public String capitalizeTitle(String title) {
//        final String[] w = title.toLowerCase().split(" ");
//        final StringBuilder s = new StringBuilder();
//        for (final String i : w) {
//            if (i.length() > 2) {
//                s.append((char) (i.charAt(0) - 'a' + 'A')).append(i.substring(1)).append(' ');
//            } else {
//                s.append(i).append(' ');
//            }
//        }
//        return s.toString().trim();
//    }
//    public String capitalizeTitle(String title) {
//        final String[] w = title.toLowerCase().split(" ");
//        final StringBuilder s = new StringBuilder(w.length);
//        for (final String i : w) {
//            if (i.length() > 2) {
//                s.append(String.valueOf(i.charAt(0)).toUpperCase()).append(i.substring(1)).append(' ');
//            } else {
//                s.append(i).append(' ');
//            }
//        }
//        return s.toString().trim();
//    }
}
