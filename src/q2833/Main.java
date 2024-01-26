package q2833;

public class Main {
    public static void main(String[] args) {
        final Solution sl = new Solution();
        System.out.println(sl.furthestDistanceFromOrigin("R_"));
    }
}

class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        final char[] characters = moves.toCharArray();
        int left = 0, right = 0, underscore = 0;
        for (final char letter : characters) {
            switch (letter) {
                case 'L':
                    left++;
                    break;
                case 'R':
                    right++;
                    break;
                case '_':
                    underscore++;
                    break;
            }
        }
        return Math.abs(left - right) + underscore;
    }
}
