package q2011;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(sn.finalValueAfterOperations(new String[]{"--X", "X++", "X++"}));
    }
}

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (final String o : operations) {
            if (o.charAt(1) == '+') {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }
}