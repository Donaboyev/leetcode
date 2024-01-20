package q2810;

public class Main {
    public static void main(String[] args) {
        final Solution sl = new Solution();
        System.out.println(sl.finalString("string"));
    }
}

class Solution {
    public String finalString(String s) {
        final char[] letters = s.toCharArray();
        char[] result = new char[letters.length];
        int index = 0;
        for (final char i : letters) {
            if (i == 'i') {
                int start = 0;
                int end = index - 1;
                while (start < end) {
                    final char temp = result[start];
                    result[start] = result[end];
                    result[end] = temp;
                    start++;
                    end--;
                }
            } else {
                result[index] = i;
                index++;
            }
        }
        return new String(result, 0, index);
    }
//    public String finalString(String s) {
//        final char[] l = s.toCharArray();
//        final StringBuilder b = new StringBuilder();
//        for (final char i : l) {
//            if (i == 'i') {
//                b.reverse();
//            } else {
//                b.append(i);
//            }
//        }
//        return b.toString();
//    }
}
