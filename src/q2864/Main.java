package q2864;

public class Main {
    public static void main(String[] args) {
        final Solution sl = new Solution();
        System.out.println(sl.maximumOddBinaryNumber("0101"));
    }
}

class Solution {
    public String maximumOddBinaryNumber(String s) {
        final char[] letters = s.toCharArray();
        char[] temp = new char[letters.length];
        int count = 0;
        for (final char letter : letters) {
            if (letter == '1') {
                count++;
            }
        }
        temp[temp.length - 1] = '1';
        int zero = temp.length - count;
        for (int i = temp.length - 2; i >= 0; i--) {
            if (zero > 0) {
                temp[i] = '0';
                zero--;
            } else {
                temp[i] = '1';
            }
        }
        return new String(temp);
    }
}
