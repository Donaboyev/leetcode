package q0013;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(sn.romanToInt("MCMXCIV"));
    }
}

class Solution {
    public int romanToInt(String s) {
        int a = 0, n = 0, p = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            n = switch (s.charAt(i)) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> n;
            };
            if (n < p) {
                a -= n;
            } else {
                a += n;
            }
            p = n;
        }
        return a;
    }
//    public int romanToInt(String s) {
//        final Map<Character, Integer> m = new HashMap<>();
//        m.put('I', 1);
//        m.put('V', 5);
//        m.put('X', 10);
//        m.put('L', 50);
//        m.put('C', 100);
//        m.put('D', 500);
//        m.put('M', 1000);
//        int a = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
//                a -= m.get(s.charAt(i));
//            } else {
//                a += m.get(s.charAt(i));
//            }
//        }
//        return a;
//    }
//    public int romanToInt(String s) {
//        int n = 0;
//        final char[] c = s.toCharArray();
//        for (int i = 0; i < c.length; i++) {
//            if (i < c.length - 1) {
//                final int su = s(c, i);
//                n -= su;
//                if (su != 0) {
//                    continue;
//                }
//            }
//            n += l2n(c[i]);
//        }
//        return n;
//    }

    //I can be placed before V (5) and X (10) to make 4 and 9.
    //X can be placed before L (50) and C (100) to make 40 and 90.
    //C can be placed before D (500) and M (1000) to make 400 and 900.
    private int s(char[] c, int i) {
        switch (c[i]) {
            case 'I':
                if (c[i + 1] == 'V' || c[i + 1] == 'X') {
                    return 1;
                }
                break;
            case 'X':
                if (c[i + 1] == 'L' || c[i + 1] == 'C') {
                    return 10;
                }
                break;
            case 'C':
                if (c[i + 1] == 'D' || c[i + 1] == 'M') {
                    return 100;
                }
                break;
            default:
                return 0;
        }
        return 0;
    }

    //I             1
    //V             5
    //X             10
    //L             50
    //C             100
    //D             500
    //M             1000
    private int l2n(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
