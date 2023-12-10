package q1678;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(sn.interpret("(al)G(al)()()G"));
    }
}

class Solution {
//    public String interpret(String command) {
//        final StringBuilder b = new StringBuilder(command.length());
//        final char[] c = command.toCharArray();
//        for (int i = 0; i < c.length; i++) {
//            if (c[i] == 'G') {
//                b.append('G');
//            } else if (c[i + 1] == ')') {
//                b.append('o');
//                i++;
//            } else {
//                b.append("al");
//                i += 3;
//            }
//        }
//        return b.toString();
//    }
//        public String interpret(String command) {
//        final StringBuilder b = new StringBuilder(command.length());
//        for (int i = 0; i < command.length(); i++) {
//            if (command.charAt(i) == 'G') {
//                b.append('G');
//                continue;
//            }
//            if (command.charAt(i + 1) == ')') {
//                b.append('o');
//                i++;
//            } else {
//                b.append("al");
//                i += 3;
//            }
//        }
//        return b.toString();
//    }
    public String interpret(String command) {
        final StringBuilder b = new StringBuilder();
        final char[] c = command.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'G') {
                b.append('G');
                continue;
            }
            if (c[i + 1] == ')') {
                b.append('o');
                i++;
            } else {
                b.append("al");
                i += 3;
            }
        }
        return b.toString();
    }
}