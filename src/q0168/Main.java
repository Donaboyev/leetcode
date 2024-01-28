package q0168;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(sn.convertToTitle(701));
    }
}

class Solution {
    public String convertToTitle(int columnNumber) {
        final StringBuilder builder = new StringBuilder();
        while (columnNumber > 1) {
            final int mod = columnNumber % 26;
            System.out.println(mod);
            columnNumber = columnNumber / 26;
            System.out.println(columnNumber);
        }
        return builder.toString();
    }
}
