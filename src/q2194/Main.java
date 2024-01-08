package q2194;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final Solution sl = new Solution();
        System.out.println(sl.cellsInRange("K1:L2"));
    }
}

class Solution {
    public List<String> cellsInRange(String s) {
        final char fl = s.charAt(0);
        final char sl = s.charAt(3);
        final int fn = s.charAt(1) - '0';
        final int sn = s.charAt(4) - '0';
        final List<String> c = new ArrayList<>();
        StringBuilder b;
        for (char i = fl; i <= sl; i++) {
            for (int j = fn; j <= sn; j++) {
                b = new StringBuilder();
                b.append(i).append(j);
                c.add(b.toString());
            }
        }
        return c;
    }
//    public List<String> cellsInRange(String s) {
//        final char fl = s.charAt(0);
//        final char sl = s.charAt(3);
//        final char fn = s.charAt(1);
//        final char sn = s.charAt(4);
//        final List<String> c = new ArrayList<>();
//        for (char i = fl; i <= sl; i++) {
//            for (char j = fn; j <= sn; j++) {
//                c.add(String.valueOf(i) + j);
//            }
//        }
//        return c;
//    }
}
