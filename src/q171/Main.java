package q171;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(sn.titleToNumber("ZY"));
    }
}

class Solution {
    public int titleToNumber(String columnTitle) {
        final char[] letters = columnTitle.toCharArray();
        int number = 0;
        for (int i = letters.length-1; i >=0 ; i--) {
//            number+= 26 * (letters.length-1)
        }
        number = letters[letters.length - 1] - 'A' + 1 + 26 * (letters.length - 1);

        return number;
    }
}
